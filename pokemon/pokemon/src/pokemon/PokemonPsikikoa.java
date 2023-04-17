package pokemon;

public class PokemonPsikikoa extends Pokemon {
	public PokemonPsikikoa(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Psikikoa");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Borroka"))return 2;
		//else if(pMota.equals("Psikikoa"))return 0.5;
		else return 1;
	}
}
