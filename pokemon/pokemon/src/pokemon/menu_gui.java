package pokemon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class menu_gui extends JFrame {
	
	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_gui frame = new menu_gui();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu_gui() {
		frame = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ImageIcon imageIcon = new ImageIcon("./src/irudiak/main.png");
		frame.getContentPane().setLayout(new GridLayout(1, 2, 0, 0));
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(Color.WHITE);
	    frame.getContentPane().add(panel);
	    
	    JLabel imageLabel = new JLabel(imageIcon);
	    panel.add(imageLabel);
	    
	    JPanel panel_1 = new JPanel();
	    frame.getContentPane().add(panel_1);
	    panel_1.setLayout(new GridLayout(2, 1, 0, 0));
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(Color.WHITE);
	    panel_1.add(panel_2);
	    panel_2.setLayout(new GridLayout(4, 2, 0, 0));
	    
	    JLabel lblNewLabel = new JLabel("Players");
	    panel_2.add(lblNewLabel);
	    
	    textField = new JTextField();
	    panel_2.add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblNewLabel_1 = new JLabel("Bots");
	    panel_2.add(lblNewLabel_1);
	    
	    textField_1 = new JTextField();
	    panel_2.add(textField_1);
	    textField_1.setColumns(10);
	    
	    JLabel lblNewLabel_2 = new JLabel("milisec/round");
	    panel_2.add(lblNewLabel_2);
	    
	    textField_2 = new JTextField();
	    panel_2.add(textField_2);
	    textField_2.setColumns(10);
	    
	    JLabel lblNewLabel_3 = new JLabel("pokemon");
	    panel_2.add(lblNewLabel_3);
	    
	    textField_3 = new JTextField();
	    panel_2.add(textField_3);
	    textField_3.setColumns(10);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(Color.WHITE);
	    panel_1.add(panel_3);
	    panel_3.setLayout(new GridLayout(2, 2, 0, 0));
	    
	    JLabel lblNewLabel_4 = new JLabel("");
	    panel_3.add(lblNewLabel_4);
	    
	    JLabel lblNewLabel_5 = new JLabel("");
	    panel_3.add(lblNewLabel_5);
	    
	    JLabel lblNewLabel_6 = new JLabel("");
	    panel_3.add(lblNewLabel_6);
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(Color.WHITE);
	    panel_3.add(panel_4);
	    
	    JButton btnNewButton = new JButton("start");
	    panel_4.add(btnNewButton);
	    
	    JButton btnNewButton_1 = new JButton("readme");
	    panel_4.add(btnNewButton_1);
	    frame.pack();

		setContentPane(contentPane);
	}

}
