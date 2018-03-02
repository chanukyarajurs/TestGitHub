package training;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
public class DrawRect extends java.applet.Applet {
	Font f = new Font("TimesRoman", Font.BOLD, 36);
	
	//public DrawRect(String sString, int x, int y){
		
	//}
	
	public void paint(Graphics g)	{
		
		g.setFont(f);

		g.drawString("Hellow Chanukya", 50, 50);
		
		for(int i=50;i<=250;i++){
			g.setColor(Color.WHITE);
		g.drawString("Hellow Chanukya", i-1, 50);
		g.setColor(Color.RED);
			g.drawString("Hellow Chanukya", i, 50);
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}