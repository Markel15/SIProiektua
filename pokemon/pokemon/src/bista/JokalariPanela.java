package bista;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class JokalariPanela extends JFrame {
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JPanel panel;
	private JPanel panel_1;

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
		getContentPane().add(getPanel(), BorderLayout.WEST);
		getContentPane().add(getPanel_Pokemon(), BorderLayout.CENTER);
		getPanel_Pokemon().setLayout(new GridLayout(1, pKop, 2, 0));
		for (int i=0;i<pKop;i++) {
			PokemonPanela pp=new PokemonPanela();
			this.getPanel_Pokemon().add(pp);
		}
		this.setTitle(pIzena);
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
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getLblTrainer(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.NORTH);		
		}
		return panel;
	}
	public JPanel getPanel_Pokemon() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
		}
		return panel_1;
	}
}
