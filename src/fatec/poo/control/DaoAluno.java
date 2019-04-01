
package fatec.poo.control;

//@author Armando

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoAluno {
    
    private Connection conn;
    
    public DaoAluno(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TB_ALUNO(CPF_ALUNO,NOME_ALUNO,DATANASC_ALUNO,SEXO_ALUNO,"
                                        + "ESTADOCIVIL_ALUNO,ESCOLARIDAE_ALUNO,ENDERECO_ALUNO,NUM_END_ALUNO,"
                                        + "BAIRRO_ALUNO,CEP_ALUNO,CIDADE_ALUNO,ESTADO_ALUNO,TELEFONE_ALUNO,"
                                        + "RG_ALUNO,CELULAR_ALUNO,EMAIL_ALUNO)"
                                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,  aluno.getCpf());
            ps.setString(2,  aluno.getNome());
            ps.setString(3,  aluno.getDataNasc());
            ps.setString(4,  aluno.getSexo());
            ps.setString(5,  aluno.getEstadoCivil());
            ps.setString(6,  aluno.getEscolaridade());
            ps.setString(7,  aluno.getEndereco());            
            ps.setString(8,  aluno.getNumero());
            ps.setString(9,  aluno.getBairro());            
            ps.setString(10, aluno.getCep());
            ps.setString(11, aluno.getCidade());
            ps.setString(12, aluno.getEstado());
            ps.setString(13, aluno.getTelefone());
            ps.setString(14, aluno.getRg());
            ps.setString(15, aluno.getCelular());
            ps.setString(16, aluno.getEmail());
                      
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TB_ALUNO SET NOME_ALUNO = ?,DATANASC_ALUNO = ?,SEXO_ALUNO = ?," 
                                       + "ESTADOCIVIL_ALUNO = ?,ESCOLARIDAE_ALUNO = ?,ENDERECO_ALUNO = ?,"
                                       + "NUM_END_ALUNO = ?,BAIRRO_ALUNO = ?,CEP_ALUNO = ?,CIDADE_ALUNO = ?,"
                                       + "ESTADO_ALUNO = ?,TELEFONE_ALUNO = ?,RG_ALUNO = ?,CELULAR_ALUNO = ?,"
                                       + "EMAIL_ALUNO = ? WHERE CPF_ALUNO = ?");
                                
            ps.setString(1,  aluno.getNome());
            ps.setString(2,  aluno.getDataNasc());
            ps.setString(3,  aluno.getSexo());
            ps.setString(4,  aluno.getEstadoCivil());
            ps.setString(5,  aluno.getEscolaridade());
            ps.setString(6,  aluno.getEndereco());            
            ps.setString(7,  aluno.getNumero());
            ps.setString(8,  aluno.getBairro());            
            ps.setString(9,  aluno.getCep());
            ps.setString(10, aluno.getCidade());
            ps.setString(11, aluno.getEstado());
            ps.setString(12, aluno.getTelefone());
            ps.setString(13, aluno.getRg());
            ps.setString(14, aluno.getCelular());
            ps.setString(15, aluno.getEmail());
            ps.setString(16, aluno.getCpf());
            
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Aluno consultar (String CPF) {
        Aluno Al = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TB_ALUNO WHERE CPF_ALUNO = ?");
            
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                Al = new Aluno (CPF, rs.getString("NOME_ALUNO"));
                
                Al.setDataNasc(rs.getString("DATANASC_ALUNO"));
                Al.setSexo(rs.getString("SEXO_ALUNO"));
                Al.setEstadoCivil(rs.getString("ESTADOCIVIL_ALUNO"));
                Al.setEscolaridade(rs.getString("ESCOLARIDAE_ALUNO"));
                Al.setEndereco(rs.getString("ENDERECO_ALUNO"));
                Al.setNumero(rs.getString("NUM_END_ALUNO"));
                Al.setBairro(rs.getString("BAIRRO_ALUNO"));                
                Al.setCep(rs.getString("CEP_ALUNO"));
                Al.setCidade(rs.getString("CIDADE_ALUNO"));
                Al.setEstado(rs.getString("ESTADO_ALUNO"));
                Al.setTelefone(rs.getString("TELEFONE_ALUNO"));
                Al.setRg(rs.getString("RG_ALUNO"));
                Al.setCelular(rs.getString("CELULAR_ALUNO"));
                Al.setEmail(rs.getString("EMAIL_ALUNO"));
                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (Al);
    }    
     
     public void excluir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TB_ALUNO WHERE CPF_ALUNO = ?");
            
            ps.setString(1, aluno.getCpf());
                      
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}

