package pokemon;

public class PokemonUra extends Pokemon{
	public PokemonUra(int pId,int pJokId) {
		super(pId,pJokId);
		this.setMota("Ur");
	}

	@Override
	protected int biderkatzaileaLortu(String pMota) {
		if(pMota.equals("Sua") || pMota.equals("Arroka"))return 2;
		//else if(pMota.equals("Ura") || pMota.equals("Belarra") || pMota.equals("Dragoia"))return 0.5;
		else return 1;
	}
}
