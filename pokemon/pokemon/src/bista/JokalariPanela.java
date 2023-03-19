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
import javax.swing.Icon;
import java.awt.GridLayout;

public class JokalariPanela extends JFrame {
	private JPanel panelJokalari;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JPanel panelEkipoa;
	private PokemonPanela[] PanelZer = new PokemonPanela[3];

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
		setBounds(100, 100, 338, 68);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		getContentPane().add(getPanelJokalari(), BorderLayout.WEST);
		getContentPane().add(getPanelEkipoa(), BorderLayout.CENTER);
	}
	private JPanel getPanelJokalari() {
		if (panelJokalari == null) {
			panelJokalari = new JPanel();
			panelJokalari.add(getBtnNewButton_1());
			panelJokalari.add(getLblNewLabel());
		}
		return panelJokalari;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("<dynamic>");
			btnNewButton.setBackground(Color.GREEN);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel((Icon) null);
		}
		return lblNewLabel;
	}
	private JPanel getPanelEkipoa() {
		if (panelEkipoa == null) {
			panelEkipoa = new JPanel();
			panelEkipoa.setLayout(new GridLayout(1, 3, 0, 0));
			ekipoaLortu(3);
		}
		return panelEkipoa;
	}
	private void ekipoaLortu(int kop) {
		int ind=0;
		while(ind<3) {
			PokemonPanela p = new PokemonPanela();
			this.PanelZer[ind]= p;
			ind++;
			this.panelEkipoa.add(p);
		}
	}
	
}
