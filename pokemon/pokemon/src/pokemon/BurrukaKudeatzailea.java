package pokemon;

public class BurrukaKudeatzailea {
	private static BurrukaKudeatzailea nBK=null;
	private Pokemon jasoPokemon;
	private Pokemon erasoPokemon;
	
	private BurrukaKudeatzailea() {
	}
	public static BurrukaKudeatzailea getnBK() {
		if(nBK==null) {
			nBK=new BurrukaKudeatzailea();
		}
		return nBK;
	}
	public void setErasoPokemon(int pJokId, int pPokId) {
		this.erasoPokemon=JokalariKatalogoa.getnJK().jokalariAurkituIdz(pJokId).getPokemonZer().getPokemon_I(pPokId);
	}
	public void setJasoPokemon(int pJokId, int pPokId) {
		this.jasoPokemon=JokalariKatalogoa.getnJK().jokalariAurkituIdz(pJokId).getPokemonZer().getPokemon_I(pPokId);
	}
	public Pokemon getErasoPokemon() {
		return this.erasoPokemon;
	}
	public Pokemon getJasoPokemon() {
		return this.jasoPokemon;
	}
	public void burrukaKudeatu() {
		if(this.erasoPokemon!=null&&this.jasoPokemon!=null) {
			System.out.println("Burruka ondo kudeatu da");
			this.getErasoPokemon().erasotu(this.jasoPokemon);
		}
		else System.out.println("Ezin izan da borroka kudeatu, datuak falta dira");
		this.erasoPokemon=null;
		this.jasoPokemon=null;
	}
}
