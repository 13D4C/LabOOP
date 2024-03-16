    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.prefinal;

    /**
     *
     * @author airew
     */
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import javax.swing.*;

    public class TextEditor implements ActionListener{
        private JFrame fr;
        private JPanel p1;
        private JMenuBar b1;
        private JMenu m1;
        private JMenuItem i1 ,i2 ,i3,i4 ;
        private TextArea t1;
        public TextEditor() {
            fr = new JFrame("TextEditor");
            p1 = new JPanel();
            b1 = new JMenuBar();
            m1 = new JMenu("flie");
             i1 = new JMenuItem("New"); i2 = new JMenuItem("Open"); i3 = new JMenuItem("Save"); i4 = new JMenuItem("Close");
            b1.add(m1);
            t1 = new TextArea("");
            m1.add(i1); m1.add(i2); m1.add(i3); m1.addSeparator(); m1.add(i4);
           i1.addActionListener(this);
            i2.addActionListener(this);
            i3.addActionListener(this);
            i4.addActionListener(this);

            fr.setJMenuBar(b1);

            fr.add(t1);
            fr.setSize(500, 500);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(i1)){
                t1.setText("");
            }else if(e.getSource().equals(i2)){
            JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(fr); 
                File f = fc.getSelectedFile();
                try{
                int ch;
                FileReader fr = new FileReader(f);
                   while ((ch=fr.read())!=-1){
                         System.out.print((char)ch);
                         t1.append((char)ch+"");

                
        }fr.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }

    }else if (e.getSource().equals(i3)){
            JFileChooser fc = new JFileChooser();
     fc.showSaveDialog(fr);
     File f = fc.getSelectedFile();
        try{
            FileWriter fw = new FileWriter(f);
                fw.write(t1.getText());
                fw.close();
        }catch(IOException k){
                k.printStackTrace();
        }

    }else if (e.getSource().equals(i4)){
        System.exit(JFrame.EXIT_ON_CLOSE);
    }
    }
        public static void main(String[] args) {
            new TextEditor();
        }
    }



