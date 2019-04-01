package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Turma;
import javax.swing.JOptionPane;

// @author 0030481523020

public class GuiTurma extends javax.swing.JFrame {

    public GuiTurma() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNomeTurma = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cmboxSiglaCurso = new javax.swing.JComboBox<>();
        lblCidade = new javax.swing.JLabel();
        txtSiglaTurma = new javax.swing.JTextField();
        lblEstCivil = new javax.swing.JLabel();
        txtDtInicio = new javax.swing.JFormattedTextField();
        lblDtNasc = new javax.swing.JLabel();
        cmboxPeriodo = new javax.swing.JComboBox<>();
        lblCelular = new javax.swing.JLabel();
        txtDtTermino = new javax.swing.JFormattedTextField();
        txtQtdeVagas = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Turma");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCPF.setText("Curso");

        lblNome.setText("Nome");

        txtNomeTurma.setEnabled(false);
        txtNomeTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeTurmaActionPerformed(evt);
            }
        });

        lblSexo.setText("Sigla da turma");

        lblCidade.setText("Qtde de vagas");

        txtSiglaTurma.setEnabled(false);

        lblEstCivil.setText("Período");

        try {
            txtDtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  /  /    ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtInicio.setEnabled(false);

        lblDtNasc.setText("Data início");

        cmboxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        cmboxPeriodo.setEnabled(false);
        cmboxPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxPeriodoActionPerformed(evt);
            }
        });

        lblCelular.setText("Data término");

        try {
            txtDtTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  /  /    ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtTermino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtTermino.setEnabled(false);

        txtQtdeVagas.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblSexo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(lblDtNasc))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lblCidade)))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCelular)
                                        .addComponent(lblEstCivil))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmboxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDtTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmboxSiglaCurso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSiglaTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addComponent(txtNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboxSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblSexo))
                    .addComponent(txtSiglaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdeVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblCidade)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblDtNasc))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstCivil)
                            .addComponent(cmboxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDtTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelular))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTurmaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        turma = new Turma(txtSiglaTurma.getText(), txtNomeTurma.getText());
        turma.setQtdevagas(Integer.parseInt(txtQtdeVagas.getText()));        
        turma.setPeriodo(String.valueOf(cmboxPeriodo.getSelectedItem()));
        turma.setDataInicio(txtDtInicio.getText().replaceAll("\\/", ""));
        turma.setDataTermino(txtDtTermino.getText().replaceAll("\\/", ""));
        
        daoturma.inserir(turma);
         
        cmboxSiglaCurso.setSelectedItem("");
        txtSiglaTurma.setText("");
        txtNomeTurma.setText("");
        txtQtdeVagas.setText("");
        cmboxPeriodo.setSelectedItem("");
        txtDtInicio.setText("");
        txtDtTermino.setText("");        
        
        cmboxSiglaCurso.setEnabled(true);
        txtSiglaTurma.setEnabled(true);
        txtNomeTurma.setEnabled(false);
        txtQtdeVagas.setEnabled(false);
        cmboxPeriodo.setEnabled(false);
        txtDtInicio.setEnabled(false);
        txtDtTermino.setEnabled(false);
                
        txtSiglaTurma.requestFocus();
        
        txtNomeTurma.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void cmboxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxPeriodoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("System", "ar214532");
        //conexao = new Conexao("BD1523020", "BD1523020");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        //conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoturma = new DaoTurma(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoturma.excluir(turma);
            
            cmboxSiglaCurso.setSelectedItem("");
            txtSiglaTurma.setText("");
            txtNomeTurma.setText("");
            txtQtdeVagas.setText("");
            cmboxPeriodo.setSelectedItem("");            
            txtDtInicio.setText("");
            txtDtTermino.setText("");
            
            txtNomeTurma.requestFocus();
            
            cmboxSiglaCurso.setEnabled(true);
            txtSiglaTurma.setEnabled(true);
            txtNomeTurma.setEnabled(false);
            txtQtdeVagas.setEnabled(false);
            cmboxPeriodo.setEnabled(false);            
            txtDtInicio.setEnabled(false);
            txtDtTermino.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            txtSiglaTurma.requestFocus();
        }   
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){//Sim
           turma.setDescricao(txtNomeTurma.getText());
           turma.setQtdevagas(Integer.parseInt(txtQtdeVagas.getText()));
           turma.setPeriodo(String.valueOf(cmboxPeriodo.getSelectedItem()));
           turma.setDataInicio(txtDtInicio.getText().replaceAll("\\/", ""));
           turma.setDataTermino(txtDtTermino.getText().replaceAll("\\/", ""));
           
           daoturma.alterar(turma);
        } 
        
        cmboxSiglaCurso.setSelectedItem("");
        txtSiglaTurma.setText("");
        txtNomeTurma.setText("");
        txtQtdeVagas.setText("");
        cmboxPeriodo.setSelectedItem("");
        txtDtInicio.setText("");
        txtDtTermino.setText("");
            
        txtNomeTurma.requestFocus();
        
        cmboxSiglaCurso.setEnabled(true);
        txtNomeTurma.setEnabled(false);        
        txtQtdeVagas.setEnabled(false);
        cmboxPeriodo.setEnabled(false);
        txtDtInicio.setEnabled(false);
        txtDtTermino.setEnabled(false);        
        
        txtSiglaTurma.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        turma = null;
        turma = daoturma.consultar(txtSiglaTurma.getText());
       
       if (turma == null){
           cmboxSiglaCurso.setEnabled(false);
           txtSiglaTurma.setEnabled(false);
           txtNomeTurma.setEnabled(true);
           txtQtdeVagas.setEnabled(true);
           cmboxPeriodo.setEnabled(true);
           txtDtInicio.setEnabled(true);
           txtDtTermino.setEnabled(true);
           
           txtNomeTurma.requestFocus();
           
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{
           txtNomeTurma.setText(turma.getDescricao());
           txtQtdeVagas.setText(String.valueOf(turma.getQtdevagas()));
           cmboxPeriodo.setSelectedItem(turma.getPeriodo());
           txtDtInicio.setText(turma.getDataInicio());
           txtDtTermino.setText(turma.getDataTermino());
           
           txtNomeTurma.requestFocus();
           
           txtSiglaTurma.setEnabled(false);
           txtNomeTurma.setEnabled(true); 
           txtQtdeVagas.setEnabled(true);
           cmboxPeriodo.setEnabled(true);
           txtDtInicio.setEnabled(true);        
           txtDtTermino.setEnabled(true);
           
           txtNomeTurma.requestFocus();
           
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(false);
           btnAlterar.setEnabled(true);
           btnExcluir.setEnabled(true);
       }
    }//GEN-LAST:event_btnConsultarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmboxPeriodo;
    private javax.swing.JComboBox<String> cmboxSiglaCurso;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEstCivil;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JFormattedTextField txtDtInicio;
    private javax.swing.JFormattedTextField txtDtTermino;
    private javax.swing.JTextField txtNomeTurma;
    private javax.swing.JTextField txtQtdeVagas;
    private javax.swing.JTextField txtSiglaTurma;
    // End of variables declaration//GEN-END:variables
    private DaoTurma daoturma=null;
    private Turma    turma=null;
    private Conexao  conexao=null;
}
