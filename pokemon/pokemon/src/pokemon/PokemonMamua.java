package pokemon;

public class PokemonMamua extends Pokemon {
	public PokemonMamua(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Mamua");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals(" "))return 2;
		else return 1;
	}
}