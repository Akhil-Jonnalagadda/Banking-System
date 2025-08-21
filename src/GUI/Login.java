package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
//	 */
//	public static void main(String[] args) 
//	{
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login window = new Login();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
				java.awt.GradientPaint gp = new java.awt.GradientPaint(0, 0, new java.awt.Color(135, 206, 250), 0, getHeight(), new java.awt.Color(60, 179, 113));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Banking System");
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Banking System");
		label.setFont(new Font("Segoe UI", Font.BOLD, 28));
		label.setBounds(120, 30, 300, 40);
		label.setHorizontalAlignment(JLabel.CENTER);
	label.setForeground(new java.awt.Color(0, 70, 70));
		frame.getContentPane().add(label);

		JLabel lblLoginScreen = new JLabel("Welcome! Please Login");
		lblLoginScreen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblLoginScreen.setBounds(120, 80, 300, 30);
		lblLoginScreen.setHorizontalAlignment(JLabel.CENTER);
	lblLoginScreen.setForeground(new java.awt.Color(0, 128, 128));
		frame.getContentPane().add(lblLoginScreen);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblUsername.setBounds(100, 140, 100, 30);
	lblUsername.setForeground(new java.awt.Color(60, 179, 113));
		frame.getContentPane().add(lblUsername);

		textField = new JTextField();
		textField.setBounds(210, 140, 180, 30);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setText("akhil");
	textField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 206, 250), 2, true));
	textField.setBackground(new java.awt.Color(224, 255, 255));
		frame.getContentPane().add(textField);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblPassword.setBounds(100, 190, 100, 30);
	lblPassword.setForeground(new java.awt.Color(0, 128, 128));
		frame.getContentPane().add(lblPassword);

		textField_1 = new JPasswordField();
		textField_1.setBounds(210, 190, 180, 30);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		textField_1.setColumns(10);
	textField_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 179, 113), 2, true));
	textField_1.setBackground(new java.awt.Color(224, 255, 255));
		frame.getContentPane().add(textField_1);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 18));
	btnLogin.setBackground(new java.awt.Color(60, 179, 113));
	btnLogin.setForeground(new java.awt.Color(255, 255, 255));
	btnLogin.setFocusPainted(false);
	btnLogin.setBounds(180, 250, 140, 40);
	btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 206, 250), 2, true));
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String user, pass;
				user = textField.getText();
				pass = textField_1.getText();
				if (user.equals("akhil") && pass.equals("123")) {
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
					frame.setVisible(false);
					GUIForm.menu.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Failed");
				}
			}
		});
		frame.getContentPane().add(btnLogin);
	}
}