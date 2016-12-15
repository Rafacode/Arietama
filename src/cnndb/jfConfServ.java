/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnndb;

import javax.swing.JOptionPane;
import msgsis.Sucesso;
import gerext.cManipulador;

/**
 *
 * @author rafaelgs
 */
public class jfConfServ extends javax.swing.JFrame {

    /**
     * Creates new form jfConfServ
     */
    Sucesso suc = new Sucesso();
    CMDB cnn = new CMDB();
    cManipulador man = new cManipulador();

    public jfConfServ() {
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

        jlblIPServ = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jlblSenha = new javax.swing.JLabel();
        jtxtIPServ = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        jptxtSenha = new javax.swing.JPasswordField();
        jbtnSair = new javax.swing.JButton();
        jbtnSalSai = new javax.swing.JButton();
        jbtnTestCon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração do Servidor");
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        setName("frmConfServ"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);

        jlblIPServ.setText("IP do Servidor:");

        jlblUsuario.setText("Usuário:");

        jlblSenha.setText("Senha:");

        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        jbtnSalSai.setText("Salvar e Sair");
        jbtnSalSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalSaiActionPerformed(evt);
            }
        });

        jbtnTestCon.setText("Testar Conexão");
        jbtnTestCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTestConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnTestCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jbtnSalSai)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblSenha)
                            .addComponent(jlblUsuario)
                            .addComponent(jlblIPServ))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtIPServ)
                            .addComponent(jtxtUsuario)
                            .addComponent(jptxtSenha))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIPServ)
                    .addComponent(jtxtIPServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUsuario)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSenha)
                    .addComponent(jptxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSair)
                    .addComponent(jbtnSalSai)
                    .addComponent(jbtnTestCon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalSaiActionPerformed
        // TODO add your handling code here:

        if (cnn.CMDB(0, "jdbc:mysql://" + jtxtIPServ.getText() + "/cmdb", jtxtUsuario.getText(), jptxtSenha.getText()) == 1) {
            
            man.SalvarInfoDB("jdbc:mysql://" + jtxtIPServ.getText() + "/cmdb", jtxtUsuario.getText(), jptxtSenha.getText());
            suc.Sucesso("Reinicie o Sistema!");
            dispose();
        }
    }//GEN-LAST:event_jbtnSalSaiActionPerformed

    private void jbtnTestConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTestConActionPerformed
        // TODO add your handling code here:
        cnn.CMDB(0, "jdbc:mysql://" + jtxtIPServ.getText() + "/cmdb", jtxtUsuario.getText(), jptxtSenha.getText());
    }//GEN-LAST:event_jbtnTestConActionPerformed

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtnSairActionPerformed

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
            java.util.logging.Logger.getLogger(jfConfServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfConfServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfConfServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfConfServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfConfServ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnSair;
    private javax.swing.JButton jbtnSalSai;
    private javax.swing.JButton jbtnTestCon;
    private javax.swing.JLabel jlblIPServ;
    private javax.swing.JLabel jlblSenha;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPasswordField jptxtSenha;
    private javax.swing.JTextField jtxtIPServ;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}