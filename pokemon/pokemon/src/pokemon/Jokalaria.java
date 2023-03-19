package pokemon;

import java.util.Observable;

public class Jokalaria  {
	private PokemonZerrenda pokemonZer;
	private String izena;
	
	public Jokalaria(int pKop, int pId) {
		this.pokemonZer = new PokemonZerrenda();
		this.izena="Jokalari"+pId;
		this.sortuTaldea(pKop);
	}
	public void sortuTaldea(int pKop) {
		for (int i=0;i<pKop;i++){
			this.pokemonZer.gehituPokemon();
		}
	}
	public String getName() {
		return this.izena;
	}
	public void setName(String pIzena) {
		this.izena=pIzena;
	}
	public void erasoEgin(Pokemon nori) {
		
	}
}
