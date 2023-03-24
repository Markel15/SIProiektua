package bista;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import pokemon.Jokalaria;
import pokemon.Bot;
import pokemon.JokalariKatalogoa;
import pokemon.Nagusia;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;

public class Menu extends JFrame implements Observer{
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_7;
	private JPanel panel_6;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel imageLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					frame.pack();
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(1, 2, 0, 0));
		getContentPane().add(getPanel());
		getContentPane().add(getPanel_1());
		Nagusia.getNagusia().addObserver(this);

	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			panel.add(getImageLabel());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(2, 1, 0, 0));
			panel_1.add(getPanel_2());
			panel_1.add(getPanel_3());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new GridLayout(0, 2, 0, 0));
			panel_2.add(getLblNewLabel());
			panel_2.add(getTextField());
			panel_2.add(getLblNewLabel_1());
			panel_2.add(getTextField_1());
			panel_2.add(getLblNewLabel_2());
			panel_2.add(getTextField_2());
			panel_2.add(getLblNewLabel_3());
			panel_2.add(getTextField_3());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(2, 2, 0, 0));
			panel_3.add(getPanel_4());
			panel_3.add(getPanel_5());
			panel_3.add(getPanel_7());
			panel_3.add(getPanel_6());
		}
		return panel_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Players");
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Bots");
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("milisec/round");
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("pokemon");
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
		}
		return panel_5;
	}
	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
		}
		return panel_7;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setLayout(new GridLayout(0, 1, 0, 0));
			panel_6.add(getBtnreadMe());
			panel_6.add(getBtn_Start());
		}
		return panel_6;
	}
	private JButton getBtnreadMe() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("readME");
			btnNewButton.setBackground(Color.DARK_GRAY);
			btnNewButton.setForeground(Color.yellow);
			btnNewButton.addActionListener(new botoiKontroladore());
		}
		return btnNewButton;
	}
	private JButton getBtn_Start() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Start");
			btnNewButton_1.setBackground(new Color(07525510));
			btnNewButton_1.setForeground(Color.ORANGE);
			btnNewButton_1.addActionListener(new botoiKontroladore());
		}
		return btnNewButton_1;
	}
	private JLabel getImageLabel() {
		if (imageLabel == null) {
			imageLabel = new JLabel(new ImageIcon("./src/irudiak/main.png"));
		}
		return imageLabel;
	}
	private class botoiKontroladore implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==getBtn_Start()) {//Hurrengo orria ireki eta partida inizializatu
				boolean ondo=false;
				try {
				Nagusia.getNagusia().partidaInizializatu(1 ,1, 5,3);//Integer.parseInt(getTextField_2().getText(), para leer el bloque de texto
				Nagusia.getNagusia().hasi();
				setVisible(false);
				}
				catch(NumberFormatException ex) { //Sartutakoa int ez bada, kudeatu
					System.out.println("Sartutako datuek ez dute balio, saiatu berriz.");
					getTextField().setText("");
					getTextField_1().setText("");
					getTextField_2().setText("");
					getTextField_3().setText("");
				}
			}
			else {
				readMe rm=new readMe();
				rm.setVisible(true);
				setVisible(false);
			}
		}
		
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Jokalaria j=JokalariKatalogoa.getnJK().jokalariAurkituIdz((int)arg);
		JokalariPanela jp=new JokalariPanela((int)arg,j.getName(),3);
		jp.setVisible(true);
		for(int i=0;i<3;i++) {
			j.getPokemonZer().getPokemon_I(i).addObserver((Observer) jp.getPanel_Pokemon().getComponent(i) );
			j.berriztuPokemonak();
		}
	}
}
