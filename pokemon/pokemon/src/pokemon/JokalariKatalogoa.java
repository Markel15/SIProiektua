package pokemon;

import java.util.ArrayList;

public class JokalariKatalogoa {
	private ArrayList<Jokalaria> JokalariZer;
	private static JokalariKatalogoa nJK;
	
	private JokalariKatalogoa() {
		this.JokalariZer=new ArrayList<Jokalaria>();
	}
	public static synchronized JokalariKatalogoa getnJK() {
		if(nJK==null) {
			nJK= new JokalariKatalogoa();
			
		}
		return (nJK);
	}
	public void addJok (Jokalaria pJok) {
		this.JokalariZer.add(pJok);
	}
	public void deleteJok (Jokalaria pJok) {
		this.JokalariZer.remove(pJok);
	}
}
