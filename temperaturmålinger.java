package dat100lab;
import easygraphics.*;
import static java.lang.Integer.*;

public class temperaturmålinger extends EasyGraphics {

	public static void main(String[] args) {
	launch(args);		
	}
public void run() {
makeWindow("temperaturmålinger");

int x=20;
int y=500;

int faktor=50;
int bredde=50;
int mellomrom = bredde;

String ukedag="man";
int temp=5;
int høyde= temp*faktor;
setColor(160, 160, 160);
fillRectangle(x, y-høyde, bredde, høyde);
setColor(0, 0, 0);
drawRectangle(x, y-høyde, bredde, høyde);
setColor(0,0,0);
drawString(ukedag, x, y+(mellomrom/2));
drawString(temp+"", x+mellomrom/2, y-høyde-(mellomrom/4));

ukedag="tir";
temp=5;
høyde= temp*faktor;
setColor(160, 160, 160);
fillRectangle(x+2*mellomrom, y-høyde, bredde, høyde);
setColor(0, 0, 0);
drawRectangle(x+2*mellomrom, y-høyde, bredde, høyde);
setColor(0,0,0);
drawString(ukedag, x+2*mellomrom, y+(mellomrom/2));
drawString(temp+"", x+2*mellomrom+mellomrom/2, y-høyde-(mellomrom/4));

ukedag="ons";
temp=2;
høyde= temp*faktor;
setColor(160, 160, 160);
fillRectangle(x+4*mellomrom, y-høyde, bredde, høyde);
setColor(0, 0, 0);
drawRectangle(x+4*mellomrom, y-høyde, bredde, høyde);
setColor(0,0,0);
drawString(ukedag, x+4*mellomrom, y+(mellomrom/2));
drawString(temp+"", x+4*mellomrom+mellomrom/2, y-høyde-(mellomrom/4));

ukedag="tors";
temp=6;
høyde= temp*faktor;
setColor(160, 160, 160);
fillRectangle(x+6*mellomrom, y-høyde, bredde, høyde);
setColor(0, 0, 0);
drawRectangle(x+6*mellomrom, y-høyde, bredde, høyde);
setColor(0,0,0);
drawString(ukedag, x+6*mellomrom, y+(mellomrom/2));
drawString(temp+"", x+6*mellomrom+mellomrom/2, y-høyde-(mellomrom/4));

ukedag="fre";
temp=4;
høyde= temp*faktor;
setColor(160, 160, 160);
fillRectangle(x+8*mellomrom, y-høyde, bredde, høyde);
setColor(0, 0, 0);
drawRectangle(x+8*mellomrom, y-høyde, bredde, høyde);
setColor(0,0,0);
drawString(ukedag, x+8*mellomrom, y+(mellomrom/2));
drawString(temp+"", x+8*mellomrom+mellomrom/2, y-høyde-(mellomrom/4));

ukedag="lør";
temp=8;
høyde= temp*faktor;
setColor(160, 160, 160);
fillRectangle(x+10*mellomrom, y-høyde, bredde, høyde);
setColor(0, 0, 0);
drawRectangle(x+10*mellomrom, y-høyde, bredde, høyde);
setColor(0,0,0);
drawString(ukedag, x+10*mellomrom, y+(mellomrom/2));
drawString(temp+"", x+10*mellomrom+mellomrom/2, y-høyde-(mellomrom/4));

ukedag="søn";
temp=7;
høyde= temp*faktor;
setColor(160, 160, 160);
fillRectangle(x+12*mellomrom, y-høyde, bredde, høyde);
setColor(0, 0, 0);
drawRectangle(x+12*mellomrom, y-høyde, bredde, høyde);
setColor(0,0,0);
drawString(ukedag, x+12*mellomrom, y+(mellomrom/2));
drawString(temp+"", x+12*mellomrom+mellomrom/2, y-høyde-(mellomrom/4));



}



}
