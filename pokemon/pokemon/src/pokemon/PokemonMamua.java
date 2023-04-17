package pokemon;

public class PokemonMamua extends Pokemon {
	public PokemonMamua(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Mamua");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Psikikoa") || pMota.equals("Mamua"))return 2;
		else if(pMota.equals("Borroka"))return 0;
		else return 1;
	}
}
