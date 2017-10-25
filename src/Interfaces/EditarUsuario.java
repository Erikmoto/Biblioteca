/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.ADM;

/**
 *
 * @author ryuic
 */
public class EditarUsuario extends javax.swing.JFrame {

    private ADM adm;
    
    public EditarUsuario(ADM a) {
        initComponents();
        this.adm = a;
    }

    private EditarUsuario() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labEditar = new javax.swing.JLabel();
        painelBusca = new javax.swing.JPanel();
        labID = new javax.swing.JLabel();
        campoID = new javax.swing.JFormattedTextField();
        buscarUsuario = new javax.swing.JButton();
        selecionar = new javax.swing.JButton();
        separadorVSup = new javax.swing.JSeparator();
        campoBusca = new javax.swing.JTextField();
        labBusca = new javax.swing.JLabel();
        separadorHSup = new javax.swing.JSeparator();
        painelDados = new javax.swing.JPanel();
        labNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labRG = new javax.swing.JLabel();
        campoRG = new javax.swing.JFormattedTextField();
        labEndereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        labCEP = new javax.swing.JLabel();
        campoCEP = new javax.swing.JFormattedTextField();
        labCidade = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        labUF = new javax.swing.JLabel();
        selecionaUF = new javax.swing.JComboBox<>();
        labTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        separadorHInt = new javax.swing.JSeparator();
        painelLogin = new javax.swing.JPanel();
        labLogin = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        labEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        separadorHInf = new javax.swing.JSeparator();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        separadorVInf = new javax.swing.JSeparator();
        deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labEditar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labEditar.setText("Editar Usuário");

        labID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labID.setText("ID");

        campoID.setForeground(new java.awt.Color(204, 204, 204));
        campoID.setText("ID do Usuário");
        campoID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buscarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarUsuario.setText("<html><center>Buscar<br>Usuário</html>");

        selecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selecionar.setText("Selecionar");

        separadorVSup.setOrientation(javax.swing.SwingConstants.VERTICAL);

        campoBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoBusca.setForeground(new java.awt.Color(204, 204, 204));
        campoBusca.setText("Busca");

        labBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labBusca.setText("Nome ou RG");

        javax.swing.GroupLayout painelBuscaLayout = new javax.swing.GroupLayout(painelBusca);
        painelBusca.setLayout(painelBuscaLayout);
        painelBuscaLayout.setHorizontalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labID))
                .addGap(18, 18, 18)
                .addComponent(selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorVSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labBusca)
                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 29, Short.MAX_VALUE)
                .addComponent(buscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        painelBuscaLayout.setVerticalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscaLayout.createSequentialGroup()
                        .addComponent(labID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoID))
                    .addGroup(painelBuscaLayout.createSequentialGroup()
                        .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelBuscaLayout.createSequentialGroup()
                                .addComponent(labBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buscarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(separadorVSup, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        labNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labNome.setText("Nome");

        campoNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRG.setText("RG");

        campoRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labEndereco.setText("Endereço");

        campoEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCEP.setText("CEP");

        campoCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCidade.setText("Cidade");

        campoCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labUF.setText("Estado ou UF");

        selecionaUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selecionaUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ACRE", "ALAGOAS", "AMAPÁ", "AMAZONAS", "BAHIA", "CEARÁ", "DISTRITO FEDERAL", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAÍBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS" }));

        labTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTelefone.setText("Telefone");

        campoTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labNome)
                            .addComponent(labRG))
                        .addGap(64, 64, 64)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labEndereco)
                            .addComponent(labCEP)
                            .addComponent(labCidade)
                            .addComponent(labUF)
                            .addComponent(labTelefone))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecionaUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoEndereco)
                                .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labRG)
                    .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEndereco)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCEP)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCidade)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labUF)
                    .addComponent(selecionaUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTelefone)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labLogin.setText("Nome de Usuário");

        campoLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labEmail.setText("Email");

        campoEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labLogin)
                    .addComponent(labEmail))
                .addGap(25, 25, 25)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(campoEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labLogin)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        confirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmar.setText("Confirmar");

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        separadorVInf.setOrientation(javax.swing.SwingConstants.VERTICAL);

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setText("<html><center>Deletar<br>Usuário</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorHSup, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(separadorHInt)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(labEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separadorVInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(separadorHInf)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labEditar)
                .addGap(1, 1, 1)
                .addComponent(separadorHSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorHInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorHInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(separadorVInf)
                            .addComponent(deletar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        this.adm.mostraInterface();
    }//GEN-LAST:event_formWindowClosed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
        this.adm.mostraInterface();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarUsuario;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JFormattedTextField campoCEP;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JFormattedTextField campoID;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoRG;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel labBusca;
    private javax.swing.JLabel labCEP;
    private javax.swing.JLabel labCidade;
    private javax.swing.JLabel labEditar;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labEndereco;
    private javax.swing.JLabel labID;
    private javax.swing.JLabel labLogin;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labRG;
    private javax.swing.JLabel labTelefone;
    private javax.swing.JLabel labUF;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JComboBox<String> selecionaUF;
    private javax.swing.JButton selecionar;
    private javax.swing.JSeparator separadorHInf;
    private javax.swing.JSeparator separadorHInt;
    private javax.swing.JSeparator separadorHSup;
    private javax.swing.JSeparator separadorVInf;
    private javax.swing.JSeparator separadorVSup;
    // End of variables declaration//GEN-END:variables
}
