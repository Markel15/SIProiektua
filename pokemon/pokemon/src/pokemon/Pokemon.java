package pokemon;

import java.util.Random;

public abstract class Pokemon {
	protected int erasoa = 11;
	protected int defentsa = 3;
	protected int bizia = 200;
	protected String mota;
	
	public Pokemon() {
		this.erasoa = this.erasoa + new Random().nextInt(7) + 1;
		this.defentsa = this.defentsa + new Random().nextInt(4) + 1;
		this.bizia = this.bizia + new Random().nextInt(20) + 1;
	}
	
	public void inprimatu() {
		System.out.println(this.erasoa);
		System.out.println(this.defentsa);
		System.out.println(this.bizia);
	}
	
	public static void main(String[] args) {
		PokemonFactory f = PokemonFactory.getPokemonFactory();
		Pokemon p = f.sortuPokemon("Ur");
		p.inprimatu();
	}
}
