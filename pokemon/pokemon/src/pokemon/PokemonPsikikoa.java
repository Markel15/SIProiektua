package pokemon;

public class PokemonPsikikoa extends Pokemon {
	public PokemonPsikikoa(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Psikikoa");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals(" "))return 2;
		else return 1;
	}
}