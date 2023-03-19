package pokemon;

import java.util.Observable;
import java.util.Random;

public class Jokalaria  extends Observable{
	private PokemonZerrenda pokemonZer;
	private String izena;
	
	public Jokalaria(int pKop, int pId) {
		this.pokemonZer = new PokemonZerrenda();
		this.izena="Jokalari"+pId;
		for (int i=0;i<pKop;i++) {
			int mota=new Random().nextInt(4);
			Pokemon pok=PokemonFactory.getPokemonFactory().createPokemon(mota);
			this.pokemonZer.gehituPokemon(pok);
		}
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
	public void erasoEgin(Pokemon nori) {
		
	}
	public void berriztuPokemonak() {
		this.pokemonZer.berriztu();
	}
}
