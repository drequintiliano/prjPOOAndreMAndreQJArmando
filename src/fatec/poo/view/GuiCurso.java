
package fatec.poo.view;
import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.model.Curso;
import javax.swing.JOptionPane;

 // @author 0030481523020
 
public class GuiCurso extends javax.swing.JFrame {
    public GuiCurso() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSigla = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNomeCurso = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtVlrCurso = new javax.swing.JTextField();
        txtPgrCurso = new javax.swing.JTextField();
        txtDtVigencia = new javax.swing.JFormattedTextField();
        lblDtNasc = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        txtVlrHora = new javax.swing.JTextField();
        lblForm = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtSiglaCurso = new javax.swing.JTextField();
        txtCgHoraria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Curso");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblSigla.setText("Sigla curso");

        lblNome.setText("Nome curso");

        txtNomeCurso.setEnabled(false);
        txtNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCursoActionPerformed(evt);
            }
        });

        lblCidade.setText("Valor curso");

        txtVlrCurso.setEnabled(false);

        txtPgrCurso.setEnabled(false);

        try {
            txtDtVigencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtVigencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtVigencia.setEnabled(false);

        lblDtNasc.setText("Data de vigência");

        lblNum.setText("Valor hora instrutor");

        txtVlrHora.setEnabled(false);

        lblForm.setText("Programa do curso");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtCgHoraria.setEnabled(false);

        jLabel1.setText("Carga horária");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblForm)
                            .addComponent(lblSigla, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPgrCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCgHoraria, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtVlrCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVlrHora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDtNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSigla)
                    .addComponent(txtSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCgHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtDtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtNasc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVlrHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVlrCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPgrCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForm))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCursoActionPerformed
    }//GEN-LAST:event_txtNomeCursoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        curso = new Curso(txtSiglaCurso.getText(), txtNomeCurso.getText());
        curso.setCargahoraria(Integer.parseInt(txtCgHoraria.getText()));
        curso.setValor(Double.parseDouble(txtVlrCurso.getText()));
        curso.setPrograma(txtPgrCurso.getText());
        curso.setDataVigencia(txtDtVigencia.getText().replaceAll("\\/", ""));
        curso.setValorHoraInstrutor(Double.parseDouble(txtVlrHora.getText()));
        daocurso.inserir(curso);
         
        txtSiglaCurso.setText("");
        txtNomeCurso.setText("");
        txtCgHoraria.setText("");
        txtVlrCurso.setText("");
        txtPgrCurso.setText("");
        txtDtVigencia.setText("");
        txtVlrHora.setText("");
        
        txtSiglaCurso.setEnabled(true);
        txtNomeCurso.setEnabled(false);
        txtCgHoraria.setEnabled(false);
        txtVlrCurso.setEnabled(false);
        txtPgrCurso.setEnabled(false);
        txtDtVigencia.setEnabled(false);
        txtVlrHora.setEnabled(false);
        
        txtSiglaCurso.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       conexao.fecharConexao();
       dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        curso = null;
        curso = daocurso.consultar(txtSiglaCurso.getText());
       
       if (curso == null){
           txtSiglaCurso.setEnabled(false);
           txtNomeCurso.setEnabled(true);
           txtCgHoraria.setEnabled(true);
           txtVlrCurso.setEnabled(true);
           txtPgrCurso.setEnabled(true);
           txtDtVigencia.setEnabled(true);
           txtVlrHora.setEnabled(true);
           
           txtNomeCurso.requestFocus();
           
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{
          txtNomeCurso.setText(curso.getNome());
          txtCgHoraria.setText(String.valueOf(curso.getCargahoraria()));
          txtVlrCurso.setText(String.valueOf(curso.getValor()));
          txtPgrCurso.setText(curso.getPrograma());
          txtDtVigencia.setText(curso.getDataVigencia());
          txtVlrHora.setText(String.valueOf(curso.getValor()));
          
          txtNomeCurso.requestFocus();          
          
          txtSiglaCurso.setEnabled(false);
          txtNomeCurso.setEnabled(true); 
          txtCgHoraria.setEnabled(true);
          txtVlrCurso.setEnabled(true);
          txtPgrCurso.setEnabled(true);        
          txtDtVigencia.setEnabled(true);
          txtVlrHora.setEnabled(true);
          
          txtNomeCurso.requestFocus();
          
          btnConsultar.setEnabled(false);
          btnInserir.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
       }    
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("System", "ar214532");
        //conexao = new Conexao("BD1523020", "BD1523020");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        //conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daocurso = new DaoCurso(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daocurso.excluir(curso); 
            
            txtSiglaCurso.setText("");
            txtNomeCurso.setText("");
            txtCgHoraria.setText("");
            txtVlrCurso.setText("");
            txtPgrCurso.setText("");
            txtDtVigencia.setText("");
            txtVlrHora.setText("");
            
            txtSiglaCurso.requestFocus();
            
            txtSiglaCurso.setEnabled(true);
            txtNomeCurso.setEnabled(false);
            txtCgHoraria.setEnabled(false);
            txtVlrCurso.setEnabled(false);
            txtPgrCurso.setEnabled(false);
            txtDtVigencia.setEnabled(false);
            txtVlrHora.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            txtSiglaCurso.requestFocus();
        }    
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){//Sim
           curso.setNome(txtNomeCurso.getText());
           curso.setCargahoraria(Integer.parseInt(txtCgHoraria.getText()));
           curso.setValor(Double.parseDouble(txtVlrCurso.getText()));
           curso.setPrograma(txtPgrCurso.getText());
           curso.setDataVigencia(txtDtVigencia.getText().replaceAll("\\/", ""));
           curso.setValorHoraInstrutor(Double.parseDouble(txtVlrHora.getText()));
           
           daocurso.alterar(curso);
        } 
        
        txtSiglaCurso.setText("");
        txtNomeCurso.setText("");
        txtCgHoraria.setText("");
        txtVlrCurso.setText("");
        txtPgrCurso.setText("");
        txtDtVigencia.setText("");
        txtVlrHora.setText("");        
        
        txtSiglaCurso.setEnabled(true);
        txtNomeCurso.setEnabled(false);        
        txtCgHoraria.setEnabled(false);
        txtVlrCurso.setEnabled(false);
        txtPgrCurso.setEnabled(false);
        txtDtVigencia.setEnabled(false);
        txtVlrHora.setEnabled(false);
        
        txtSiglaCurso.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    
    }//GEN-LAST:event_btnAlterarActionPerformed
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblSigla;
    private javax.swing.JTextField txtCgHoraria;
    private javax.swing.JFormattedTextField txtDtVigencia;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtPgrCurso;
    private javax.swing.JTextField txtSiglaCurso;
    private javax.swing.JTextField txtVlrCurso;
    private javax.swing.JTextField txtVlrHora;
    // End of variables declaration//GEN-END:variables
    private DaoCurso daocurso=null;
    private Curso    curso=null;
    private Conexao conexao=null;
}
