/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author airew
 */
import javax.swing.JLabel;
import java.awt.*;


public class TimerClock extends JLabel implements Runnable {
    
    private int time;
    
    @Override
    public void run() {
        
            while(true){
                int sec = time%60;
                int min = (time/60)%60;
                int hour = (time/3600)%24;
                setFont(new Font("Tahoma", Font.BOLD, 50));
                setText(String.format("%02d:%02d:%02d", hour, min, sec));

                try 
                {
                    Thread.sleep(1000);
                }catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                time++;
        }
    }
    
}
