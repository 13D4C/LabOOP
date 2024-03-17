/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author airew
 */
import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        
        t.start();
        frame.add(clock);
        
        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    }
}
