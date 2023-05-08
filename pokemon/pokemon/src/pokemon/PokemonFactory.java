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
	
	public Pokemon createPokemon(int pMota,int pJokId, int pPokId) {
		Pokemon p = null;
		if (pMota==0) {
			p = new PokemonUra(pPokId,pJokId);
		}
		else if (pMota==1) {
			p = new PokemonSua(pPokId,pJokId);
		}
		else if (pMota==2) {
			p = new PokemonBelarra(pPokId,pJokId);
		}
		else if (pMota==3) {
			p = new PokemonElektrikoa(pPokId,pJokId);
		}
		else if (pMota==4) {
			p = new PokemonArroka(pPokId,pJokId);
		}
		else if (pMota==5) {
			p = new PokemonBorroka(pPokId,pJokId);
		}
		else if (pMota==6) {
			p = new PokemonDragoia(pPokId,pJokId);
		}
		else if (pMota==7) {
			p = new PokemonHegalaria(pPokId,pJokId);
		}
		else if (pMota==8) {
			p = new PokemonMamua(pPokId,pJokId);
		}
		else if (pMota==9) {
			p = new PokemonPsikikoa(pPokId,pJokId);
		}
		else if (pMota==10) {
			p = new PokemonZomorro(pPokId,pJokId);
		}
		return p;
	}
}
