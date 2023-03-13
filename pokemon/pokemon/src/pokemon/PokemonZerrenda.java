package pokemon;

import java.util.ArrayList;
import java.util.Random;

public class PokemonZerrenda {
	private ArrayList<Pokemon> pokemonZer;
	
	public PokemonZerrenda() {
		this.pokemonZer = new ArrayList<>();
	}
	
	private Pokemon sortuPokemonAusaz() {
		Pokemon p = null;
		int mota = new Random().nextInt(4);
		PokemonFactory f = PokemonFactory.getPokemonFactory();
		
		
		if (mota == 0) {
			p = f.sortuPokemon("Ur");
		}
		else if (mota == 1) {
			p = f.sortuPokemon("Su");
		}
		else if (mota == 2) {
			p = f.sortuPokemon("Belar");
		}
		else if (mota == 3) {
			p = f.sortuPokemon("Elektriko");
		}
		return p;
	}
	
	public void gehituPokemon() {
		this.pokemonZer.add(this.sortuPokemonAusaz());
	}
}
