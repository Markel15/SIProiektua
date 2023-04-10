package pokemon;

public class PokemonElektrikoa extends Pokemon {
	public PokemonElektrikoa(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Elektrikoa");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Ur"))return 2;
		else return 1;
	}
}
