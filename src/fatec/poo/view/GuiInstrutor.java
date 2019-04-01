
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Pessoa;
import javax.swing.JOptionPane;

//* @author 0030481523020
 
public class GuiInstrutor extends javax.swing.JFrame {

    public GuiInstrutor() {
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
        txtFormacao = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
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
        lblForm = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblAreaAtua = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtAreaAtua = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Instrutor");
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
        cmboxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxEstadoActionPerformed(evt);
            }
        });

        txtEndereco.setEnabled(false);

        txtBairro.setEnabled(false);

        txtFormacao.setEnabled(false);
        txtFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormacaoActionPerformed(evt);
            }
        });

        lblRG.setText("RG");

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  .   .   -  ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRG.setEnabled(false);

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
        cmboxEstCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxEstCivilActionPerformed(evt);
            }
        });

        lblNum.setText("     Nº");

        txtNum.setEnabled(false);

        lblCEP.setText("CEP");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("     -   ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCEP.setEnabled(false);
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPActionPerformed(evt);
            }
        });

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

        lblForm.setText("Formação");

        txtCidade.setEnabled(false);

        lblAreaAtua.setText("Área de atuação");

        txtEmail.setEnabled(false);

        txtAreaAtua.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(lblCPF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(lblNome))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(lblSexo)))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRG, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblemail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEnd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblForm, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(211, 211, 211)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmboxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(lblEstado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTelRes))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblCelular)))
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDtNasc)
                                            .addComponent(lblEstCivil)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                                    .addComponent(txtBairro))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblCEP, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAreaAtua))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAreaAtua, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCPF, txtCidade, txtFormacao, txtRG});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(lblDtNasc)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmboxEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstCivil))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSexo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnd)
                    .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBairro)
                        .addComponent(lblCEP)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado)
                            .addComponent(lblCidade))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRG)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelRes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelular))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblForm))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemail)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAreaAtua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAreaAtua))))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBairro, txtEmail});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCPF, txtCidade, txtFormacao, txtRG});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        instrutor = new Instrutor(txtCPF.getText().replaceAll("\\.-", ""), txtNome.getText());
        
        instrutor.setDataNasc(txtDtNasc.getText().replaceAll("\\/", ""));
        instrutor.setSexo(String.valueOf(cmboxSexo.getSelectedItem()));        
        instrutor.setEstadoCivil(String.valueOf(cmboxEstCivil.getSelectedItem()));        
        instrutor.setEndereco(txtEndereco.getText());
        instrutor.setNumero(txtNum.getText());
        instrutor.setBairro(txtBairro.getText());
        instrutor.setCep(txtCEP.getText().replaceAll("-", ""));
        instrutor.setCidade(txtCidade.getText());
        instrutor.setEstado(String.valueOf(cmboxEstado.getSelectedItem()));
        instrutor.setTelefone(txtTelRes.getText().replaceAll("()-", ""));
        instrutor.setRg(txtRG.getText().replaceAll("\\.", ""));
        instrutor.setCelular(txtCelular.getText().replaceAll("()-", ""));
        instrutor.setFormacao(txtFormacao.getText());
        instrutor.setAreaAtuacao(txtAreaAtua.getText());
        instrutor.setEmail(txtEmail.getText());
        
        daoinstrutor.inserir(instrutor);
         
        txtCPF.setText("");
        txtNome.setText("");
        txtDtNasc.setText("");
        cmboxSexo.setSelectedItem("");
        cmboxEstCivil.setSelectedItem("");
        txtEndereco.setText("");
        txtNum.setText("");
        txtBairro.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        cmboxEstado.setSelectedItem("");
        txtTelRes.setText("");
        txtRG.setText("");
        txtCelular.setText("");
        txtFormacao.setText("");
        txtAreaAtua.setText("");
        txtEmail.setText("");
        
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtDtNasc.setEnabled(false);
        cmboxSexo.setEnabled(false);
        cmboxEstCivil.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNum.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCEP.setEnabled(false);
        txtCidade.setEnabled(false);
        cmboxEstado.setEnabled(false);
        txtTelRes.setEnabled(false);
        txtRG.setEnabled(false);
        txtCelular.setEnabled(false);
        txtFormacao.setEnabled(false);
        txtAreaAtua.setEnabled(false);
        txtEmail.setEnabled(false);
        
        txtCPF.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormacaoActionPerformed

    private void cmboxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxEstadoActionPerformed

    private void txtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPActionPerformed

    private void cmboxEstCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxEstCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxEstCivilActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("System", "ar214532");
        //conexao = new Conexao("BD1523020", "BD1523020");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        //conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoinstrutor = new DaoInstrutor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        instrutor = null;
        if(Pessoa.validarCPF(txtCPF.getText().replaceAll("\\.-", ""))){
            JOptionPane.showInputDialog("CPF Válido!");

            instrutor = daoinstrutor.consultar(txtCPF.getText());
            
            if (instrutor == null){
                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtDtNasc.setEnabled(true);
                cmboxSexo.setEnabled(true);
                cmboxEstCivil.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNum.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCEP.setEnabled(true);
                txtCidade.setEnabled(true);
                cmboxEstado.setEnabled(true);
                txtTelRes.setEnabled(true);
                txtRG.setEnabled(true);
                txtCelular.setEnabled(true);
                txtFormacao.setEnabled(true);
                txtAreaAtua.setEnabled(true);
                txtEmail.setEnabled(true);
                
                txtNome.requestFocus();
                
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            }
            else{
                txtNome.setText(instrutor.getNome());
                txtDtNasc.setText(instrutor.getDataNasc());
                cmboxSexo.setSelectedItem(instrutor.getSexo());
                cmboxEstCivil.setSelectedItem(instrutor.getEstadoCivil());
                txtEndereco.setText(instrutor.getEndereco());
                txtNum.setText(instrutor.getNumero());
                txtBairro.setText(instrutor.getBairro());
                txtCEP.setText(instrutor.getCep());
                txtCidade.setText(instrutor.getCidade());
                cmboxEstado.setSelectedItem(instrutor.getEstado());
                txtTelRes.setText(instrutor.getTelefone());
                txtRG.setText(instrutor.getRg());
                txtCelular.setText(instrutor.getCelular());
                txtFormacao.setText(instrutor.getFormacao());
                txtAreaAtua.setText(instrutor.getAreaAtuacao());
                txtEmail.setText(instrutor.getEmail());
                
                txtNome.requestFocus();
                
                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtDtNasc.setEnabled(true);
                cmboxSexo.setEnabled(true);
                cmboxEstCivil.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNum.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCEP.setEnabled(true);
                txtCidade.setEnabled(true);
                cmboxEstado.setEnabled(true);
                txtTelRes.setEnabled(true);
                txtRG.setEnabled(true);
                txtCelular.setEnabled(true);
                txtFormacao.setEnabled(true);
                txtAreaAtua.setEnabled(true);
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoinstrutor.excluir(instrutor); 
            
            txtCPF.setText("");
            txtNome.setText("");
            txtDtNasc.setText("");
            cmboxSexo.setSelectedItem("");
            cmboxEstCivil.setSelectedItem("");            
            txtEndereco.setText("");
            txtNum.setText("");
            txtBairro.setText("");
            txtCEP.setText("");
            txtCidade.setText("");
            cmboxEstado.setSelectedItem("");
            txtTelRes.setText("");
            txtRG.setText("");
            txtCelular.setText("");
            txtFormacao.setText("");
            txtAreaAtua.setText("");
            txtEmail.setText("");
            
            txtCPF.requestFocus();
            
            txtCPF.setEnabled(true);
            txtNome.setEnabled(false);
            txtDtNasc.setEnabled(false);
            cmboxSexo.setEnabled(false);
            cmboxEstCivil.setEnabled(false);            
            txtEndereco.setEnabled(false);
            txtNum.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCEP.setEnabled(false);
            txtCidade.setEnabled(false);
            cmboxEstado.setEnabled(false);
            txtTelRes.setEnabled(false);
            txtRG.setEnabled(false);
            txtCelular.setEnabled(false);
            txtFormacao.setEnabled(false);
            txtAreaAtua.setEnabled(false);
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
           instrutor.setNome(txtNome.getText());
           instrutor.setDataNasc(txtDtNasc.getText().replaceAll("\\.-", ""));
           instrutor.setSexo(String.valueOf(cmboxSexo.getSelectedItem()));
           instrutor.setEstadoCivil(String.valueOf(cmboxEstCivil.getSelectedItem()));           
           instrutor.setEndereco(txtEndereco.getText());
           instrutor.setNumero(txtNum.getText());
           instrutor.setBairro(txtBairro.getText());
           instrutor.setCep(txtCEP.getText().replaceAll("-", ""));
           instrutor.setCidade(txtCidade.getText());
           instrutor.setEstado(String.valueOf(cmboxEstado.getSelectedItem()));
           instrutor.setTelefone(txtTelRes.getText().replaceAll("()-", ""));
           instrutor.setRg(txtRG.getText().replaceAll("\\.", ""));
           instrutor.setCelular(txtCelular.getText().replaceAll("()-", ""));
           instrutor.setFormacao(txtFormacao.getText());
           instrutor.setAreaAtuacao(txtAreaAtua.getText());           
           instrutor.setEmail(txtEmail.getText());
                      
           daoinstrutor.alterar(instrutor);
        }
        
        txtCPF.setText("");
        txtNome.setText("");
        txtDtNasc.setText("");
        cmboxSexo.setSelectedItem("");
        cmboxEstCivil.setSelectedItem("");
        txtEndereco.setText("");
        txtNum.setText("");
        txtBairro.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        cmboxEstado.setSelectedItem("");
        txtTelRes.setText("");
        txtRG.setText("");
        txtCelular.setText("");
        txtFormacao.setText("");
        txtAreaAtua.setText("");
        txtEmail.setText("");
        
        txtCPF.requestFocus();
        
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtDtNasc.setEnabled(false);
        cmboxSexo.setEnabled(false);
        cmboxEstCivil.setEnabled(false);       
        txtEndereco.setEnabled(false);
        txtNum.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCEP.setEnabled(false);
        txtCidade.setEnabled(false);
        cmboxEstado.setEnabled(false);
        txtTelRes.setEnabled(false);
        txtRG.setEnabled(false);
        txtCelular.setEnabled(false);
        txtFormacao.setEnabled(false);
        txtAreaAtua.setEnabled(false);
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
                new GuiInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmboxEstCivil;
    private javax.swing.JComboBox<String> cmboxEstado;
    private javax.swing.JComboBox<String> cmboxSexo;
    private javax.swing.JLabel lblAreaAtua;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblEstCivil;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelRes;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtAreaAtua;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelRes;
    // End of variables declaration//GEN-END:variables
    private DaoInstrutor daoinstrutor=null;
    private Instrutor    instrutor=null;
    private Conexao      conexao=null;
}
