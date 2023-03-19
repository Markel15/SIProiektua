package pokemon;

import java.util.ArrayList;
import java.util.Iterator;

public class PokemonZerrenda {
	private ArrayList<Pokemon> pokemonZer;
	
	public PokemonZerrenda() {
		this.pokemonZer = new ArrayList<>();
	}
	
	public void gehituPokemon(Pokemon pok) {
			this.pokemonZer.add(pok);
			pok.inprimatu();
	}
	public Pokemon getPokemon_I(int i) {
		return pokemonZer.get(i);
	}
	private Iterator<Pokemon> getIter(){
		return pokemonZer.iterator();
	}
	public void berriztu() {
		Iterator<Pokemon> iter=this.getIter();
		while(iter.hasNext()) {
			Pokemon pok=iter.next();
			pok.berriztuInfo();
		}
	}
}
