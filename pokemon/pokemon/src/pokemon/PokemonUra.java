package pokemon;

public class PokemonUra extends Pokemon{
	public PokemonUra(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Ur");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Sua"))return 2;
		else return 1;
	}
}
