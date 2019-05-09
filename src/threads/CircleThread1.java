
package threads;

import domain.Point;
import domain.Circle;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class CircleThread1 extends Thread{
    
    //variables
    private Circle myCircle1;
    private int delayTime;

    public CircleThread1(Circle myCircle1, int delayTime) {
        super(myCircle1.identification);
        this.myCircle1 = myCircle1;
        this.delayTime = delayTime;
    }
    
    
    @Override
    public void run() {
        while (true)
        try {
            //sleep for the animation
            sleep(delayTime);
            
//            //move the object
//            Random random = new Random();
            int newY=175;
           
            for (int i = 1; i < 450; i=i+10) {
              
             myCircle1.setPointPosition(new Point(i,newY));
                sleep(delayTime);
                
            }
//            int newX = (int)(random.nextDouble() * 500);
//            int newY = (int)(random.nextDouble() * 500);
            //mySquare.setPointPosition(new Point(newX, newY));
            
            
                        
        } catch (InterruptedException ex) {
            Logger.getLogger(CircleThread1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//end run

    
}
