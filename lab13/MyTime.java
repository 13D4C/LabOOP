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

public class MyTime {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Timer time = new Timer();
        Thread t = new Thread(time);
        
        t.start();
        frame.add(time);
        
        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    }
}
