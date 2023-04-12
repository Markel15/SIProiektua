package pokemon;

public class PokemonArroka extends Pokemon {
	public PokemonArroka(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Arroka");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals(" "))return 2;
		else return 1;
	}
}