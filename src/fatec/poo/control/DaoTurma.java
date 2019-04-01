
package fatec.poo.control;

import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 // @author Armando
 
public class DaoTurma {
    private Connection conn;
    
    public DaoTurma(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TB_TURMA(SIGLA_TURMA, NOME_TURMA, QTDE_VAGAS_TURMA,"
                                      + "PERIODO_TURMA, DATA_INICIO_TURMA, DATA_TERMINO_TURMA"
                                      + "VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getDescricao());
            ps.setInt   (3, turma.getQtdevagas());
            ps.setString(4, turma.getPeriodo());
            ps.setString(5, turma.getDataInicio());
            ps.setString(6, turma.getDataTermino());
                      
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TB_TURMA SET NOME_TURMA = ?, QTDE_VAGAS_TURMA = ?, PERIODO_TURMA = ?," 
                                       + "DATA_INICIO_TURMA = ?, DATA_TERMINO_TURMA = ? WHERE SIGLA_TURMA = ?");
            
            ps.setString(1, turma.getDescricao());            
            ps.setInt   (2, turma.getQtdevagas());
            ps.setString(3, turma.getPeriodo());
            ps.setString(4, turma.getDataInicio());
            ps.setString(5, turma.getDataTermino());
            ps.setString(7, turma.getSiglaTurma());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Turma consultar (String Sigla) {
        Turma t = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TB_TURMA WHERE SIGLA_TURMA = ?");
            
            ps.setString(1, Sigla);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                t = new Turma (Sigla, rs.getString("NOME_TURMA"));
                t.setQtdevagas(rs.getInt("QTDE_VAGAS_TURMA"));
                t.setPeriodo(rs.getString("PERIODO_TURMA"));
                t.setDataInicio(rs.getString("DATA_INICIO_TURMA"));
                t.setDataTermino(rs.getString("DATA_TERMINO_TURMA"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (t);
    }    
     
     public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TB_TURMA WHERE SIGLA_TURMA = ?");
            
            ps.setString(1, turma.getSiglaTurma());
                      
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
