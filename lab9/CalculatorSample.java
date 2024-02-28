/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author airew
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JButton b;
    private JTextField txt;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    private double result;
    private char op;
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextField ();
        
        b1 = new JButton ("7");
        
        b2 = new JButton ("8");
        b3 = new JButton ("9");
        b4 = new JButton ("+");
        b5 = new JButton ("4");
        b6 = new JButton ("5");
        b7 = new JButton ("6");
        b8 = new JButton ("-");
        b9 = new JButton ("1");
        b10 = new JButton ("2");
        b11 = new JButton ("3");
        b12 = new JButton ("x");
        b13 = new JButton ("0");
        b14 = new JButton ("c");
        b15 = new JButton ("=");
        b16 = new JButton ("/");
        p.setLayout(new GridLayout(4, 4));
        fr.setLayout(new GridLayout(4, 4));
        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p,BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fr.setBounds(500, 200, 300, 300);
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if (str.equals("+") | str.equals("-") | str.equals("x") | str.equals("/") | str.equals("c")) {
            result = Double.parseDouble(txt.getText());
            txt.setText("");
            op = str.charAt(0);
        }
        else if (str.equals("=")) {
            // Change Str to operator//
            switch (op) {
                case '+':
                    result += Double.parseDouble(txt.getText());
                    break;
                case '-':
                    result -= Double.parseDouble(txt.getText());
                    break;
                case 'x':
                    result *= Double.parseDouble(txt.getText());
                    break;
                case '/':
                    result /= Double.parseDouble(txt.getText());
                    break;
            }
            txt.setText(String.valueOf(result));
        }
        else {
            txt.setText(txt.getText() + str);
        }
    }
}
    

