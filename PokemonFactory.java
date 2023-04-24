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
		else if (pMota==4) {
			p = new PokemonArroka(kont,pJokId);
		}
		else if (pMota==5) {
			p = new PokemonBorroka(kont,pJokId);
		}
		else if (pMota==6) {
			p = new PokemonDragoia(kont,pJokId);
		}
		else if (pMota==7) {
			p = new PokemonHegalaria(kont,pJokId);
		}
		else if (pMota==8) {
			p = new PokemonMamua(kont,pJokId);
		}
		else if (pMota==9) {
			p = new PokemonPsikikoa(kont,pJokId);
		}
		else if (pMota==10) {
			p = new PokemonZomorro(kont,pJokId);
		}
		kont++;
		return p;
	}
}
