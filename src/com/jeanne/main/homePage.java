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



public class homePage extends javax.swing.JFrame {

	public homePage() {
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
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelBorder1 = new com.jeanne.swing.PanelBorder();
                lblLogo = new javax.swing.JLabel();
                lblProfile = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                btnFjob = new javax.swing.JButton();
                btnHire = new javax.swing.JButton();
                panel1 = new com.jeanne.swing.Panel();
                btnSignOut = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                setUndecorated(true);
                setResizable(false);

                panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                lblLogo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblLogo.setForeground(new java.awt.Color(255, 255, 255));
                lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jeanne/icon/logo.png"))); // NOI18N
                lblLogo.setText(" Jobawockeez");
                lblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panelBorder1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 50));

                lblProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jeanne/icon/profile.png"))); // NOI18N
                lblProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panelBorder1.add(lblProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 80, 70));

                jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Looking For Amazing Workers?");
                panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 220, -1));

                jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("I'm An Employer");
                panelBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 220, -1));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jeanne/icon/employer.png"))); // NOI18N
                panelBorder1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, 100));

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jeanne/icon/line.png"))); // NOI18N
                panelBorder1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 480));

                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jeanne/icon/emoployee.png"))); // NOI18N
                jLabel6.setText("jLabel6");
                panelBorder1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 80, -1));

                jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel7.setText("I'm A Worker");
                panelBorder1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 220, -1));

                jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel8.setText("Looking To Find Work");
                panelBorder1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 220, -1));

                btnFjob.setBackground(new java.awt.Color(0, 204, 255));
                btnFjob.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnFjob.setForeground(new java.awt.Color(255, 255, 255));
                btnFjob.setText("Looking For A Job");
                btnFjob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnFjob.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnFjobActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnFjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 220, 50));

                btnHire.setBackground(new java.awt.Color(0, 204, 255));
                btnHire.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnHire.setForeground(new java.awt.Color(255, 255, 255));
                btnHire.setText("Start Hiring Today");
                btnHire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnHire.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnHireActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnHire, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 220, 50));
                panelBorder1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 970, 480));

                btnSignOut.setBackground(new java.awt.Color(0, 51, 204));
                btnSignOut.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnSignOut.setForeground(new java.awt.Color(255, 255, 255));
                btnSignOut.setText("Sign Out");
                btnSignOut.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSignOutActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 600, 120, 30));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

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
	
        private void btnFjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFjobActionPerformed
                new JobHuntFrame().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnFjobActionPerformed

        private void btnHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireActionPerformed
                // TODO add your handling code here:
		new EmployerForm().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnHireActionPerformed

        private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
                // TODO add your handling code here:
		JFrame frame = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Sign Out?", "Jobawockeez", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
		new homePageNoUser().setVisible(true);
		this.setVisible(false);
		}
        }//GEN-LAST:event_btnSignOutActionPerformed

	
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
			java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new homePageNoUser().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnFjob;
        private javax.swing.JButton btnHire;
        private javax.swing.JButton btnSignOut;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel lblLogo;
        private javax.swing.JLabel lblProfile;
        private com.jeanne.swing.Panel panel1;
        private com.jeanne.swing.PanelBorder panelBorder1;
        // End of variables declaration//GEN-END:variables
}
