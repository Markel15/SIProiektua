package bista;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import pokemon.Bot;
import pokemon.BurrukaKudeatzailea;
import pokemon.JokalariKatalogoa;
import pokemon.Jokalaria;
import pokemon.Pokemon;
import java.awt.CardLayout;

public class PokemonPanela extends JPanel implements Observer{
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JProgressBar progressBar;
	private int jokId;
	private int pokId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokemonPanela frame = new PokemonPanela(0,0);
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
	public PokemonPanela(int jokId, int pokId) {
		setBounds(100, 100, 450, 300);
		this.setLayout(new BorderLayout(0,0));
		this.add(getPanel(), "North");
		this.add(getPanel_1(), "Center");
		this.add(getPanel_2(), "South");
		this.jokId=jokId;
		this.pokId=pokId;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(4, 2, 0, 0));
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_5());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_6());
			panel.add(getLblNewLabel_3());
			panel.add(getLblNewLabel_7());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_8());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new CardLayout(0, 0));
			panel_1.add(getLblNewLabel(), "name_2349460432200");
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getBiziBarra());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel(new ImageIcon("./src/irudiak/Electric/0pikachu.png"));
			lblNewLabel.setHorizontalAlignment(0);
			lblNewLabel.addMouseListener(new MouseHandler());
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Attack:");
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Defense:");
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Health:");
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Type:");
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Balioa");
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Balioa");
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Balioa");
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Balioa");
		}
		return lblNewLabel_8;
	}
	private JProgressBar getBiziBarra() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			this.progressBar.setBackground(Color.white);
			this.progressBar.setForeground(Color.green);
			this.progressBar.setString("Health");
			this.progressBar.setStringPainted(true);
			this.progressBar.setBorderPainted(true);
			this.progressBar.setValue(100);
		}
		return progressBar;
	}
	public void setLblEnabled() {
		this.getLblNewLabel().setEnabled(true);
	}
	public void setLblDisabled() {
		this.getLblNewLabel().setEnabled(false);
		
	}
	public int getPokId() {
		return this.pokId;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Object [] arr= (Object[]) arg;
		int jokId=(int)arr[0];
		int pokId=(int)arr[1];
		Jokalaria jok=JokalariKatalogoa.getnJK().jokalariAurkituIdz(jokId);
		Pokemon pok=jok.aurkituPokemonIdz(pokId);
		this.getLblNewLabel_5().setText(Integer.toString(pok.getEraso()));
		this.getLblNewLabel_6().setText(Integer.toString(pok.getDef()));
		this.getLblNewLabel_7().setText(Integer.toString(pok.getBiz())+"/"+Integer.toString(pok.getBiziMax()));
		this.getLblNewLabel_8().setText(pok.getMota());
		this.getBiziBarra().setValue((pok.getBiz()*100)/pok.getBiziMax());
		if(this.getBiziBarra().getValue()<=50)this.getBiziBarra().setForeground(Color.yellow);
		if(this.getBiziBarra().getValue()<=20)this.getBiziBarra().setForeground(Color.red);
		this.setArgazkia(pok.getMota());
		if(!pok.bizirikDago()) {
			this.getPanel().setVisible(false);
			this.getLblNewLabel().setEnabled(false);
		}
	}
	private void setArgazkia(String pMota) {
		if(pMota.equals("Belarra")) {
			this.getLblNewLabel().setIcon(new ImageIcon(PokemonPanela.class.getResource("/irudiak/Grass/0bulbasaur.png")));//JAR-ean funtzionatzeko. Esportatzerakoan, src karpeta ez da JAR-ean sartzen
		}
		else if(pMota.equals("Elektrikoa")) {
			this.getLblNewLabel().setIcon(new ImageIcon(PokemonPanela.class.getResource("/irudiak/Electric/0pikachu.png")));
		}
		else if(pMota.equals("Sua")) {
			this.getLblNewLabel().setIcon(new ImageIcon(PokemonPanela.class.getResource("/irudiak/Fire/0charmander.png")));
		}
		else if(pMota.equals("Ur")) {
			this.getLblNewLabel().setIcon(new ImageIcon(PokemonPanela.class.getResource("/irudiak/Water/0squirtle.png")));
		}
	}
	private class MouseHandler extends MouseAdapter{
		 @Override
	        public void mouseClicked(final MouseEvent e) {
			 if(PokemonPanela.this.getLblNewLabel().isEnabled() && BurrukaKudeatzailea.getnBK().getErasoPokemon()==null && JokalariKatalogoa.getnJK().jokalariAurkituIdz(jokId).getTurnoa() && !(JokalariKatalogoa.getnJK().jokalariAurkituIdz(jokId) instanceof Bot)) {
				 PokemonPanela.this.getLblNewLabel().setEnabled(false);
				 BurrukaKudeatzailea.getnBK().setErasoPokemon(PokemonPanela.this.jokId,PokemonPanela.this.pokId);
			 }
			 else if(PokemonPanela.this.getLblNewLabel().isEnabled() && !JokalariKatalogoa.getnJK().jokalariAurkituIdz(jokId).getTurnoa()) {
				 BurrukaKudeatzailea.getnBK().setJasoPokemon(PokemonPanela.this.jokId,PokemonPanela.this.pokId);
				 BurrukaKudeatzailea.getnBK().burrukaKudeatu();
			 }
		 }
	}
}
