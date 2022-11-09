package Chapitre4;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JTableDemo extends JFrame{
    String [] columnNames = {"FirstName", "LastName", "Sport", "#OfYears", "Vegeratian"};
    Object[][] data = {
        {"Kathy", "Smith ", "Snowboarding", new Integer(5), new Boolean(false)},
        {"John", "Doe ", "Rowing", new Integer(3), new Boolean(true)},
        {"Sue", "Black ", "Knitting", new Integer(2), new Boolean(false)},
        {"Jane", "White ", "Speed reading", new Integer(20), new Boolean(true)},
        {"Joe", "Brown ", "Pool", new Integer(10), new Boolean(false )}  
    };
    //final JTable t = new JTable(data, columnNames);
    //JScrollPane scrollPane = new JScrollPane(t);
    
    TableModel model = new DefaultTableModel(data, columnNames){
        public Class<?> getCloumnClass(int column){
            return column == 1 ? DefaultComboBoxModel.class : String.class;
        }
    };
    
    JTable table = new JTable(model);
    table.setRowHeight(24);
    table.setAutoCreateRowSorte(true);
    
   JTableDemo(){
       add(scrollPane);
       
       setSize(500, 100);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
        
    }
   
   public static void main(String arg[]){
       JTableDemo test = new JTableDemo();
   }
}
