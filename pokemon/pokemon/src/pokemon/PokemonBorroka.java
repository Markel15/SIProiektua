package pokemon;

public class PokemonBorroka extends Pokemon {
	public PokemonBorroka(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Borroka");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals(" "))return 2;
		else return 1;
	}
}