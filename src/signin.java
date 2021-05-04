/*
 * @author Hossam Hamdy
*/
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class signin extends javax.swing.JFrame {
    //Creates new form signin
    public signin() {
        initComponents();
        // The following 3 lines of code centers the form on screen.
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signin_panel = new javax.swing.JPanel();
        signinEmailLabel = new javax.swing.JLabel();
        signinEmail = new javax.swing.JTextField();
        signinPasswordLable = new javax.swing.JLabel();
        signinPassword = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        restPasswordButton = new javax.swing.JButton();
        signinBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signin");
        setBackground(new java.awt.Color(0, 0, 0));

        signin_panel.setBackground(new java.awt.Color(0, 0, 0));
        signin_panel.setForeground(new java.awt.Color(255, 255, 255));
        signin_panel.setLayout(null);

        signinEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        signinEmailLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        signinEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        signinEmailLabel.setText("Email Address:");
        signin_panel.add(signinEmailLabel);
        signinEmailLabel.setBounds(30, 40, 140, 40);

        signinEmail.setBackground(new java.awt.Color(0, 0, 0));
        signinEmail.setForeground(new java.awt.Color(255, 255, 255));
        signinEmail.setName("signinEmail"); // NOI18N
        signinEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinEmailActionPerformed(evt);
            }
        });
        signin_panel.add(signinEmail);
        signinEmail.setBounds(30, 80, 390, 30);

        signinPasswordLable.setBackground(new java.awt.Color(0, 0, 0));
        signinPasswordLable.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        signinPasswordLable.setForeground(new java.awt.Color(255, 255, 255));
        signinPasswordLable.setText("Password:");
        signin_panel.add(signinPasswordLable);
        signinPasswordLable.setBounds(30, 120, 90, 26);

        signinPassword.setBackground(new java.awt.Color(0, 0, 0));
        signinPassword.setForeground(new java.awt.Color(255, 255, 255));
        signinPassword.setName("signinPassword"); // NOI18N
        signin_panel.add(signinPassword);
        signinPassword.setBounds(30, 150, 390, 30);

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        signin_panel.add(loginButton);
        loginButton.setBounds(30, 210, 130, 50);

        restPasswordButton.setBackground(new java.awt.Color(0, 0, 0));
        restPasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        restPasswordButton.setText("Reset Password");
        restPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restPasswordButtonActionPerformed(evt);
            }
        });
        signin_panel.add(restPasswordButton);
        restPasswordButton.setBounds(160, 210, 130, 50);

        signinBackButton.setBackground(new java.awt.Color(0, 0, 0));
        signinBackButton.setForeground(new java.awt.Color(255, 255, 255));
        signinBackButton.setText("Back");
        signinBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinBackButtonActionPerformed(evt);
            }
        });
        signin_panel.add(signinBackButton);
        signinBackButton.setBounds(290, 210, 130, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signinEmailActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        // reading data from the user.
        String userEmail = signinEmail.getText().trim();
        String userPassword = signinPassword.getText().trim();
        
        // checking inputs validation
        while (true){
            if(userEmail.length() == 0 || userPassword.length() == 0){
                JOptionPane.showMessageDialog(this, "You can't left any blank field !", "[-] Signin Failed", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else{break;}
        }
        
        // login as admin.
        if (userEmail.equals("root") && userPassword.equals("root")){
            JOptionPane.showMessageDialog(this, "Welcome Back Admin <3");
        }
        
        // connecting to database code here:
    
    }//GEN-LAST:event_loginButtonActionPerformed

    private void restPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restPasswordButtonActionPerformed
        /* jButton2ActionPerformed == reset password button */
    }//GEN-LAST:event_restPasswordButtonActionPerformed

    private void signinBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinBackButtonActionPerformed
        // back to the main form
        start startForm = new start();
        this.setVisible(false);
        startForm.setVisible(true);
    }//GEN-LAST:event_signinBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JButton restPasswordButton;
    private javax.swing.JButton signinBackButton;
    private javax.swing.JTextField signinEmail;
    private javax.swing.JLabel signinEmailLabel;
    private javax.swing.JPasswordField signinPassword;
    private javax.swing.JLabel signinPasswordLable;
    public javax.swing.JPanel signin_panel;
    // End of variables declaration//GEN-END:variables
}
