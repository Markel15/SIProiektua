package pokemon;

public class PokemonZomorro extends Pokemon {
	public PokemonZomorro(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Zomorro");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals(" "))return 2;
		else return 1;
	}
}