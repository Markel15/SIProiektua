package pokemon;

public class PokemonFactory {
	private static PokemonFactory inst=null;
	private int kont=0;
	
	private PokemonFactory() {
		
	}
	
	public static PokemonFactory getPokemonFactory() {
		if (inst == null) {
			inst = new PokemonFactory();
		}
		return inst;
	}
	
	public Pokemon createPokemon(int pMota,int pJokId) {
		Pokemon p = null;
		if (pMota==0) {
			p = new PokemonUra(kont,pJokId);
		}
		else if (pMota==1) {
			p = new PokemonSua(kont,pJokId);
		}
		else if (pMota==2) {
			p = new PokemonBelarra(kont,pJokId);
		}
		else if (pMota==3) {
			p = new PokemonElektrikoa(kont,pJokId);
		}
		kont++;
		return p;
	}
}
