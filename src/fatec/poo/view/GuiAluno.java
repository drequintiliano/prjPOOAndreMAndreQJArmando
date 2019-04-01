
package fatec.poo.view;
// @author 0030481523020

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAluno;
import fatec.poo.model.Aluno;
import fatec.poo.model.Pessoa;
import javax.swing.JOptionPane;

 
public class GuiAluno extends javax.swing.JFrame {
   public GuiAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCPF = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cmboxSexo = new javax.swing.JComboBox<>();
        lblEnd = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cmboxEstado = new javax.swing.JComboBox<>();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        lblEstCivil = new javax.swing.JLabel();
        txtDtNasc = new javax.swing.JFormattedTextField();
        lblDtNasc = new javax.swing.JLabel();
        cmboxEstCivil = new javax.swing.JComboBox<>();
        lblNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        lblTelRes = new javax.swing.JLabel();
        txtTelRes = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblEstCivil1 = new javax.swing.JLabel();
        cmboxEscolaridade = new javax.swing.JComboBox<>();
        txtRG = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Aluno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   .   .   -  ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCPF.setText("CPF");

        lblNome.setText("Nome");

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblSexo.setText("Sexo");

        cmboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cmboxSexo.setEnabled(false);

        lblEnd.setText("Endereço");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        lblEstado.setText("Estado");

        cmboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cmboxEstado.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtBairro.setEnabled(false);

        lblRG.setText("RG");

        lblEstCivil.setText("Estado Civil");

