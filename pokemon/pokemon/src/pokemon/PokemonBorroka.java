package pokemon;

public class PokemonBorroka extends Pokemon {
	public PokemonBorroka(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Borroka");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Arroka") || pMota.equals("Hegalaria"))return 2;
		//else if(pMota.equals("Psikikoa" || pMota.equals("Belarra") || pMota.equals("Hegalaria"))return 0.5;
		else return 1;
	}
}
