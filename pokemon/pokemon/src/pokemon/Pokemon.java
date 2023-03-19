package pokemon;

import java.util.Random;

public abstract class Pokemon {
	protected int erasoa = 11;
	protected int defentsa = 3;
	protected int bizia = 200;
	protected String mota;
	protected int biziMax;
	//protected int euphoria;

	public Pokemon() {
		this.erasoa = this.erasoa + new Random().nextInt(7) + 1;
		this.defentsa = this.defentsa + new Random().nextInt(4) + 1;
		this.bizia = this.bizia + new Random().nextInt(20) + 1;
		this.biziMax = bizia;
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
	public int getBizia() {
		return(this.bizia);
	}
	public int lortuBiziKop() {
		return((this.bizia/this.biziMax)*100);
	}
	public void biziaKendu(int kop) {
		this.bizia=-kop;
	}
	public int getErasoa() {
		return this.erasoa;
	}
	
	
}
