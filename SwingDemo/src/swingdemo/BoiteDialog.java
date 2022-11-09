/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdemo;

import javax.swing.JOptionPane;

/**
 *
 * @author Omar
 */
public class BoiteDialog {
    public static void main(String args[]){
        String val, msg;
        int nb=0, reponse;
        do{
            do{
                try{
                    val = JOptionPane.showInputDialog(null, "Saisir une valeur entiere");
                    nb = Integer.parseInt(val);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,e,  "Message d'errer", JOptionPane.ERROR_MESSAGE);
                }
            }while(nb <= 0);
            
            msg = "la valeur saisie est un nombre";
            if (nb % 2 == 0)
                msg += " pair";
            else
                msg += " impair";
            
            JOptionPane.showMessageDialog(null, msg, "Type de nombre",JOptionPane.INFORMATION_MESSAGE);
            
            do{
                reponse = JOptionPane.showConfirmDialog(null, "Tu veux continuer ?");
                if(reponse != JOptionPane.CANCEL_OPTION && reponse != JOptionPane.CLOSED_OPTION)
                    break;
                JOptionPane.showMessageDialog(null,"Tu dois choisir yes ou no", "Message d'errer",JOptionPane.ERROR_MESSAGE);
            }while(true);
            
        }while(reponse == JOptionPane.YES_OPTION);
    }
}
