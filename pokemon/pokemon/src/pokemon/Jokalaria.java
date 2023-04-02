package pokemon;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

public class Jokalaria extends Observable{
	private PokemonZerrenda pokemonZer;
	private String izena;
	private int id;
	private boolean turnoa;
	private boolean galdu;
	
	public Jokalaria(int pKop, int pId) {
		this.pokemonZer = new PokemonZerrenda();
		this.izena="Jokalari"+(pId+1);
		for (int i=0;i<pKop;i++) {
			int mota=new Random().nextInt(4);
			Pokemon pok=PokemonFactory.getPokemonFactory().createPokemon(mota,pId);
			this.pokemonZer.gehituPokemon(pok);
		}
		this.id=pId;
		this.turnoa=false;
		this.galdu=false;
	}
	public String getName() {
		return this.izena;
	}
	public void setName(String pIzena) {
		this.izena=pIzena;
	}
	public PokemonZerrenda getPokemonZer() {
		return this.pokemonZer;
	}
	public void erasoEgin() {
		if(this.getBizirikDaudenak().getSize()==0) {
			this.setGaldu();
			System.out.println(this.getName() + "-ek galdu du");
			Nagusia.getNagusia().amaitu();
		}
	}
	public void berriztuPokemonak() {
		this.pokemonZer.berriztu();
	}
	public int getId() {
		return this.id;
	}
	public boolean jokalariDa(int pId) {
		return this.id==pId;
	}
	public Pokemon aurkituPokemonIdz(int pId) {
		return this.pokemonZer.aurkituPokemonIdz(pId);
	}
	public void setTurnoa(boolean b) {
		this.turnoa=b;
		Object[] infoArray= {this.getTurnoa(),this.getGaldu()};
		this.setChanged();
		this.notifyObservers(infoArray);
	}
	public boolean getTurnoa() {
		return this.turnoa;
	}
	public PokemonZerrenda getBizirikDaudenak(){
		return this.pokemonZer.getBizirikDaudenak();
	}
	public boolean getGaldu() {
		return this.galdu;
	}
	public void setGaldu() {
		this.galdu=true;
	}
}
