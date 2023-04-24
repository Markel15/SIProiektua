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
		return pokemonZer.stream().filter(p->p.getId()==pId).findFirst().orElse(null);
	}
	public long getBizirikDaudenak() {//beharrezkoa Bot-ak eraso bat egiterakoan bizirik dagoen pokemon baten posizioa aurkitzeko
		return pokemonZer.stream().filter(Pokemon :: bizirikDago).count();
	}
}
