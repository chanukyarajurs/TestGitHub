package training;


import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Graphics;

public class MyWordGame extends JApplet {

	    public void init(){
	        add(new JButton("Test"));
	    }

public void paint(Graphics g){
	g.drawRect(50, 50, 50, 55);
}
		
	    /**
	     * @param args
	     */
//	    public static void main(String[] args) {
//	        MyWordGame game=new MyWordGame();
//	        JFrame myFrame=new JFrame("Test");
//	        myFrame.add(game);
//	        myFrame.pack();
//	        myFrame.setVisible(true);
//	        game.init();
//
//	    }

}