        try {
            txtDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  /  /    ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtNasc.setEnabled(false);

        lblDtNasc.setText("Data Nascto");

        cmboxEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solterio(a)", "Casado(a)", "União_Estável", "Divorciado(a)", "Viúvo(a)" }));
        cmboxEstCivil.setEnabled(false);

        lblNum.setText("Nº");

        txtNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum.setEnabled(false);

        lblCEP.setText("CEP");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("     -   ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCEP.setEnabled(false);

        lblTelRes.setText("Tel. Res");

        try {
            txtTelRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(  )    -    ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelRes.setEnabled(false);

        lblCelular.setText("Celular");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(  )     -    ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setEnabled(false);

        txtCidade.setEnabled(false);

        txtEmail.setEnabled(false);

        lblemail.setText("Email");

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

        lblEstCivil1.setText("Escolaridade");

        cmboxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fundamental", "Ensino_Médio", "Técnico_Profissionalizante", "Superior_Incompleto", "Superior_Completo", "Mestrado", "Doutorado" }));
        cmboxEscolaridade.setEnabled(false);

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  .   .   -  ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRG.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblemail)
                            .addComponent(lblRG)
                            .addComponent(lblCidade)
                            .addComponent(lblBairro)
                            .addComponent(lblEnd)
                            .addComponent(lblSexo)
                            .addComponent(lblNome)
                            .addComponent(lblCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblEstCivil)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmboxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblEstCivil1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmboxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblDtNasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(113, 113, 113))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCEP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCelular)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTelRes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnSair});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBairro, txtEmail, txtEndereco, txtNome});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmboxEscolaridade, txtCEP, txtCelular, txtTelRes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDtNasc))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(cmboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstCivil)
                            .addComponent(cmboxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmboxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstCivil1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnd)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBairro)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCEP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado)
                            .addComponent(cmboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCidade))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRG)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelRes)
                            .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBairro, txtEmail, txtEndereco, txtNome});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmboxEscolaridade, txtCEP, txtCelular, txtDtNasc, txtNum, txtTelRes});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        aluno = new Aluno(txtCPF.getText().replaceAll("\\.-", ""), txtNome.getText());
        aluno.setDataNasc(txtDtNasc.getText().replaceAll("\\/", ""));
        aluno.setSexo(String.valueOf(cmboxSexo.getSelectedItem()));        
        aluno.setEstadoCivil(String.valueOf(cmboxEstCivil.getSelectedItem()));
        aluno.setEscolaridade(String.valueOf(cmboxEscolaridade.getSelectedItem()));
        aluno.setEndereco(txtEndereco.getText());
        aluno.setNumero(txtNum.getText());
        aluno.setBairro(txtBairro.getText());
        aluno.setCep(txtCEP.getText().replaceAll("-", ""));
        aluno.setCidade(txtCidade.getText());
        aluno.setEstado(String.valueOf(cmboxEstado.getSelectedItem()));
        aluno.setTelefone(txtTelRes.getText().replaceAll("()-", ""));
        aluno.setRg(txtRG.getText().replaceAll("\\.", ""));
        aluno.setCelular(txtCelular.getText().replaceAll("()-", ""));
        aluno.setEmail(txtEmail.getText());
        
        daoaluno.inserir(aluno);
         
        txtCPF.setText("");
        txtNome.setText("");
        txtDtNasc.setText("");
        cmboxSexo.setSelectedItem("");
        cmboxEstCivil.setSelectedItem("");
        cmboxEscolaridade.setSelectedItem("");
        txtEndereco.setText("");
        txtNum.setText("");
        txtBairro.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        cmboxEstado.setSelectedItem("");
        txtTelRes.setText("");
        txtRG.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtDtNasc.setEnabled(false);
        cmboxSexo.setEnabled(false);
        cmboxEstCivil.setEnabled(false);
        cmboxEscolaridade.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNum.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCEP.setEnabled(false);
        txtCidade.setEnabled(false);
        cmboxEstado.setEnabled(false);
        txtTelRes.setEnabled(false);
        txtRG.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
        
        txtCPF.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        aluno = null;
        
        if(Pessoa.validarCPF(txtCPF.getText().replaceAll("\\.-", ""))){
            JOptionPane.showInputDialog("CPF Válido!");
        
            aluno = daoaluno.consultar(txtCPF.getText());
       
            if (aluno == null){
                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtDtNasc.setEnabled(true);
                cmboxSexo.setEnabled(true);
                cmboxEstCivil.setEnabled(true);
                cmboxEscolaridade.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNum.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCEP.setEnabled(true);
                txtCidade.setEnabled(true);
                cmboxEstado.setEnabled(true);
                txtTelRes.setEnabled(true);
                txtRG.setEnabled(true);
                txtCelular.setEnabled(true);
                txtEmail.setEnabled(true);
                
                txtNome.requestFocus();
                
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            }
            else{
                txtNome.setText(aluno.getNome());
                txtDtNasc.setText(aluno.getDataNasc());
                cmboxSexo.setSelectedItem(aluno.getSexo());
                cmboxEstCivil.setSelectedItem(aluno.getEstadoCivil());
                cmboxEscolaridade.setSelectedItem(aluno.getEscolaridade());
                txtEndereco.setText(aluno.getEndereco());
                txtNum.setText(aluno.getNumero());
                txtBairro.setText(aluno.getBairro());
                txtCEP.setText(aluno.getCep());
                txtCidade.setText(aluno.getCidade());
                cmboxEstado.setSelectedItem(aluno.getEstado());
                txtTelRes.setText(aluno.getTelefone());
                txtRG.setText(aluno.getRg());
                txtCelular.setText(aluno.getCelular());
                txtEmail.setText(aluno.getEmail());
                
                txtNome.requestFocus();
                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtDtNasc.setEnabled(true);
                cmboxSexo.setEnabled(true);
                cmboxEstCivil.setEnabled(true);
                cmboxEscolaridade.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNum.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCEP.setEnabled(true);
                txtCidade.setEnabled(true);
                cmboxEstado.setEnabled(true);
                txtTelRes.setEnabled(true);
                txtRG.setEnabled(true);
                txtCelular.setEnabled(true);
                txtEmail.setEnabled(true);
                
                txtNome.requestFocus();
                
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
            }else{
                JOptionPane.showInputDialog("CPF Inválido!");
                
                txtCPF.requestFocus();
                txtCPF.setText("");
                txtCPF.setEnabled(true);
                btnConsultar.setEnabled(true);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("System", "ar214532");
        //conexao = new Conexao("BD1523020", "BD1523020");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        //conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoaluno = new DaoAluno(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoaluno.excluir(aluno); 
            
            txtCPF.setText("");
            txtNome.setText("");
            txtDtNasc.setText("");
            cmboxSexo.setSelectedItem("");
            cmboxEstCivil.setSelectedItem("");
            cmboxEscolaridade.setSelectedItem("");
            txtEndereco.setText("");
            txtNum.setText("");
            txtBairro.setText("");
            txtCEP.setText("");
            txtCidade.setText("");
            cmboxEstado.setSelectedItem("");
            txtTelRes.setText("");
            txtRG.setText("");
            txtCelular.setText("");
            txtEmail.setText("");
            
            txtCPF.requestFocus();
            
            txtCPF.setEnabled(true);
            txtNome.setEnabled(false);
            txtDtNasc.setEnabled(false);
            cmboxSexo.setEnabled(false);
            cmboxEstCivil.setEnabled(false);
            cmboxEscolaridade.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtNum.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCEP.setEnabled(false);
            txtCidade.setEnabled(false);
            cmboxEstado.setEnabled(false);
            txtTelRes.setEnabled(false);
            txtRG.setEnabled(false);
            txtCelular.setEnabled(false);
            txtEmail.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            txtCPF.requestFocus();
        }    
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){//Sim
           aluno.setNome(txtNome.getText());
           aluno.setDataNasc(txtDtNasc.getText().replaceAll("\\.-", ""));
           aluno.setSexo(String.valueOf(cmboxSexo.getSelectedItem()));
           aluno.setEstadoCivil(String.valueOf(cmboxEstCivil.getSelectedItem()));
           aluno.setEscolaridade(String.valueOf(cmboxEscolaridade.getSelectedItem()));
           aluno.setEndereco(txtEndereco.getText());
           aluno.setNumero(txtNum.getText());
           aluno.setBairro(txtBairro.getText());
           aluno.setCep(txtCEP.getText().replaceAll("-", ""));
           aluno.setCidade(txtCidade.getText());
           aluno.setEstado(String.valueOf(cmboxEstado.getSelectedItem()));
           aluno.setTelefone(txtTelRes.getText().replaceAll("()-", ""));
           aluno.setRg(txtRG.getText().replaceAll("\\.", ""));
           aluno.setCelular(txtCelular.getText().replaceAll("()-", ""));
           aluno.setEmail(txtEmail.getText());
                      
           daoaluno.alterar(aluno);
        }

        txtCPF.setText("");
        txtNome.setText("");
        txtDtNasc.setText("");
        cmboxSexo.setSelectedItem("");
        cmboxEstCivil.setSelectedItem("");
        cmboxEscolaridade.setSelectedItem("");
        txtEndereco.setText("");
        txtNum.setText("");
        txtBairro.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        cmboxEstado.setSelectedItem("");
        txtTelRes.setText("");
        txtRG.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        
        txtCPF.requestFocus();
        
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtDtNasc.setEnabled(false);
        cmboxSexo.setEnabled(false);
        cmboxEstCivil.setEnabled(false);
        cmboxEscolaridade.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNum.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCEP.setEnabled(false);
        txtCidade.setEnabled(false);
        cmboxEstado.setEnabled(false);
        txtTelRes.setEnabled(false);
        txtRG.setEnabled(false);
        txtCelular.setEnabled(false);
        txtEmail.setEnabled(false);
        
        txtCPF.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    
    }//GEN-LAST:event_btnAlterarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmboxEscolaridade;
    private javax.swing.JComboBox<String> cmboxEstCivil;
    private javax.swing.JComboBox<String> cmboxEstado;
    private javax.swing.JComboBox<String> cmboxSexo;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblEstCivil;
    private javax.swing.JLabel lblEstCivil1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelRes;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelRes;
    // End of variables declaration//GEN-END:variables
    private DaoAluno daoaluno=null;
    private Aluno    aluno=null;
    private Conexao conexao=null;
}
