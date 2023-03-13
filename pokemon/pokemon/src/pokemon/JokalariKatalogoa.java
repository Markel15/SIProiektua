package klaseak;

import java.util.ArrayList;

public class JokalariKatalogoa {
	private ArrayList<Jokalari> JokalariZer;
	private static JokalariKatalogoa nJK;
	
	private JokalariKatalogoa() {
		this.JokalariZer=new ArrayList<Jokalari>();
	}
	public static synchronized JokalariKatalogoa getnJK() {
		if(nJK==null) {
			nJK= new JokalariKatalogoa();
			
		}
		return (nJK);
	}
	public void addJok (Jokalari pJok) {
		this.JokalariZer.add(pJok);
	}
	public void deleteJok (Jokalari pJok) {
		this.JokalariZer.remove(pJok);
	}
}
