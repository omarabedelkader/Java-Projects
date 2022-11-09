package Devoir1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Devoir1 extends JFrame {

    JPanel imagePanel, etudiantPanel, notesPanel, resultatPanel, buttonPanel, mainPanel;
    JLabel l1, l2, l3, iconLab;
    JTextField t1, t2, t3, tc1, tc2, tc3, tc4, tc5, tc6;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JTextArea moy;
    JButton b;
    ImageIcon icon;
    Image titleIcon;

    Devoir1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating Image
        icon = new ImageIcon(getClass().getResource("Images/java.png"));
        iconLab = new JLabel(icon);

        //Creating panels
        imagePanel = new JPanel();
        etudiantPanel = new JPanel();
        notesPanel = new JPanel();
        resultatPanel = new JPanel();
        buttonPanel = new JPanel();
        mainPanel = new JPanel();

        //Creating elements
        l1 = new JLabel("ID étudiant");
        l2 = new JLabel("Nom étudiant");
        l3 = new JLabel("Prénom étudiant");

        t1 = new JTextField(30);
        t2 = new JTextField(30);
        t3 = new JTextField(30);

        tc1 = new JTextField(5);
        tc2 = new JTextField(5);
        tc3 = new JTextField(5);
        tc4 = new JTextField(5);
        tc5 = new JTextField(5);
        tc6 = new JTextField(5);

        c1 = new JCheckBox("Web 1");
        c2 = new JCheckBox("Java 1");
        c3 = new JCheckBox("Web 2");
        c4 = new JCheckBox("Java 2");
        c5 = new JCheckBox("Web 3");
        c6 = new JCheckBox("Java 3");

        moy = new JTextArea(10, 40);

        b = new JButton("Calcule Moyenne");

        //set Editable false for cours textfields
        tc1.setEditable(false);
        tc2.setEditable(false);
        tc3.setEditable(false);
        tc4.setEditable(false);
        tc5.setEditable(false);
        tc6.setEditable(false);
        
        //seting sub panels sizes
        imagePanel.setSize(300, 150);
        etudiantPanel.setSize(300, 90);
        notesPanel.setSize(150, 250);
        resultatPanel.setSize(470, 150);
        buttonPanel.setSize(470, 40);

        //add elements to Panels and setting layouts
        imagePanel.add(iconLab);

        etudiantPanel.add(l1);
        etudiantPanel.add(t1);
        etudiantPanel.add(l2);
        etudiantPanel.add(t2);
        etudiantPanel.add(l3);
        etudiantPanel.add(t3);

        etudiantPanel.setLayout(new GridLayout(3, 2, 5, 5));

        notesPanel.add(c1);
        notesPanel.add(tc1);
        notesPanel.add(c2);
        notesPanel.add(tc2);
        notesPanel.add(c3);
        notesPanel.add(tc3);
        notesPanel.add(c4);
        notesPanel.add(tc4);
        notesPanel.add(c5);
        notesPanel.add(tc5);
        notesPanel.add(c6);
        notesPanel.add(tc6);

        notesPanel.setLayout(new GridLayout(6, 2, 15, 15));

        resultatPanel.setLayout(new BorderLayout());
        resultatPanel.add(moy, BorderLayout.CENTER);

        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(b);

        //Main Panel
        mainPanel.add(imagePanel).setBounds(5, 5, 300, 150);
        mainPanel.add(etudiantPanel).setBounds(5, 165, 300, 90);
        mainPanel.add(notesPanel).setBounds(325, 5, 150, 250);
        mainPanel.add(resultatPanel).setBounds(5, 265, 470, 150);
        mainPanel.add(buttonPanel).setBounds(5, 425, 470, 40);

        mainPanel.setLayout(null);
        mainPanel.setPreferredSize(new Dimension(480, 470));

        //register listeners for CheckBoxs
        checkBoxHandler cHandler = new checkBoxHandler();
        c1.addItemListener(cHandler);
        c2.addItemListener(cHandler);
        c3.addItemListener(cHandler);
        c4.addItemListener(cHandler);
        c5.addItemListener(cHandler);
        c6.addItemListener(cHandler);
        
        //register listener for button
        buttonHandler bHandle = new buttonHandler();
        b.addActionListener(bHandle);
        
        
        //Frame
        setTitle("Anthony Cherfane");
        getContentPane().setBackground(Color.CYAN);
        setLayout(new FlowLayout());
        getContentPane().add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    //checkbox event handler
    public class checkBoxHandler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent ie){
            //c1
            if(ie.getSource() == c1)
                if(c1.isSelected()){
                    tc1.setEditable(true);
                    tc1.requestFocusInWindow();
                }
                else{
                    tc1.setText("");
                    tc1.setEditable(false);
                }
            //c2
            if(ie.getSource() == c2)
                if(c2.isSelected()){
                    tc2.setEditable(true);
                    tc2.requestFocusInWindow();
                }
                else{
                    tc2.setText("");
                    tc2.setEditable(false);
                }
            //c3
            if(ie.getSource() == c3)
                if(c3.isSelected()){
                    tc3.setEditable(true);
                    tc3.requestFocusInWindow();
                }
                else{
                    tc3.setText("");
                    tc3.setEditable(false);
                }
            //c4
            if(ie.getSource() == c4)
                if(c4.isSelected()){
                    tc4.setEditable(true);
                    tc4.requestFocusInWindow();
                }
                else{
                    tc4.setText("");
                    tc4.setEditable(false);
                }
            //c5
            if(ie.getSource() == c5)
                if(c5.isSelected()){
                    tc5.setEditable(true);
                    tc5.requestFocusInWindow();
                }
                else{
                    tc5.setText("");
                    tc5.setEditable(false);
                }
            //c6
            if(ie.getSource() == c6)
                if(c6.isSelected()){
                    tc6.setEditable(true);
                    tc6.requestFocusInWindow();
                }
                else{
                    tc6.setText("");
                    tc6.setEditable(false);
                }
        }
        
    }

    //button event handle
    public class buttonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int count = 0;
            double n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, total;
            
            if(tc1.isEditable() && !tc1.getText().equals("")){
                n1 = Double.parseDouble(tc1.getText());
                count ++;
            }
            if(tc2.isEditable() && !tc1.getText().equals("")){
                n2 = Double.parseDouble(tc2.getText());
                count ++;
            }
            if(tc3.isEditable() && !tc3.getText().equals("")){
                n3 = Double.parseDouble(tc3.getText());
                count ++;
            }
            if(tc4.isEditable() && !tc4.getText().equals("")){
                n4 = Double.parseDouble(tc4.getText());
                count ++;
            }
            if(tc5.isEditable() && !tc5.getText().equals("")){
                n5 = Double.parseDouble(tc5.getText());
                count ++;
            }
            if(tc6.isEditable() && !tc6.getText().equals("")){
                n6 = Double.parseDouble(tc6.getText());
                count ++;
            }
            
            total = n1 + n2 + n3 + n4 + n5 + n6;
            
            int value = JOptionPane.showConfirmDialog(null, "Confirmer les données");
            if (value == JOptionPane.YES_OPTION){
                moy.append("La moyénne de l'etudiant " + t2.getText() + " " + t3.getText() + " (id = " + t1.getText() + ") est " + total/count +"\n");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                tc1.setText("");
                tc1.setEditable(false);
                c1.setSelected(false);
                tc2.setText("");
                tc2.setEditable(false);
                c2.setSelected(false);
                tc3.setText("");
                tc3.setEditable(false);
                c3.setSelected(false);
                tc4.setText("");
                tc4.setEditable(false);
                c4.setSelected(false);
                tc5.setText("");
                tc5.setEditable(false);
                c5.setSelected(false);
                tc6.setText("");
                tc6.setEditable(false);
                c6.setSelected(false);
            }
            else
                moy.append("");
        }
        
    }
    
    public static void main(String args[]) {
        Devoir1 d = new Devoir1();
    }
}
