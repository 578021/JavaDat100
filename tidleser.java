package tidleser;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class tidleser {

	public static void main(String[] args) {
		/* F�rst skal brukeren skrive inn antall sekunder
		 * deretter deler maskinen det p� 3600 og det blir omgjort til timer
		 * s� legger maskinen til resten ganger 60 som er antall minutter
		 * s� legger maskinen til resten av resten ganger med 60 som blir antall sekunder
		 */
	String sekundTxt = showInputDialog("Oppgi antall sekund");
		int sekund = parseInt(sekundTxt);
		int timer = sekund/3600;
		int minutter= (sekund%3600)/60;
		int sekunder= sekund%3600%60;
		String utTxt= timer + "timer, " + minutter + "minutter, " + sekunder + "sekunder ";
		showMessageDialog(null, utTxt);
	}

}
