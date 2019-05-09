
package threads;

import domain.Point;
import domain.Circle;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class CircleThread extends Thread{
    
    //variables
    private Circle myCircle;
    private int delayTime;

    public CircleThread(Circle myCircle, int delayTime) {
        super(myCircle.identification);
        this.myCircle = myCircle;
        this.delayTime = delayTime;
    }
    
    
    @Override
    public void run() {
        while (true)
        try {
            //sleep for the animation
            sleep(delayTime);

            int newY=50;
           
            for (int i = 1; i < 450; i=i+10) {
              
             myCircle.setPointPosition(new Point(i,newY));
                sleep(delayTime);
                
            }

            
            
            
                        
        } catch (InterruptedException ex) {
            Logger.getLogger(CircleThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//end run

    
}
