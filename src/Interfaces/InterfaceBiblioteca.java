package Interfaces;

import Classes.Acervo;

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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclaPressionda(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teclaDigitada(evt);
            }
        });

        consultarAcervo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        consultarAcervo.setText("<html><u>A</u>cervo</html>");
        consultarAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAcervoActionPerformed(evt);
            }
        });
        consultarAcervo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclaPressionda(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teclaDigitada(evt);
            }
        });

        realizarLogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        realizarLogin.setText("<html><u>L</u>ogin</html>");
        realizarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarLoginActionPerformed(evt);
            }
        });
        realizarLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclaPressionda(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teclaDigitada(evt);
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
    private void criarInterfaceLogin() {
        this.dispose();
        InterfaceLogin login = new InterfaceLogin(this, true);
        login.setVisible(true);
    }
    
    private void realizarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarLoginActionPerformed
        criarInterfaceLogin();
    }//GEN-LAST:event_realizarLoginActionPerformed
    
    private void criarInterfaceConsultarAcervo() {
        this.dispose();
        Acervo acervo = new Acervo();
        acervo.mostraAcervo(this);
    }
    
    private void consultarAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAcervoActionPerformed
        criarInterfaceConsultarAcervo();
    }//GEN-LAST:event_consultarAcervoActionPerformed

    private void teclaDigitada(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclaDigitada
        char tecla = evt.getKeyChar();
        
        evt.consume();
        
        if(tecla == 'l' || tecla == 'L' || (tecla == '\n' && this.getFocusOwner() == this.realizarLogin)) {
            criarInterfaceLogin();
        }
        
        else {
            if(tecla == 'a' || tecla == 'A' || (tecla == '\n' && this.getFocusOwner() == this.consultarAcervo)) {
                criarInterfaceConsultarAcervo();
            }
        }
    }//GEN-LAST:event_teclaDigitada

    private void teclaPressionda(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclaPressionda
        int codigoTecla = evt.getKeyCode();
        
        evt.consume();
        
        if(codigoTecla == 27) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_teclaPressionda

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(() -> {
            new InterfaceBiblioteca().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarAcervo;
    private javax.swing.JButton realizarLogin;
    // End of variables declaration//GEN-END:variables
}
