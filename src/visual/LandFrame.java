/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import domain.Circle;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Fabian
 */
public class LandFrame extends JFrame{
    
    //variables
    public ArrayList<Circle> myCircles;

    //constructor
    public LandFrame(ArrayList<Circle>myCircles) {
        super("Shape");
        
        this.myCircles = myCircles;
        this.setSize(500, 500);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        //iterate over all circles
        for (Circle myCircle : myCircles) {
                        g.setColor(Color.PINK);

            g.fillOval(myCircle.getPointPosition().getX(), myCircle.getPointPosition().getY(), myCircle.getSide(), myCircle.getSide());
            
        } //end for
    }

    public void paintAgain(){
        repaint();
    }

}
