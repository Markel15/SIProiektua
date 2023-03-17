package pokemon;

public class Nagusia {
	
	private static Nagusia nNagusia=null;
	
	private Nagusia() {
	}
	public static Nagusia getNagusia() {
		if(nNagusia==null) {
			nNagusia=new Nagusia();
		}
		return nNagusia;
	}
	public void partidaInizializatu(int pJokalari, int pBot, int pMilisec, int pPok) {//se va a activar desde el listener del menugui al darle a start, entonces van a hacer falta que reciba los parametros
		for (int i=0;i<=pJokalari;i++) {
			Jokalaria jok=new Jokalaria(pPok,i);
		}
		for (int j=0;j<=pBot;j++) {
			Bot b=new Bot(pPok,j);
		}
	}

}
