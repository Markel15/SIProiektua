package bista;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

import pokemon.Bot;
import pokemon.JokalariKatalogoa;
import pokemon.Nagusia;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JokalariPanela extends JFrame implements Observer{
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JPanel panel;
	private JPanel panel_1;
	private int jokId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokalariPanela frame = new JokalariPanela(0,"Burrukalaria",3);
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
	public JokalariPanela(int pId,String pIzena, int pKop) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(getPanel(), BorderLayout.WEST);
		getContentPane().add(getPanel_Pokemon(), BorderLayout.CENTER);
		getPanel_Pokemon().setLayout(new GridLayout(1, pKop, 2, 0));
		for (int i=0;i<pKop;i++) {
			PokemonPanela pp=new PokemonPanela(pId,i);
			this.getPanel_Pokemon().add(pp);
		}
		this.setTitle(pIzena);
		this.jokId=pId;
		if(!(JokalariKatalogoa.getnJK().jokalariAurkituIdz(pId) instanceof Bot)) this.getBtnNewButton().setEnabled(true);
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
			btnNewButton.setEnabled(false);
			btnNewButton.addMouseListener(new MouseHandler());
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
	public int getJokId() {
		return this.jokId;
	}
	private class MouseHandler extends MouseAdapter{
		 @Override
	        public void mouseClicked(final MouseEvent e) {
			 	if(JokalariKatalogoa.getnJK().jokalariAurkituIdz(JokalariPanela.this.getJokId()).getTurnoa() && ! (JokalariKatalogoa.getnJK().jokalariAurkituIdz(JokalariPanela.this.getJokId())instanceof Bot)) {
			 		for (int i=0;i<JokalariPanela.this.getPanel_Pokemon().getComponentCount();i++) {//Igual se puede hacer con lo de Java8
			 			PokemonPanela pp=(PokemonPanela)JokalariPanela.this.getPanel_Pokemon().getComponent(i);
			 			if(!JokalariKatalogoa.getnJK().jokalariAurkituIdz(JokalariPanela.this.getJokId()).getPokemonZer().aurkituPokemonIdz(pp.getPokId()).bizirikDago()) {
			 				pp.setLblDisabled();
			 			}
			 		}
			 		Nagusia.getNagusia().hasi();
			 	}
			 	
		 }
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Object [] arr= (Object[]) arg;
		int id=(int) arr[0];
		boolean turnoa=(boolean)arr[1];
		if(turnoa) {
			this.getBtnNewButton().setText("g@!");
			this.getBtnNewButton().setBackground(Color.green);
		}
		else {
			this.getBtnNewButton().setText("wait");
			this.getBtnNewButton().setBackground(Color.yellow);
			for (int i=0;i<JokalariPanela.this.getPanel_Pokemon().getComponentCount();i++) {//Igual se puede hacer con lo de Java8
	 			PokemonPanela pp=(PokemonPanela)JokalariPanela.this.getPanel_Pokemon().getComponent(i);
	 		}
		}
	}
}
