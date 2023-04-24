package pokemon;

public class PokemonElektrikoa extends Pokemon {
	public PokemonElektrikoa(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Elektrikoa");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Ur") || pMota.equals("Hegalaria"))return 2;
		//else if(pMota.equals("Belarra") || pMota.equals("Elektrikoa") || pMota.equals("Dragoia"))return 0.5;
		else return 1;
	}
}
