package Interfaces;

public class InterfaceBiblioteca extends javax.swing.JFrame {

    public InterfaceBiblioteca() {
       
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultarAcervo = new javax.swing.JButton();
        realizarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        consultarAcervo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        consultarAcervo.setText("Acervo");
        consultarAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAcervoActionPerformed(evt);
            }
        });

        realizarLogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        realizarLogin.setText("Login");
        realizarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consultarAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realizarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(realizarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(consultarAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarLoginActionPerformed
        this.dispose();
        InterfaceLogin login = new InterfaceLogin(this, true);
        login.setVisible(true);
    }//GEN-LAST:event_realizarLoginActionPerformed

    private void consultarAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAcervoActionPerformed
        this.dispose();
        ConsultarAcervo acervo = new ConsultarAcervo();
        acervo.setVisible(true);
    }//GEN-LAST:event_consultarAcervoActionPerformed

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarAcervo;
    private javax.swing.JButton realizarLogin;
    // End of variables declaration//GEN-END:variables
}
