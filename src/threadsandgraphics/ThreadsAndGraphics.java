/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadsandgraphics;

import visual.LandFrame;
import threads.RepaintLandThread;
import threads.CircleThread;
import domain.Point;
import domain.Circle;
import domain.Circle1;
import java.util.ArrayList;
import javax.swing.JFrame;
import threads.CircleThread1;
import threads.CircleThread2;
import threads.CircleThread3;

public class ThreadsAndGraphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the domain squares
        Circle cir1 = new Circle("Thread-1", new Point(0, 50), 50);
        Circle cir2 = new Circle("Thread-2", new Point(0, 175), 50);
        Circle cir3 = new Circle("Thread-3", new Point(0,300 ), 50);
        Circle cir4 = new Circle("Thread-3", new Point(0,450 ), 50);
        
        //create the array list for the frame to paint
        ArrayList<Circle> CircleList = new ArrayList<>();
        CircleList.add(cir1);
        CircleList.add(cir2);
        CircleList.add(cir3);
        CircleList.add(cir4);
        //squareList.add(square3);
        
        //create the new frame and send the square list
        LandFrame myLand = new LandFrame(CircleList);
        myLand.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //thread for repainting
        RepaintLandThread repaintThread = new RepaintLandThread(myLand, 200);
        repaintThread.start();
        
        //thread for controlling the movement of the squares
        CircleThread CircleThread1 = new CircleThread(cir1, 100);
        CircleThread1 circleThread2 = new CircleThread1(cir2, 900);
        CircleThread2 circleThread3 = new CircleThread2(cir3, 4000);
        CircleThread3 circleThread4 = new CircleThread3(cir4, 100);
        CircleThread1.start();
        circleThread2.start();
        circleThread3.start(); 
        circleThread4.start(); 
    }//end main
}
