package bista;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

public class JokalariPanela extends JFrame {
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokalariPanela frame = new JokalariPanela("Burrukalaria",3);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JokalariPanela(String pIzena, int pKop) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(getLblTrainer(), BorderLayout.CENTER);
		getContentPane().add(getBtnNewButton(), BorderLayout.NORTH);
		setLocationRelativeTo(null);
		pack();
		this.getBtnNewButton().setText(pIzena);
	}

	private JLabel getLblTrainer() {
		if (lblNewLabel == null) {
			int zenb = new Random().nextInt(6);
			lblNewLabel = new JLabel(new ImageIcon("./src/irudiak/Trainers/trainer"+zenb+".png"));
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("g@!");
			btnNewButton.setBackground(Color.green);
		}
		return btnNewButton;
	}
}
