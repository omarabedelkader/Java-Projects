package CalculatorMVC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IHM extends JFrame{
    private JPanel  container = new JPanel();
    private JPanel outputPanel, numbersPanel, operationsPanel;
    private JLabel calculatorScreen;
    private String buttonName [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
    private JButton buttons [] = new JButton[buttonName.length];
    private double after, before;
    private String text, lastOperator = " ";
    
    public IHM(){
        this.container = new JPanel();
        this.outputPanel = new JPanel();
        this.numbersPanel = new JPanel();
        this.operationsPanel = new JPanel();
        this.setSize(210, 230);
        this.setTitle("Calculette");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.inisialiation();
        this.setContentPane(container);
        this.setVisible(true);
    }
    
    private void inisialiation(){
        this.calculatorScreen = new JLabel("0");
        this.calculatorScreen.setFont(new Font("Arial", Font.BOLD, 20));
        this.calculatorScreen.setHorizontalAlignment(JLabel.RIGHT);
        this.calculatorScreen.setPreferredSize(new Dimension(175, 20));
        
        for(int i = 0; i < buttonName.length; i++){
            this.buttons[i] = new JButton(this.buttonName[i]);
        }
        
        this.outputPanel.add(this.calculatorScreen);
        
        for(int i = 0; i < 12; i++){
            this.numbersPanel.add(this.buttons[i]);
        }
        
        for(int i = 12; i < buttons.length; i++){
            this.operationsPanel.add(this.buttons[i]);
        }
        
        ButtonHandler bHandler = new ButtonHandler();
        for(int i = 0; i < buttons.length; i++){
            buttons[i].addActionListener(bHandler);
        }
        
        GridLayout numbersLayout = new GridLayout(4, 3);
        numbersLayout.setHgap(5);
        numbersLayout.setVgap(5);
        
        GridLayout operationsLayout= new GridLayout(5, 1);
        operationsLayout.setVgap(5);
        
        this.outputPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        this.outputPanel.setLayout(new FlowLayout());
        this.numbersPanel.setLayout(numbersLayout);
        this.operationsPanel.setLayout(operationsLayout);
        
        this.container.add(this.outputPanel, BorderLayout.NORTH);
        this.container.add(this.numbersPanel, BorderLayout.CENTER);
        this.container.add(this.operationsPanel, BorderLayout.EAST);
        
    }
    
    class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            text = calculatorScreen.getText();
            for(int i = 0; i <= 10; i++){
                if(ae.getSource() == buttons[i]){
                    if(text.contains(".") && buttons[i].getText().equals(".")){
                        break;
                    }
                    if(text.equals("0") || lastOperator.equals("="))
                        text = buttons[i].getText();
                    else
                        text += buttons[i].getText();
                    calculatorScreen.setText(text);
                }
            }
            for(int i = 11; i < buttons.length; i++){
                if(ae.getSource() == buttons[i]){  
                    
                    if(buttons[i].getText().equals("*")){
                        before = Double.parseDouble(text);
                        calculatorScreen.setText("0");
                        lastOperator = "*";
                    }else if(buttons[i].getText().equals("+")){
                        before = Double.parseDouble(text);
                        calculatorScreen.setText("0");
                        lastOperator = "+";
                    }else if(buttons[i].getText().equals("-")){
                        before = Double.parseDouble(text);
                        calculatorScreen.setText("0");
                        lastOperator = "-";
                    }else if(buttons[i].getText().equals("/")){
                        before = Double.parseDouble(text);
                        calculatorScreen.setText("0");
                        lastOperator = "/";
                    }else if(buttons[i].getText().equals("C")){
                        calculatorScreen.setText("0");
                        before = 0;
                        after = 0;
                        lastOperator = " ";
                    }else if(buttons[i].getText().equals("=")){
                        after = Double.parseDouble(calculatorScreen.getText());
                        if(lastOperator.equals("*"))
                            calculatorScreen.setText(Double.toString(before*after));
                        else if(lastOperator.equals("+"))
                            calculatorScreen.setText(Double.toString(before+after));
                        else if(lastOperator.equals("-"))
                            calculatorScreen.setText(Double.toString(before-after));
                        else if(lastOperator.equals("/")){
                            if(before == 0){
                                calculatorScreen.setText("Math Error");
                                before = 0;
                                after = 0;
                                lastOperator = " ";
                            }else
                                calculatorScreen.setText(Double.toString(before/after));
                        }else
                            calculatorScreen.setText(Double.toString(after));
                        lastOperator = "=";
                    }
                }
                
            }
        }
        
    }
    
}
