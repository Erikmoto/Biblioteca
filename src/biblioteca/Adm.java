/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Gabriel
 */
public class Adm extends javax.swing.JFrame {

    /**
     * Creates new form Adm
     */
    public Adm() {
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

        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        consultaAcervo = new javax.swing.JMenuItem();
        AddAcervo = new javax.swing.JMenuItem();
        removeAcervo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        consultaPessoa = new javax.swing.JMenuItem();
        cadastraPessoa = new javax.swing.JMenuItem();

        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText("jCheckBoxMenuItem9");

        jCheckBoxMenuItem10.setSelected(true);
        jCheckBoxMenuItem10.setText("jCheckBoxMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Acervo");

        consultaAcervo.setText("Consultar");
        consultaAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaAcervoActionPerformed(evt);
            }
        });
        jMenu1.add(consultaAcervo);

        AddAcervo.setText("Adicionar");
        jMenu1.add(AddAcervo);

        removeAcervo.setText("Remover");
        removeAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAcervoActionPerformed(evt);
            }
        });
        jMenu1.add(removeAcervo);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Pessoas - ache um nome melhor");

        consultaPessoa.setText("Consultar");
        jMenu3.add(consultaPessoa);

        cadastraPessoa.setText("Cadastrar");
        cadastraPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraPessoaActionPerformed(evt);
            }
        });
        jMenu3.add(cadastraPessoa);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaAcervoActionPerformed
        Acervo acervo = new Acervo();
        acervo.setVisible(true);
    }//GEN-LAST:event_consultaAcervoActionPerformed

    private void removeAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAcervoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeAcervoActionPerformed

    private void cadastraPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraPessoaActionPerformed
        Cadastrar cadastrar = new Cadastrar();
        cadastrar.setVisible(true);
    }//GEN-LAST:event_cadastraPessoaActionPerformed

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
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddAcervo;
    private javax.swing.JMenuItem cadastraPessoa;
    private javax.swing.JMenuItem consultaAcervo;
    private javax.swing.JMenuItem consultaPessoa;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem removeAcervo;
    // End of variables declaration//GEN-END:variables
}
