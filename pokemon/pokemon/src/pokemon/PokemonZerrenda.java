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
	public int getSize() {
		return this.pokemonZer.size();
	}
	public Pokemon aurkituPokemonIdz(int pId) {//pokemon guztietatik aurkitzeko
		Iterator<Pokemon> itr=this.getIter();
		boolean aurk=false;
		Pokemon emaitza=null;
		while(itr.hasNext()&&!aurk) {
			Pokemon pok=itr.next();
			if(pok.getId()==pId) {
				emaitza=pok;
				aurk=true;
			}
		}
		return emaitza;
	}
	public PokemonZerrenda getBizirikDaudenak() {
		PokemonZerrenda emaitza=new PokemonZerrenda();
		Iterator<Pokemon>itr=this.getIter();
		while(itr.hasNext()) {
			Pokemon p=itr.next();
			if (p.bizirikDago()) emaitza.gehituPokemon(p);
		}
		return emaitza;
	}
}
