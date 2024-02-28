/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author airew
 */
import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane j;
    private JInternalFrame app1, app2, app3;
    private JMenuBar b;
    private JMenu m1, m2, m3, sub;
    private JMenuItem i1, i2, i3, sub1, sub2;
    public MDIFromGUI () {
        fr = new JFrame("SubMenuItem Demo");
        j = new JDesktopPane();
        app1 = new JInternalFrame("Application 01", true, true, true, true);
        app2 = new JInternalFrame("Application 02", true, true, true, true);
        app3 = new JInternalFrame("Application 03", true, true, true, true);
        
        b = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        sub = new JMenu("New");
        
        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("Exit");
        sub1 = new JMenuItem("Window");
        sub2 = new JMenuItem("Message");
        
        j.setBackground(Color.BLACK);
        app1.setBounds(50, 240, 240, 140);
        app2.setBounds(200, 50, 220, 160);
        app3.setBounds(450, 180, 300, 220);
        app1.setVisible(true);
        app2.setVisible(true);
        app3.setVisible(true);
        
        fr.setJMenuBar(b);
        b.add(m1);
        b.add(m2);
        b.add(m3);
        
        sub.add(sub1);
        sub.addSeparator();
        sub.add(sub2);
        
        m1.add(sub);
        m1.add(i1);
        m1.addSeparator();
        m1.add(i2);
        m1.addSeparator();
        m1.add(i3);
        
        j.add(app1);
        j.add(app2);
        j.add(app3);
        fr.add(j);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(380, 150, 800, 500);
        fr.setVisible(true);
    }
}