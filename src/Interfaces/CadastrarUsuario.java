/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author a1658948
 */
public class CadastrarUsuario extends javax.swing.JFrame {

    private boolean[] dadosValidos = new boolean[9];
    private final Color corValido = new Color(10, 200, 150);
    private final Color corInvalido = new Color(125, 30, 150);
    private final String textoValido = "     Dado Válido";
    private final String textoInvalido = "     Dado Inválido";
    /**
     * Creates new form CadatrarUsuario
     */
    public CadastrarUsuario() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecionaTipoUsuario = new javax.swing.ButtonGroup();
        painelDados = new javax.swing.JLayeredPane();
        campoCidade = new javax.swing.JTextField();
        labCidade = new javax.swing.JLabel();
        labNome = new javax.swing.JLabel();
        RG = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        labEndereco = new javax.swing.JLabel();
        labUF = new javax.swing.JLabel();
        labCEP = new javax.swing.JLabel();
        selecionaUF = new javax.swing.JComboBox<>();
        campoRG = new javax.swing.JFormattedTextField();
        campoNome = new javax.swing.JFormattedTextField();
        selecionaAdmin = new javax.swing.JRadioButton();
        selecionaUser = new javax.swing.JRadioButton();
        labTipoUsuario = new javax.swing.JLabel();
        campoCEP = new javax.swing.JFormattedTextField();
        cadastro = new javax.swing.JLabel();
        confirmaCadastro = new javax.swing.JButton();
        painelLogin = new javax.swing.JLayeredPane();
        labLogin = new javax.swing.JLabel();
        labSenha = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labCidade.setText("Cidade");

        labNome.setText("Nome Completo");

        RG.setText("RG");

        campoEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEnderecoFocusLost(evt);
            }
        });

        labEndereco.setText("Endereço");

        labUF.setText("Estado ou UF");

        labCEP.setText("CEP");

        selecionaUF.setMaximumRowCount(27);
        selecionaUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ACRE", "ALAGOAS", "AMAPÁ", "AMAZONAS", "BAHIA", "CEARÁ", "DISTRITO FEDERAL", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAÍBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS" }));

        try {
            campoRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoRG.setText("00.000.000-0");

        campoNome.setColumns(200);
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeFocusLost(evt);
            }
        });

        selecionaTipoUsuario.add(selecionaAdmin);
        selecionaAdmin.setText("Administrador");
        selecionaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaAdminActionPerformed(evt);
            }
        });

        selecionaTipoUsuario.add(selecionaUser);
        selecionaUser.setSelected(true);
        selecionaUser.setText("Usuário Comum");

        labTipoUsuario.setText("Tipo de Usuário");

        try{
            formataCEP = new MaskFormatter("*****-***");
            formataCEP.setValidCharacters("_0123456789");
            campoCEP = new JFormattedTextField(formataCEP);
        } catch(Exception e){
        }
        campoCEP.setText("_____-___");
        campoCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCEPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCEPFocusLost(evt);
            }
        });

        painelDados.setLayer(campoCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(labCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(labNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(RG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(campoEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(labEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(labUF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(labCEP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(selecionaUF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(campoRG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(campoNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(selecionaAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(selecionaUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(labTipoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelDados.setLayer(campoCEP, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(selecionaUser)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEndereco)
                            .addComponent(campoCidade)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labEndereco)
                                    .addComponent(labCidade)
                                    .addComponent(labNome)
                                    .addComponent(selecionaAdmin))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecionaUF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labUF)
                            .addComponent(labCEP)
                            .addComponent(RG)
                            .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(labTipoUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNome)
                    .addComponent(RG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCEP)
                    .addComponent(labEndereco))
                .addGap(4, 4, 4)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCidade)
                    .addComponent(labUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labTipoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selecionaAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecionaUser)
                .addContainerGap())
        );

        cadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cadastro.setText("Cadastro de Usuário");

        confirmaCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmaCadastro.setText("Confirmar");
        confirmaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaCadastroActionPerformed(evt);
            }
        });

        labLogin.setText("Login");

        labSenha.setText("Senha");

        labEmail.setText("Email");

        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });

        painelLogin.setLayer(labLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(labSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(labEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(campoLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(campoSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelLogin.setLayer(campoEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addComponent(labLogin)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoLogin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labEmail)
                            .addComponent(labSenha))
                        .addGap(0, 660, Short.MAX_VALUE))
                    .addComponent(campoEmail, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addComponent(labLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDados)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastro)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastro)
                .addGap(18, 29, Short.MAX_VALUE)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaCadastroActionPerformed
        verificaDados();
    }//GEN-LAST:event_confirmaCadastroActionPerformed

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoginActionPerformed

    private void selecionaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecionaAdminActionPerformed

    private void campoCEPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCEPFocusGained
        try {
            formataCEP.setMask("#####-###");
            campoCEP.setFormatterFactory(new DefaultFormatterFactory(formataCEP));
        } catch(Exception e) {

        }
    }//GEN-LAST:event_campoCEPFocusGained

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost
        String nome = this.campoNome.getText();
        
        if(nome.trim().length() > 1) {
            dadosValidos[0] = true;
            this.labNome.setText("Nome Completo" + textoValido);
            this.labNome.setForeground(corValido);
        }
        
        else {
            dadosValidos[0] = false;
            this.labNome.setText("Nome Completo" + textoInvalido);
            this.labNome.setForeground(corInvalido);
        }
    }//GEN-LAST:event_campoNomeFocusLost

    private void campoEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEnderecoFocusLost
        String endereco = this.campoEndereco.getText();
        
        if(!endereco.equals("")) {
            dadosValidos[1] = true;
            this.labEndereco.setText("Endereço" + textoValido);
            this.labEndereco.setForeground(corValido);
        }
        
        else {
            dadosValidos[1] = false;
            this.labEndereco.setText("Endereço" + textoInvalido);
            this.labEndereco.setForeground(corInvalido);
        }
    }//GEN-LAST:event_campoEnderecoFocusLost

    private void campoCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCEPFocusLost
        String CEP = this.campoCEP.getText();
        
        if(CEP.trim().length() == 9) {
            dadosValidos[2] = true;
            this.labCEP.setText("CEP" + textoValido);
            this.labCEP.setForeground(corValido);
        }
        
        else {
            dadosValidos[2] = false;
            this.labCEP.setText("CEP" + textoInvalido);
            this.labCEP.setForeground(corInvalido);
        }
    }//GEN-LAST:event_campoCEPFocusLost
    
    private void verificaDados() {
        
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }
    
    private javax.swing.text.MaskFormatter formataCEP;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RG;
    private javax.swing.JLabel cadastro;
    private javax.swing.JFormattedTextField campoCEP;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JFormattedTextField campoNome;
    private javax.swing.JFormattedTextField campoRG;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JButton confirmaCadastro;
    private javax.swing.JLabel labCEP;
    private javax.swing.JLabel labCidade;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labEndereco;
    private javax.swing.JLabel labLogin;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labSenha;
    private javax.swing.JLabel labTipoUsuario;
    private javax.swing.JLabel labUF;
    private javax.swing.JLayeredPane painelDados;
    private javax.swing.JLayeredPane painelLogin;
    private javax.swing.JRadioButton selecionaAdmin;
    private javax.swing.ButtonGroup selecionaTipoUsuario;
    private javax.swing.JComboBox<String> selecionaUF;
    private javax.swing.JRadioButton selecionaUser;
    // End of variables declaration//GEN-END:variables
}
