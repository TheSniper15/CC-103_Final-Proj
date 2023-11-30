package com.jeanne.main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {


	public SignUp() {
		initComponents();
		Connect();
		initMoving(this);
	}

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	private final String uName = "root";
	private final String pass = "Iamtheone15";
	private final String host = "jdbc:mysql://localhost:3306/final103";
	
	public void Connect()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(host, uName, pass);
		} 
		catch (ClassNotFoundException ex) 
		{
			Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelBorder1 = new com.jeanne.swing.PanelBorder();
                btnSignUp = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txtUsername = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                txtPassword = new javax.swing.JPasswordField();
                jLabel4 = new javax.swing.JLabel();
                btnLogin = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                setMaximumSize(new java.awt.Dimension(300, 400));
                setMinimumSize(new java.awt.Dimension(300, 400));
                setUndecorated(true);
                setResizable(false);
                setSize(new java.awt.Dimension(300, 400));

                panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                btnSignUp.setBackground(new java.awt.Color(51, 51, 255));
                btnSignUp.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
                btnSignUp.setText("Sign Up");
                btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnSignUp.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSignUpActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 160, -1));

                jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Sign Up");
                panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, -1));

                jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Username");
                panelBorder1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, -1));

                txtUsername.setBackground(new java.awt.Color(255, 255, 255));
                txtUsername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                txtUsername.setForeground(new java.awt.Color(0, 0, 0));
                txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panelBorder1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 180, -1));

                jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Password");
                panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, -1));

                txtPassword.setBackground(new java.awt.Color(255, 255, 255));
                txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                txtPassword.setForeground(new java.awt.Color(0, 0, 0));
                txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panelBorder1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, 30));

                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("Already have an Account?");
                panelBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 180, -1));

                btnLogin.setBackground(new java.awt.Color(51, 51, 255, 0));
                btnLogin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                btnLogin.setForeground(new java.awt.Color(51, 255, 51));
                btnLogin.setText("Login");
                btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLoginActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 160, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed

                try
                {
			String username = txtUsername.getText();
			String password = new String(txtPassword.getPassword());
			
			pst = con.prepareStatement("SELECT * FROM user_acct");
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				String uname = rs.getString("username");
				
				if((username.equals(uname)))
				{
					JOptionPane.showMessageDialog(this, "Username Allready Exist!!");
				}
				else
				{
					pst = con.prepareStatement("INSERT INTO user_acct(username,password)VALUES(?,?)");
			
					pst.setString(1, username);
					pst.setString(2,password);
			
					int k = pst.executeUpdate();

					if(username.equals("") || password.equals(""))
					{
						JOptionPane.showMessageDialog(this,"Record Failed To Save!!");
					}
					else
					{
						if(k == 1)
						{
							JOptionPane.showMessageDialog(this,"Record Added!!");
							new Login().setVisible(true);
							this.setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(this,"Record Failed To Save!!");
						}
					}
				}
			}
                }
                catch (SQLException ex)
                {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
        }//GEN-LAST:event_btnSignUpActionPerformed

        private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
                new Login().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnLoginActionPerformed

	private int x;
	private int y;

	public void initMoving(JFrame fram) {
		panelBorder1.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent me) {
			x = me.getX();
			y = me.getY();
		}

		});
		panelBorder1.addMouseMotionListener(new MouseMotionAdapter() {
		@Override
		public void mouseDragged(MouseEvent me) {
			fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
		}
		});
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
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SignUp().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnLogin;
        private javax.swing.JButton btnSignUp;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private com.jeanne.swing.PanelBorder panelBorder1;
        private javax.swing.JPasswordField txtPassword;
        private javax.swing.JTextField txtUsername;
        // End of variables declaration//GEN-END:variables
}
