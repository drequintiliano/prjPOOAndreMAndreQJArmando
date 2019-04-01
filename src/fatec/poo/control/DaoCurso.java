
package fatec.poo.control;
import fatec.poo.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 // @author Armando

public class DaoCurso {
    private Connection conn;
    
    public DaoCurso(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TB_CURSO(SIGLACURSO,NOMECURSO,CARGAHRCURSO,"
                                     + "VALORCURSO,PRGCURSO,DATAVIGENCIACURSO,VALORHRINSTRUTOR)"
                                     + "VALUES(?,?,?,?,?,?,?)");
            
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setInt   (3, curso.getCargahoraria());
            ps.setDouble(4, curso.getValor());
            ps.setString(5, curso.getPrograma());
            ps.setString(6, curso.getDataVigencia());
            ps.setDouble(7, curso.getValorHoraInstrutor());
                      
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TB_CURSO SET NOMECURSO = ?, CARGAHRCURSO = ?, VALORCURSO = ?," 
                                       + "PRGCURSO = ?, DATAVIGENCIACURSO = ?, VALORHRINSTRUTOR = ? " 
                                       + "WHERE SIGLACURSO = ?");
            
            ps.setString(1, curso.getNome());            
            ps.setInt   (2, curso.getCargahoraria());
            ps.setDouble(3, curso.getValor());
            ps.setString(4, curso.getPrograma());
            ps.setString(5, curso.getDataVigencia());
            ps.setDouble(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getSigla());
            
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Curso consultar (String Sigla) {
        Curso c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TB_CURSO WHERE SIGLACURSO = ?");
            
            ps.setString(1, Sigla);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                c = new Curso (Sigla, rs.getString("NOMECURSO"));
                c.setCargahoraria(rs.getInt("CARGAHRCURSO"));
                c.setValor(rs.getDouble("VALORCURSO"));
                c.setPrograma(rs.getString("PRGCURSO"));
                c.setDataVigencia(rs.getString("DATAVIGENCIACURSO"));
                c.setValorHoraInstrutor(rs.getDouble("VALORHRINSTRUTOR"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }    
     
     public void excluir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TB_CURSO WHERE SIGLACURSO = ?");
            
            ps.setString(1, curso.getSigla());
                      
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
	
}
