package dat100lab;
import easygraphics.*;
import static java.lang.Integer.*;

public class flagg extends EasyGraphics {

	public static void main(String[] args) {
	launch(args);	
	}

	public void run() {
		makeWindow("flagg", 350, 300);
		
		String tallTxt = getText("Skalering i prosent:");
		int str = parseInt(tallTxt);
		
		int vanligBredde = 125, vanligHoyde = 25;
		int bredde = vanligBredde*str/100;
		int hoyde = vanligHoyde*str/100;
		
		setColor(225, 225, 0);
		fillRectangle (20, 70, bredde, hoyde);
		setColor(255, 0, 0);
		fillRectangle (20, 45, bredde, hoyde);
		setColor(0, 0, 0);
		fillRectangle(20, 20, bredde, hoyde);
		//klarer ikkje å få justert høyden i forhold til kvarandre så noen av fargene går over hverandre
	}

}
