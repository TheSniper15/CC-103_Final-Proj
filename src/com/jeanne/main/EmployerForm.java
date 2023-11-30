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


public class EmployerForm extends javax.swing.JFrame {


	public EmployerForm() {
		initComponents();
		Connect();
		LoadProductNo();
		employmentType();
		initMoving(this);
	}

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	private final String uName = "root";
	private final String pass = "";
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
	
	public void LoadProductNo()
	{
		try 
		{
			pst = con.prepareStatement("SELECT type FROM jobtype_tbl");
			rs = pst.executeQuery();
			while(rs.next())
			{
				txtJobtype.addItem(rs.getString(1));
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(EmployerForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	private void employmentType() 
	{
		txtEmptype.addItem("GIG");
		txtEmptype.addItem("Part - Time");
		txtEmptype.addItem("Full - Time");
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelBorder1 = new com.jeanne.swing.PanelBorder();
                lblLogo = new javax.swing.JLabel();
                lblProfile = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                txtSalary = new javax.swing.JTextField();
                txtAddjob = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                txtEmptype = new javax.swing.JComboBox<>();
                txtJobtype = new javax.swing.JComboBox<>();
                jLabel5 = new javax.swing.JLabel();
                txtEmail = new javax.swing.JTextField();
                txtdesc = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                btnConfirm = new javax.swing.JButton();
                btnBack1 = new javax.swing.JButton();
                btnclear = new javax.swing.JButton();
                panel1 = new com.jeanne.swing.Panel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMaximumSize(new java.awt.Dimension(1100, 650));
                setMinimumSize(new java.awt.Dimension(1100, 650));
                setUndecorated(true);
                setSize(new java.awt.Dimension(1100, 650));

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

                jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Post A Job");
                panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

                jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Type Of Job");
                panelBorder1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

                jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Salary");
                panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

                txtSalary.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                panelBorder1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, 50));

                txtAddjob.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                txtAddjob.setText("Others....");
                txtAddjob.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                txtAddjobMouseClicked(evt);
                        }
                });
                panelBorder1.add(txtAddjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 280, 50));

                jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Enployment Type");
                panelBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 170, 180, -1));

                txtEmptype.setBackground(new java.awt.Color(0, 153, 255));
                txtEmptype.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                panelBorder1.add(txtEmptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 280, 40));

                txtJobtype.setBackground(new java.awt.Color(0, 153, 255));
                txtJobtype.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                txtJobtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Others" }));
                txtJobtype.setToolTipText("");
                txtJobtype.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                txtJobtypeMouseClicked(evt);
                        }
                });
                panelBorder1.add(txtJobtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 280, 40));

                jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Email");
                panelBorder1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 330, 70, -1));

                txtEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                panelBorder1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 280, 50));

                txtdesc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                panelBorder1.add(txtdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 640, 50));

                jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel6.setText("Description");
                panelBorder1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));

                btnConfirm.setBackground(new java.awt.Color(0, 51, 204));
                btnConfirm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
                btnConfirm.setText("Confirm");
                btnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnConfirm.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnConfirmActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 120, 40));

                btnBack1.setBackground(new java.awt.Color(0, 153, 255));
                btnBack1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnBack1.setForeground(new java.awt.Color(255, 255, 255));
                btnBack1.setText("Back");
                btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnBack1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBack1ActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 120, 40));

                btnclear.setBackground(new java.awt.Color(0, 51, 204));
                btnclear.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnclear.setForeground(new java.awt.Color(255, 255, 255));
                btnclear.setText("Clear");
                btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnclear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnclearActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 120, 40));
                panelBorder1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 970, 480));

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
	
        private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
                // TODO add your handling code here:
		try
                {
			String typeofjob = txtJobtype.getSelectedItem().toString();
			String othertypeofjob = txtAddjob.getText();
			String salary = txtSalary.getText();
			String enploytype = txtEmptype.getSelectedItem().toString();
			String email = txtEmail.getText();
			String desc = txtdesc.getText();
			
			if(salary.equals("") || email.equals("") || desc.equals(""))
			{
				JOptionPane.showMessageDialog(this,"Record Failed To Save!!");
			}
			else if(typeofjob.equals("Others") && othertypeofjob.equals("Others....") || typeofjob.equals("Others") && othertypeofjob.equals(""))
			{
				JOptionPane.showMessageDialog(this,"Record Failed To Save!!");
			}
			else
			{
				if((typeofjob.equals("Others")))
				{
					pst = con.prepareStatement("INSERT INTO jobtype_tbl(type)VALUES(?)");
					
					pst.setString(1, othertypeofjob);
				
					int k = pst.executeUpdate();

					if(k == 1)
					{
						JOptionPane.showMessageDialog(this,"New Job Type Added!!");
					}
				}
			
				if((typeofjob.equals("Others")))
				{
					pst = con.prepareStatement("INSERT INTO job_tbl(jobtype,descrpt,salary,etype,email)VALUES(?,?,?,?,?)");
				
					pst.setString(1, othertypeofjob);
					pst.setString(2,desc);
					pst.setString(3,salary);
					pst.setString(4,enploytype);
					pst.setString(5,email);
			
					int k = pst.executeUpdate();

					if(k == 1)
					{
						JOptionPane.showMessageDialog(this,"Record Added!!");
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Record Failed To Save!!");
					}
				}
				else
				{
					pst = con.prepareStatement("INSERT INTO job_tbl(jobtype,descrpt,salary,etype,email)VALUES(?,?,?,?,?)");
				
					pst.setString(1, typeofjob);
					pst.setString(2,desc);
					pst.setString(3,salary);
					pst.setString(4,enploytype);
					pst.setString(5,email);
			
					int k = pst.executeUpdate();

					if(k == 1)
					{
						JOptionPane.showMessageDialog(this,"Record Added!!");
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Record Failed To Save!!");
					}
				}
			}
                }
                catch (SQLException ex)
                {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
        }//GEN-LAST:event_btnConfirmActionPerformed

        private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
                // TODO add your handling code here:
		new homePage().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnBack1ActionPerformed

        private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
                // TODO add your handling code here:
		txtAddjob.setText("Others....");
		txtEmail.setText("");
		txtSalary.setText("");
		txtdesc.setText("");
			
		txtEmptype.setSelectedIndex(0);
		txtJobtype.setSelectedIndex(0);
        }//GEN-LAST:event_btnclearActionPerformed

        private void txtAddjobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddjobMouseClicked
                // TODO add your handling code here:
		txtAddjob.setText("");
		txtJobtype.setSelectedIndex(0);
        }//GEN-LAST:event_txtAddjobMouseClicked

        private void txtJobtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJobtypeMouseClicked
                // TODO add your handling code here:
		txtAddjob.setText("Others....");
        }//GEN-LAST:event_txtJobtypeMouseClicked

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
			java.util.logging.Logger.getLogger(EmployerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(EmployerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(EmployerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(EmployerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EmployerForm().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack1;
        private javax.swing.JButton btnConfirm;
        private javax.swing.JButton btnclear;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel lblLogo;
        private javax.swing.JLabel lblProfile;
        private com.jeanne.swing.Panel panel1;
        private com.jeanne.swing.PanelBorder panelBorder1;
        private javax.swing.JTextField txtAddjob;
        private javax.swing.JTextField txtEmail;
        private javax.swing.JComboBox<String> txtEmptype;
        private javax.swing.JComboBox<String> txtJobtype;
        private javax.swing.JTextField txtSalary;
        private javax.swing.JTextField txtdesc;
        // End of variables declaration//GEN-END:variables
}
