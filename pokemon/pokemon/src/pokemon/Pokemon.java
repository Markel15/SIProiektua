package pokemon;

import java.util.Observable;
import java.util.Random;

public abstract class Pokemon extends Observable{
	private int erasoa = 11;
	private int defentsa = 3;
	private int bizia = 200;
	private String mota;
	
	public Pokemon() {
		this.erasoa = this.erasoa + new Random().nextInt(7) + 1;
		this.defentsa = this.defentsa + new Random().nextInt(4) + 1;
		this.bizia = this.bizia + new Random().nextInt(20) + 1;
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
	public void berriztuInfo() {
		this.setChanged();
		this.notifyObservers(this);
	}
	
}
