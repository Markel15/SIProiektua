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
	public void setErasoPokemon(Pokemon pPok) {
		this.erasoPokemon=pPok;
	}
	public void setJasoPokemon(Pokemon pPok) {
		this.jasoPokemon=pPok;
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
		this.setJasoPokemon(null);
		this.setErasoPokemon(null);
	}
}
