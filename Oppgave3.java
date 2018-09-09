package dat100lab;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave3 {

	public static void main(String[] args) {
	String nedreTxt = showInputDialog("Skriv inn nedre grense:");
	int nedre = parseInt(nedreTxt);
	String ovreTxt = showInputDialog("Skriv inn øvre grense:");
	int ovre = parseInt(ovreTxt);
	if (nedre%2 == 1) {
	showMessageDialog(null, nedre);
		do {
			nedre = nedre+2;
			showMessageDialog(null, nedre);
		}while(nedre<ovre);
	}
	else {
		nedre = nedre+1;
		showMessageDialog(null, nedre);
		do {
			nedre = nedre+2;
			showMessageDialog(null, nedre);
		}while(nedre<(ovre-1));
	}	
	}
}
