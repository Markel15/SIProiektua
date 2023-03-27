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
	
	public Pokemon(int pId,int jokId) {
		this.erasoa = this.erasoa + new Random().nextInt(7) + 1;
		this.defentsa = this.defentsa + new Random().nextInt(4) + 1;
		this.bizia = this.bizia + new Random().nextInt(20) + 1;
		this.id=pId;
		this.biziMax=bizia;
		this.jokId=jokId;
	}
	
	public void inprimatu() {
		System.out.println(this.erasoa);
		System.out.println(this.defentsa);
		System.out.println(this.bizia);
	}
	
	public void setMota(String pMota) {
		this.mota=pMota;
	}
	public int getEraso() {
		return this.erasoa;
	}
	public int getDef() {
		return this.defentsa;
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
		pErasotua.setBizia(biz-era+def);
		pErasotua.berriztuInfo();
	}
	public boolean bizirikDago() {
		return bizia>0;
	}
	
}
