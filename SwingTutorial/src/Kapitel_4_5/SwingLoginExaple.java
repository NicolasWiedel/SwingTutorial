package Kapitel_4_5;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class SwingLoginExaple {

	private JFrame jFrame;
	private Container contentPane; 
	
	public SwingLoginExaple(){
		initUI();
		
		createMenu();
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
