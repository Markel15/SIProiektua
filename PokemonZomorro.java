package pokemon;

public class PokemonZomorro extends Pokemon {
	public PokemonZomorro(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Zomorro");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Belarra") || pMota.equals("Psikikoa"))return 2;
		//else if(pMota.equals("Hegalaria") || pMota.equals("Sua") || pMota.equals("Borroka") || pMota.equals("Mamua"))return 0.5;
		else return 1;
	}
}
