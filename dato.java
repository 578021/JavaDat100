package oppg9;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class dato {

	public static void main(String[] args) {
		String dagnummerTxt = showInputDialog("Gi et dagnummer");
		String maanednummerTxt = showInputDialog("Gi et m�nednummer");
		String aarstallTxt = showInputDialog("Gi et �rstall");
		String utTxt ="Dato: " + dagnummerTxt + "." + maanednummerTxt + "." + aarstallTxt;
		showMessageDialog(null, utTxt);
		

	}

}
