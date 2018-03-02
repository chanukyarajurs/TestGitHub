package training;
import javax.swing.JFrame;
import training.DrawRect;

import java.awt.Dimension;
import java.awt.Graphics;

public class TestDrawRect {


    public static void main(String[] args) {
        MyWordGame game=new MyWordGame();
        JFrame myFrame=new JFrame("Test");
        
        myFrame.setSize(new Dimension(500, 500));
        myFrame.add(game);
        myFrame.pack();
        myFrame.setVisible(true);
        game.init();
        
        
    }


}
