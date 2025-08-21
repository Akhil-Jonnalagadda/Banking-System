package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.FileIO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Banking System");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 474);
		contentPane = new JPanel() {
			@Override
			protected void paintComponent(java.awt.Graphics g) {
				super.paintComponent(g);
				java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
				java.awt.GradientPaint gp = new java.awt.GradientPaint(0, 0, new java.awt.Color(135, 206, 250), 0, getHeight(), new java.awt.Color(60, 179, 113));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblBankingSystem = new JLabel("Banking System");
		lblBankingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBankingSystem.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBankingSystem.setBounds(0, 69, 613, 59);
		contentPane.add(lblBankingSystem);
		
		FileIO.Read();
		
//		JButton btnAddAccount = new JButton("Add Account");
//		btnAddAccount.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(!GUIForm.addaccount.isVisible())
//				{
//					GUIForm.addaccount.setVisible(true);
//				}
//				else
//				{
//					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
//				}
//				
//			}
//		});
//		btnAddAccount.setBounds(217, 162, 194, 40);
//		contentPane.add(btnAddAccount);
		
		JButton btnDepositToAccount = new JButton("Deposit To Account");
		btnDepositToAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.depositacc.isVisible())
		lblBankingSystem.setFont(new Font("Segoe UI", Font.BOLD, 28));
		lblBankingSystem.setBounds(0, 69, 613, 59);
		lblBankingSystem.setForeground(new java.awt.Color(0, 70, 70));
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnDepositToAccount.setBounds(217, 213, 194, 33);
		contentPane.add(btnDepositToAccount);
		
		JButton btnWithdrawFromAccount = new JButton("Withdraw From Account");
		btnWithdrawFromAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.withdraw.isVisible())
				{
					GUIForm.withdraw.setVisible(true);
		btnNewButton.setBounds(217, 166, 194, 36);
		btnNewButton.setBackground(new java.awt.Color(135, 206, 250));
		btnNewButton.setForeground(new java.awt.Color(60, 179, 113));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
				
			}
			
		});
		btnWithdrawFromAccount.setBounds(217, 256, 194, 33);
		contentPane.add(btnWithdrawFromAccount);
		
		JButton btnDisplayAccountList = new JButton("Display Account List");
		btnDisplayAccountList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		btnDepositToAccount.setBounds(217, 213, 194, 33);
		btnDepositToAccount.setBackground(new java.awt.Color(135, 206, 250));
		btnDepositToAccount.setForeground(new java.awt.Color(60, 179, 113));
		btnDepositToAccount.setFont(new Font("Segoe UI", Font.BOLD, 16));
				if(!GUIForm.displaylist.isVisible())
				{
					GUIForm.displaylist.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnDisplayAccountList.setBounds(217, 300, 194, 32);
		contentPane.add(btnDisplayAccountList);
		
		JButton btnExit = new JButton("Exit");
		btnWithdrawFromAccount.setBounds(217, 256, 194, 33);
		btnWithdrawFromAccount.setBackground(new java.awt.Color(135, 206, 250));
		btnWithdrawFromAccount.setForeground(new java.awt.Color(60, 179, 113));
		btnWithdrawFromAccount.setFont(new Font("Segoe UI", Font.BOLD, 16));
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getComponent(0), "Thanks For Using") ;
				FileIO.Write();
				System.exit(0);
			}
		});
		btnExit.setBounds(217, 343, 194, 33);
		contentPane.add(btnExit);
		
		JButton btnNewButton = new JButton("Add Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.addaccount.isVisible())
			{
				GUIForm.addaccount.setVisible(true);
		btnDisplayAccountList.setBounds(217, 300, 194, 32);
		btnDisplayAccountList.setBackground(new java.awt.Color(135, 206, 250));
		btnDisplayAccountList.setForeground(new java.awt.Color(60, 179, 113));
		btnDisplayAccountList.setFont(new Font("Segoe UI", Font.BOLD, 16));
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
			
		});
		btnNewButton.setBounds(217, 166, 194, 36);
		btnExit.setBounds(217, 343, 194, 33);
		btnExit.setBackground(new java.awt.Color(60, 179, 113));
		btnExit.setForeground(new java.awt.Color(255, 255, 255));
		btnExit.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/img/1.png")));
		lblNewLabel.setBounds(397, 166, 216, 213);
		contentPane.add(lblNewLabel);
		
		//Image image=GenerateImage.toImage(true);  //this generates an image file
		ImageIcon icon = new ImageIcon("1.png");
	}
}
