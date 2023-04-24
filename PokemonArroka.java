package pokemon;

public class PokemonArroka extends Pokemon {
	public PokemonArroka(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Arroka");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Belarra") || pMota.equals("Hegalaria") || pMota.equals("Sua"))return 2;
		//else if(pMota.equals("Borroka"))return 0.5;
		else return 1;
	}
}
