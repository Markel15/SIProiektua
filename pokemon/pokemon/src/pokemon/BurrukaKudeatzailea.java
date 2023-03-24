package pokemon;

public class BurrukaKudeatzailea {
	private static BurrukaKudeatzailea nBK=null;
	private Pokemon jasoPokemon;
	private Pokemon erasoPokemon;
	private Jokalaria jokTurnoa;
	
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
	public void burrukaKudeatu() {
		if(this.erasoPokemon!=null&&this.jasoPokemon!=null) {//Hemen konproba beharko litzateke ea irabazlerik dagoen eta jokua amaitzekp
			System.out.println("Burruka ondo kudeatu da");
			this.getErasoPokemon().erasotu(this.jasoPokemon);
		}
		else System.out.println("Ezin izan da borroka kudeatu, datuak falta dira");
		this.setJasoPokemon(null);
		this.setErasoPokemon(null);
	}
	public void setTurnoa(int pId) {
		Jokalaria jok =JokalariKatalogoa.getnJK().jokalariAurkituIdz(pId);
		jok.setTurnoa(true);
	}
}
