package pokemon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class PokemonZerrenda {
	private ArrayList<Pokemon> pokemonZer;
	
	public PokemonZerrenda() {
		this.pokemonZer = new ArrayList<>();
	}
	
	public void gehituPokemon(Pokemon pok) {
			this.pokemonZer.add(pok);
	}
	public Pokemon getPokemon_I(int i) {//Aurkitzeko pokemon-a posizioaren arabera
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
	public int getBizirikDagoenPosizioa() {
		Random rand = new Random();
		int emaitza=0;
		boolean aurk=false;
		while(!aurk) {
			int aux=rand.nextInt(this.pokemonZer.size());
			if(pokemonZer.get(aux).bizirikDago()) {
				aurk=true;
				emaitza=aux;
			}
		}
		return emaitza;
	}
	public Pokemon aurkituPokemonIdz(int pId) {//aurkitzeko pokemon-a idz
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
	//Hurrengoa JAVA8-rekin egin daiteke
	public PokemonZerrenda getBizirikDaudenak() {//beharrezkoa Bot-ak eraso bat egiterakoan bizirik dagoen pokemon baten posizioa aurkitzeko
		PokemonZerrenda emaitza=new PokemonZerrenda();
		Iterator<Pokemon>itr=this.getIter();
		while(itr.hasNext()) {
			Pokemon p=itr.next();
			if (p.bizirikDago()) emaitza.gehituPokemon(p);
		}
		return emaitza;
	}
}
