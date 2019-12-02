package Kapitel_4_5;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingLoginExaple {

	private JFrame jFrame;
	private Container contentPane; 
	
	private JLabel lbluser;
	private JLabel lblPassword;
	private JTextField tfUser;
	private JPasswordField pwfPassword;
	private JButton btnLogin;
	private JButton btnReset;
	private JCheckBox cbShowPassword;
	private JCheckBox cbHidePassword;
	
	public SwingLoginExaple(){
		initUI();
		
		createMenu();
		
		createComponents();
		
		setLayoutManager();
		
		addComponentsToContentPane();
		
		setLocationOfComponents();
	}
	
	private void initUI(){
		jFrame = new JFrame("Login");
		jFrame.setSize(400, 400);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = jFrame.getContentPane();
		jFrame.setVisible(true);
	}
	
	private void createMenu(){
		JMenuBar bar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");
		
		bar.add(fileMenu);
		bar.add(editMenu);
		bar.add(sourceMenu);
		
		jFrame.setJMenuBar(bar);
		
		JMenuItem exitItem = new JMenuItem("Exit", new ImageIcon("src/images/xmark.png"));
		exitItem.addActionListener(e -> {
			System.exit(0);
		});
		
		fileMenu.add(exitItem);
	}
	
	private void createComponents() {
		lbluser = new JLabel("Username: ");
		lblPassword = new JLabel("Passwort: ");
		
		tfUser = new JTextField();
		pwfPassword = new JPasswordField();
		
		btnLogin = new JButton("Login");
		btnReset = new JButton("Reset");
		
		cbShowPassword = new JCheckBox("Passwort anzeigen");
		cbHidePassword = new JCheckBox("Passwort verbergen");
	}
	
	private void addComponentsToContentPane() {
		contentPane.add(lbluser);
		contentPane.add(lblPassword);
		contentPane.add(tfUser);
		contentPane.add(pwfPassword);
		contentPane.add(cbHidePassword);
		contentPane.add(cbShowPassword);
		contentPane.add(btnLogin);
		contentPane.add(btnReset);
	}
	
	private void setLayoutManager() {
//		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 30, 30);
//		GridLayout layout = new GridLayout(4, 2, 30, 30);
		
		contentPane.setLayout(null);
	}
	
	private void setLocationOfComponents() {
		lbluser.setBounds(50, 150, 100, 30);
		lblPassword.setBounds(50, 220, 100, 30);
		tfUser.setBounds(150, 150, 150, 30);
		pwfPassword.setBounds(150, 220, 150, 30);
		cbShowPassword.setBounds(150, 250, 150, 30);
		btnLogin.setBounds(50, 300, 100, 30);
		btnReset.setBounds(200, 300, 100, 30);
	
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingLoginExaple();
			}
		});
	}
}
