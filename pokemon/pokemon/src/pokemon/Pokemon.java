package pokemon;

import java.util.Observable;
import java.util.Random;

public abstract class Pokemon extends Observable{
	private int erasoa = 11;
	private int defentsa = 3;
	private int bizia = 200;
	private int biziMax;
	private int id;
	private int jokId;
	private String mota;
	private int euforia=0;
	private int eufMax;
	private Egoera egoera;
	
	public Pokemon(int pId,int jokId) {
		this.erasoa = this.erasoa + new Random().nextInt(7) + 1;
		this.defentsa = this.defentsa + new Random().nextInt(4) + 1;
		this.bizia = this.bizia + new Random().nextInt(20) + 1;
		this.id=pId;
		this.biziMax=bizia;
		this.jokId=jokId;
		this.eufMax=3+ new Random().nextInt(0, 5);//3-7 arteko golpe kopuru jaso ahal izango du euforia egoerara sartu baino lehen
		this.egoera=new Evo0();
	}
	
	public void setMota(String pMota) {
		this.mota=pMota;
	}
	public int getEraso() {
		return this.erasoa +this.egoera.egoerarenAraberakoErasoa();
	}
	public int getDef() {
		return this.defentsa + this.egoera.egoerarenAraberakoDefentsa();
	}
	public int getBiz() {
		return this.bizia;
	}
	public String getMota() {
		return this.mota;
	}
	public int getBiziMax() {
		return this.biziMax;
	}
	public int getId() {
		return this.id;
	}
	public int getJokId() {
		return this.jokId;
	}
	public void setBizia(int pEmaitza) {
		this.bizia=pEmaitza;;
	}
	public void berriztuInfo() {
		Object[] infoArray= {this.getJokId(),this.getId()};
		this.setChanged();
		this.notifyObservers(infoArray);
	}
	public void erasotu(Pokemon pErasotua) {
		int def=pErasotua.getDef();
		int biz=pErasotua.getBiz();
		int era=this.getEraso();
		int emaitza=biz-era+def;
		if(def>era)emaitza=biz;//Defentsa, erasotzailearen erasoa baino handiagoa bada, 0-ra jarri, bestela, sendatuko litzateke (bizia handituko litzateke).
		pErasotua.setBizia(emaitza);
		if(pErasotua.getEuforia()<pErasotua.getEufMax()) {
			pErasotua.setEuforia(pErasotua.getEuforia()+1);
		}
		else {
			pErasotua.setEuforia(pErasotua.getEufMax());
		}
		pErasotua.eguneratuEgoera();
		pErasotua.berriztuInfo();
	}
	public boolean bizirikDago() {
		return bizia>0;
	}
	public int getEuforia() {
		return this.euforia;
	}
	public int getEufMax() {
		return this.eufMax;
	}
	public void setEuforia(int pBalio) {
		this.euforia=pBalio;
	}
	private void eguneratuEgoera() {
		if(this.bizia>this.biziMax/2) {
			this.egoera=new Evo0();
		}
		if(this.getEuforia()==this.getEufMax()) {
			this.egoera=new Euforia();
		}
	}
	public void eguneratuEuforiaEgoera() {//Euforia egoeran bazegoen atera egoera horretatik, bestela ez egin ezer
		if(this.egoera instanceof Euforia) {
			this.setEuforia(0);
			this.eguneratuEgoera();
			this.berriztuInfo();
		}
	}
}
