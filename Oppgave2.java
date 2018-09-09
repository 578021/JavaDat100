package dat100lab;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave2 {

	public static void main(String[] args) {
		String lonnTxt = showInputDialog("Oppgi lønn");
		int lonn = parseInt(lonnTxt);
		if(lonn<=164100) {
			double trinn=lonn*0.00;
			showMessageDialog(null, " Trinnskatten din er: "+trinn);
		}
			else if(lonn<=235950) {
				double trinn1=lonn*(0.93/100);
				showMessageDialog(null, "Skattetrinn 1. Trinnskatten din er: "+trinn1);
			}
			else if(lonn<=580650) {
				double trinn2=lonn*(2.41/100);
				showMessageDialog(null, "Skattetrinn 2. Trinnskatten din er: "+trinn2);
			}
			else if(lonn<=934050) {
				double trinn3=lonn*(11.52/100);
				showMessageDialog(null, "Skattetrinn 3. Trinnskatten din er: "+trinn3);
			}
			else if(lonn>=934051) {
				double trinn4=lonn*(14.52/100);
				showMessageDialog(null, "Skattetrinn 4. Trinnskatten din er: "+trinn4);
			}

	}

}
