package pokemon;

import java.util.Random;

public abstract class Pokemon {
	private int erasoa = 11;
	private int defentsa = 3;
	private int bizia = 200;
	private String mota;
	
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
	public void setMota(String pMota) {
		this.mota=pMota;
	}
}
