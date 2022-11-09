
package swingdemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField text1;
    private JButton [] bout = new JButton [17];
    private String tit = "123+456-789/0.C*=";
    private String s0, s1, s2;
    
    public Calculator(){
        s0 = ""; s1 = ""; s2 = "";
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text1 = new JTextField(25);
        text1.setEditable(false);
        for(int i = 0; i < bout.length; i++){
            bout[i] = new JButton(tit.substring(i, i+1));
            bout[i].addActionListener(new Traitement());
        }
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10 , 5));
        p1.add(text1);
        p1.setBackground(Color.BLUE);
        
        JPanel p2 = new JPanel (new GridLayout(4,4 , 7, 5));
        //p2.setLayout(new GridLayout(4,4));
        for(int i = 0; i<bout.length - 1; i++){
            p2.add(bout[i]);
        }
        p2.setBackground(Color.CYAN);
        
        JPanel p3 = new JPanel();
        p3.add(bout[16]);
        p3.setBackground(Color.BLUE);
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout(7, 7));
        c.add(BorderLayout.NORTH, p1);
        c.add(BorderLayout.CENTER, p2);
        c.add(BorderLayout.SOUTH, p3);
        pack();
        setVisible(true);
    }
    
    private class Traitement implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            String rest;
            String s = evt.getActionCommand();
            char ch = s.charAt(0);
            if ((ch >= '0' && ch <= '9') || ch == '.'){
                if(s1.equals("")){
                    s0 = s0 + ch;
                }
                else{
                    s2 = s2 + ch;
                }
                text1.setText(s0+s1+s2);
            }   
            else if (ch == 'C'){
                s0 = ""; s1 = ""; s2="";
                text1.setText("");
            }
            else if (ch == '='){
                if (! s1.equals("") && ! s2.equals("")){
                    rest = calcul (s0, s1, s2);
                    text1.setText(s0+s1+s2 + " = " + rest);
                    s0 = rest;
                    s1 = "";
                    s2 = "";
                }
            }
            else {
                if(!s0.equals("")){
                    if (!s2.equals("")){
                        rest = calcul (s0, s1, s2);
                        s0 = rest;
                        s1 = s;
                        s2 = "";
                        text1.setText(s0);
                    }
                    else{
                        s1 = s;
                        text1.setText(s0+s1);
                    }
                }
            }
    }
    }
        
    public String calcul (String s0, String s1, String s2){
        double op1 = Double.parseDouble(s0);
        double op2 = Double.parseDouble(s2);
        double nb= 0;
        String res = "";
        switch (s1.charAt(0)){
            case '+' : nb = op1 + op2;
            break;
            case '-' : nb = op1 - op2;
            break;
            case '*' : nb = op1 * op2;
            break;
            case '/' : nb = op1 / op2;
            break;
        }
        res = "" + nb;
        return res;
    }

    public static void main(String args[]){
        new Calculator();
    }

}
