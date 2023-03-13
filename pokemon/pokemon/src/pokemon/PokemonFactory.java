package pokemon;

public class PokemonFactory {
	private static PokemonFactory inst;
	
	private PokemonFactory() {
		
	}
	
	public static PokemonFactory getPokemonFactory() {
		if (inst == null) {
			inst = new PokemonFactory();
		}
		return inst;
	}
	
	public Pokemon sortuPokemon(String pMota) {
		Pokemon p = null;
		if (pMota.equals("Ur")) {
			p = new PokemonUra();
		}
		else if (pMota.equals("Su")) {
			p = new PokemonSua();
		}
		else if (pMota.equals("Belar")) {
			p = new PokemonBelarra();
		}
		else if (pMota.equals("Elektriko")) {
			p = new PokemonElektrikoa();
		}
		return p;
	}
}
