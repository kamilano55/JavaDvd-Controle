/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import connection.ConnectionFactory;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author Pretinho
 */
public class Login extends javax.swing.JFrame {
Connection conexao = null;

    /**
     * Creates new form TelaLogin
     */
    public Login() {
        initComponents();
        conexao = ConnectionFactory.getConnection();

        if (conexao != null) {
            
            lblConLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagens/conection-ok.png")));
            
        } else {
            
            lblConLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imagens/No-conection.png")));
            btnAcessar.setEnabled(false);
            txtUsuario.setEnabled(false);
            jPasswordField1.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();
        lblConLogin = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setIconImage(new ImageIcon(getClass().getResource("/imagens/dvd-rolo.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(null);

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(310, 80, 180, 30);

        lblUsuario.setText("USUÁRIO:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(250, 40, 60, 30);

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(310, 40, 180, 30);

        lblSenha.setText("SENHA:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(250, 80, 50, 30);

        btnAcessar.setText("ACESSAR");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        btnAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAcessarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAcessar);
        btnAcessar.setBounds(320, 120, 90, 23);

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(420, 120, 57, 23);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dvd-rolo.png"))); // NOI18N
        lblFundo.setText(" ");
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 500, 170);

        lblConLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conection-ok.png"))); // NOI18N
        getContentPane().add(lblConLogin);
        lblConLogin.setBounds(260, 110, 40, 50);

        setSize(new java.awt.Dimension(511, 202));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        if(txtUsuario.getText().equals("admin")&&jPasswordField1.getText().equals("124")){
        Menu tela = new Menu();
        tela.setVisible(true);
        dispose();
        }else{
             JOptionPane.showMessageDialog(rootPane, "Senha ou usuário inválidos");
        }     
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
           jPasswordField1.requestFocus();
       }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
           btnAcessar.requestFocus();
       }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void btnAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAcessarKeyPressed
        
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            
            if (txtUsuario.getText().equals("admin") && jPasswordField1.getText().equals("124")){
                Menu tela = new Menu();
                tela.setVisible(true);
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Senha ou usuário inválidos");
            }
       }
    }//GEN-LAST:event_btnAcessarKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblConLogin;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
