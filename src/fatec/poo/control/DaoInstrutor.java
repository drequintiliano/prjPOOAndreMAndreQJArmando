
package fatec.poo.control;

import fatec.poo.model.Instrutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// @author Armando
 
public class DaoInstrutor {
    private Connection conn;
    
    public DaoInstrutor(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TB_INSTRUTOR(CPF_INSTRUTOR,NOME_INSTRUTOR,DATANASC_INSTRUTOR,"
                                        + "SEXO_INSTRUTOR,ESTADOCIVIL_INSTRUTOR,ENDERECO_INSTRUTOR,NUM_END_INSTRUTOR,"
                                        + "BAIRRO_INSTRUTOR,CEP_INSTRUTOR,CIDADE_INSTRUTOR,ESTADO_INSTRUTOR,"
                                        + "TELEFONE_INSTRUTOR,RG_INSTRUTOR,CELULAR_INSTRUTOR,FORMACAO_INSTRUTOR,"
                                        + "AREA_ATUACAO_INSTRUTOR,EMAIL_INSTRUTOR)"
                                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,  instrutor.getCpf());
            ps.setString(2,  instrutor.getNome());
            ps.setString(3,  instrutor.getDataNasc());
            ps.setString(4,  instrutor.getSexo());
            ps.setString(5,  instrutor.getEstadoCivil());            
            ps.setString(6,  instrutor.getEndereco());
            ps.setString(7,  instrutor.getNumero());
            ps.setString(8,  instrutor.getBairro());
            ps.setString(9,  instrutor.getCep());
            ps.setString(10, instrutor.getCidade());
            ps.setString(11, instrutor.getEstado());
            ps.setString(12, instrutor.getTelefone());
            ps.setString(13, instrutor.getRg());
            ps.setString(14, instrutor.getCelular());
            ps.setString(15, instrutor.getFormacao());
            ps.setString(16, instrutor.getAreaAtuacao());
            ps.setString(17, instrutor.getEmail());
                      
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TB_INSTRUTOR SET NOME_INSTRUTOR = ?,DATANASC_INSTRUTOR = ?,"
                                       + "SEXO_INSTRUTOR = ?,ESTADOCIVIL_INSTRUTOR = ?,ESCOLARIDAE_INSTRUTOR = ?,"
                                       + "ENDERECO_INSTRUTOR = ?,NUM_END_INSTRUTOR = ?,BAIRRO_INSTRUTOR = ?,"
                                       + "CEP_INSTRUTOR = ?,CIDADE_INSTRUTOR = ?,ESTADO_INSTRUTOR = ?,"
                                       + "TELEFONE_INSTRUTOR = ?,RG_INSTRUTOR = ?,CELULAR_INSTRUTOR = ?,"
                                       + "EMAIL_INSTRUTOR = ? WHERE CPF_INSTRUTOR = ?");
                                
            ps.setString(1,  instrutor.getNome());
            ps.setString(2,  instrutor.getDataNasc());
            ps.setString(3,  instrutor.getSexo());
            ps.setString(4,  instrutor.getEstadoCivil());            
            ps.setString(5,  instrutor.getEndereco());            
            ps.setString(6,  instrutor.getNumero());
            ps.setString(7,  instrutor.getBairro());            
            ps.setString(8,  instrutor.getCep());
            ps.setString(9,  instrutor.getCidade());
            ps.setString(10, instrutor.getEstado());
            ps.setString(11, instrutor.getTelefone());
            ps.setString(12, instrutor.getRg());
            ps.setString(13, instrutor.getCelular());
            ps.setString(14, instrutor.getFormacao());
            ps.setString(15, instrutor.getAreaAtuacao());
            ps.setString(16, instrutor.getEmail());
            ps.setString(17, instrutor.getCpf());
            
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Instrutor consultar (String CPF) {
        Instrutor Inst = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TB_INSTRUTOR WHERE CPF_INSTRUTOR = ?");
            
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                Inst = new Instrutor (CPF, rs.getString("NOME_INSTRUTOR"));
                
                Inst.setDataNasc(rs.getString("DATANASC_INSTRUTOR"));
                Inst.setSexo(rs.getString("SEXO_INSTRUTOR"));
                Inst.setEstadoCivil(rs.getString("ESTADOCIVIL_INSTRUTOR"));
                Inst.setEndereco(rs.getString("ENDERECO_INSTRUTOR"));
                Inst.setNumero(rs.getString("NUM_END_INSTRUTOR"));
                Inst.setBairro(rs.getString("BAIRRO_INSTRUTOR"));
                Inst.setCep(rs.getString("CEP_INSTRUTOR"));
                Inst.setCidade(rs.getString("CIDADE_INSTRUTOR"));
                Inst.setEstado(rs.getString("ESTADO_INSTRUTOR"));
                Inst.setTelefone(rs.getString("TELEFONE_INSTRUTOR"));
                Inst.setRg(rs.getString("RG_INSTRUTOR"));
                Inst.setCelular(rs.getString("CELULAR_INSTRUTOR"));
                Inst.setFormacao(rs.getString("FORMACAO_INSTRUTOR"));
                Inst.setAreaAtuacao(rs.getString("AREA_ATUACAO_INSTRUTOR"));
                Inst.setEmail(rs.getString("EMAIL_INSTRUTOR"));
                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (Inst);
    }    
     
     public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TB_INSTRUTOR WHERE CPF_INSTRUTOR = ?");
            
            ps.setString(1, instrutor.getCpf());
                      
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
