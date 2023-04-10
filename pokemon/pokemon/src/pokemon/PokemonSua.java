package pokemon;

public class PokemonSua extends Pokemon {
	public PokemonSua(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Sua");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Belarra"))return 2;
		else return 1;
	}
}
