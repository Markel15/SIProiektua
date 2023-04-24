package pokemon;

public class PokemonKatalogoa {
	private static PokemonKatalogoa inst;
	private PokemonZerrenda pokemonGuztiak;
	
	private PokemonKatalogoa() {
		this.pokemonGuztiak = new PokemonZerrenda();
	}
	
	public static PokemonKatalogoa getPokemonKatalogoa() {
		if (inst == null) {
			inst = new PokemonKatalogoa();
		}
		return inst;
	}
	
}
