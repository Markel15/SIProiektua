package pokemon;

public class PokemonFactory {
	private static PokemonFactory inst=null;
	
	private PokemonFactory() {
		
	}
	
	public static PokemonFactory getPokemonFactory() {
		if (inst == null) {
			inst = new PokemonFactory();
		}
		return inst;
	}
	
	public Pokemon createPokemon(int pMota) {
		Pokemon p = null;
		if (pMota==0) {
			p = new PokemonUra();
		}
		else if (pMota==1) {
			p = new PokemonSua();
		}
		else if (pMota==2) {
			p = new PokemonBelarra();
		}
		else if (pMota==3) {
			p = new PokemonElektrikoa();
		}
		return p;
	}
}
