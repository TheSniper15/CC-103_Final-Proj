package com.jeanne.main;

import com.jeanne.swing.ScrollBar;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JobHuntFrame extends javax.swing.JFrame {

	public JobHuntFrame() {
		initComponents();
		Connect();
		tbl();
		Fetch();
		LoadProductNo();
		employmentType();
		initMoving(this);
	}
	
	public void tbl()
	{
		spTable.setVerticalScrollBar(new ScrollBar());
		spTable.getVerticalScrollBar().setBackground(Color.WHITE);
		spTable.getViewport().setBackground(Color.WHITE);
	}
	
	private void employmentType() 
	{
		txtEmptype.addItem("GIG");
		txtEmptype.addItem("Part - Time");
		txtEmptype.addItem("Full - Time");
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
	
	private void Fetch()
	{
		try 
		{
			String jobtype = txtJobtype.getSelectedItem().toString();
			String emptype = txtEmptype.getSelectedItem().toString();
			
			pst = con.prepareStatement("SELECT * FROM job_tbl");	
			rs = pst.executeQuery();
			int q;
			
			while(rs.next())
			{
				String jtype = rs.getString("jobtype");
				String etype = rs.getString("etype");
				
				if((jobtype.equals("All")) && (emptype.equals("All")))
				{
					pst = con.prepareStatement("SELECT * FROM job_tbl");	
					rs = pst.executeQuery();
					ResultSetMetaData rss = rs.getMetaData();
					q = rss.getColumnCount();

					DefaultTableModel df = (DefaultTableModel)table.getModel();
					df.setRowCount(0);
					while(rs.next())
					{
						Vector v2 = new Vector();
						for(int a = 1; a <= q; a++)
						{
							v2.add(rs.getString("jobtype"));
							v2.add(rs.getString("descrpt"));
							v2.add(rs.getString("salary"));
							v2.add(rs.getString("etype"));
							v2.add(rs.getString("email"));
						}
					df.addRow(v2);
					}
				}
				else if((jobtype.equals(jtype)) && (emptype.equals(etype)))
				{
					pst = con.prepareStatement("SELECT * FROM job_tbl WHERE jobtype LIKE '%" + jobtype + "%' AND etype LIKE '%" + emptype + "%'");	
					rs = pst.executeQuery();
					ResultSetMetaData rss = rs.getMetaData();
					q = rss.getColumnCount();

					DefaultTableModel df = (DefaultTableModel)table.getModel();
					df.setRowCount(0);
					while(rs.next())
					{
						Vector v2 = new Vector();
						for(int a = 1; a <= q; a++)
						{
							v2.add(rs.getString("jobtype"));
							v2.add(rs.getString("descrpt"));
							v2.add(rs.getString("salary"));
							v2.add(rs.getString("etype"));
							v2.add(rs.getString("email"));
						}
					df.addRow(v2);
					}
				}
				else if((jobtype.equals(jtype)) && (emptype.equals("All")))
				{
					pst = con.prepareStatement("SELECT * FROM job_tbl WHERE jobtype LIKE '%" + jobtype + "%'");	
					rs = pst.executeQuery();
					ResultSetMetaData rss = rs.getMetaData();
					q = rss.getColumnCount();

					DefaultTableModel df = (DefaultTableModel)table.getModel();
					df.setRowCount(0);
					while(rs.next())
					{
						Vector v2 = new Vector();
						for(int a = 1; a <= q; a++)
						{
							v2.add(rs.getString("jobtype"));
							v2.add(rs.getString("descrpt"));
							v2.add(rs.getString("salary"));
							v2.add(rs.getString("etype"));
							v2.add(rs.getString("email"));
						}
					df.addRow(v2);
					}
				}
				else if((jobtype.equals("All")) && (emptype.equals(etype)))
				{
					pst = con.prepareStatement("SELECT * FROM job_tbl WHERE etype LIKE '%" + emptype + "%'");	
					rs = pst.executeQuery();
					ResultSetMetaData rss = rs.getMetaData();
					q = rss.getColumnCount();

					DefaultTableModel df = (DefaultTableModel)table.getModel();
					df.setRowCount(0);
					while(rs.next())
					{
						Vector v2 = new Vector();
						for(int a = 1; a <= q; a++)
						{
							v2.add(rs.getString("jobtype"));
							v2.add(rs.getString("descrpt"));
							v2.add(rs.getString("salary"));
							v2.add(rs.getString("etype"));
							v2.add(rs.getString("email"));
						}
					df.addRow(v2);
					}
				}
				else
				{
					DefaultTableModel df = (DefaultTableModel)table.getModel();
					df.setRowCount(0);
				}
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(JobHuntFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
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
                jLabel4 = new javax.swing.JLabel();
                btnBack = new javax.swing.JButton();
                btnSearch = new javax.swing.JButton();
                txtEmptype = new javax.swing.JComboBox<>();
                txtJobtype = new javax.swing.JComboBox<>();
                spTable = new javax.swing.JScrollPane();
                table = new javax.swing.JTable();
                panel2 = new com.jeanne.swing.Panel2();
                panel1 = new com.jeanne.swing.Panel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBounds(new java.awt.Rectangle(0, 0, 0, 0));
                setMaximumSize(new java.awt.Dimension(1100, 650));
                setMinimumSize(new java.awt.Dimension(1100, 650));
                setUndecorated(true);
                setResizable(false);
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

                jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Available Jobs");
                panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 122, -1, 50));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel2.setText("-----------------------");
                panelBorder1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 230, -1));

                jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Enployment Type");
                panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

                jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Job Category");
                panelBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

                btnBack.setBackground(new java.awt.Color(0, 153, 255));
                btnBack.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                btnBack.setForeground(new java.awt.Color(255, 255, 255));
                btnBack.setText("Back");
                btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 120, 40));

                btnSearch.setBackground(new java.awt.Color(51, 51, 255));
                btnSearch.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
                btnSearch.setForeground(new java.awt.Color(255, 255, 255));
                btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jeanne/icon/search.png"))); // NOI18N
                btnSearch.setText("Search");
                btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnSearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSearchActionPerformed(evt);
                        }
                });
                panelBorder1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 120, 40));

                txtEmptype.setBackground(new java.awt.Color(51, 51, 255));
                txtEmptype.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                txtEmptype.setForeground(new java.awt.Color(255, 255, 255));
                txtEmptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
                txtEmptype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                txtEmptype.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtEmptypeActionPerformed(evt);
                        }
                });
                panelBorder1.add(txtEmptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 190, 30));

                txtJobtype.setBackground(new java.awt.Color(51, 51, 255));
                txtJobtype.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                txtJobtype.setForeground(new java.awt.Color(255, 255, 255));
                txtJobtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
                txtJobtype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                txtJobtype.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtJobtypeActionPerformed(evt);
                        }
                });
                panelBorder1.add(txtJobtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, 30));

                spTable.setBackground(new java.awt.Color(0, 102, 204));
                spTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                spTable.setForeground(new java.awt.Color(0, 102, 204));

                table.setBackground(new java.awt.Color(0, 102, 204));
                table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
                table.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
                table.setForeground(new java.awt.Color(255, 255, 255));
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "TYPE OF JOB", "DESCRIPTION", "SALARY", "ENPLOYMENT  TYPE", "EMAIL"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                table.setGridColor(new java.awt.Color(0, 102, 204));
                table.setRowHeight(50);
                table.setRowMargin(5);
                table.setSelectionBackground(new java.awt.Color(0, 102, 204));
                table.setSelectionForeground(new java.awt.Color(255, 255, 255));
                table.getTableHeader().setReorderingAllowed(false);
                spTable.setViewportView(table);
                if (table.getColumnModel().getColumnCount() > 0) {
                        table.getColumnModel().getColumn(0).setResizable(false);
                        table.getColumnModel().getColumn(1).setResizable(false);
                        table.getColumnModel().getColumn(2).setResizable(false);
                        table.getColumnModel().getColumn(3).setResizable(false);
                        table.getColumnModel().getColumn(4).setResizable(false);
                }

                panelBorder1.add(spTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 670, 380));
                panelBorder1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 430));
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
	
        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                new homePage().setVisible(true);
		this.setVisible(false);
        }//GEN-LAST:event_btnBackActionPerformed

        private void txtJobtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobtypeActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtJobtypeActionPerformed

        private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
                // TODO add your handling code here:
		Fetch();	
        }//GEN-LAST:event_btnSearchActionPerformed

        private void txtEmptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmptypeActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtEmptypeActionPerformed

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
			java.util.logging.Logger.getLogger(JobHuntFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JobHuntFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JobHuntFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JobHuntFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JobHuntFrame().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnSearch;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel lblLogo;
        private javax.swing.JLabel lblProfile;
        private com.jeanne.swing.Panel panel1;
        private com.jeanne.swing.Panel2 panel2;
        private com.jeanne.swing.PanelBorder panelBorder1;
        private javax.swing.JScrollPane spTable;
        private javax.swing.JTable table;
        private javax.swing.JComboBox<String> txtEmptype;
        private javax.swing.JComboBox<String> txtJobtype;
        // End of variables declaration//GEN-END:variables
}
