package swingdemo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class JTableDemo extends JFrame implements TableModelListener{
    JTable table;
    DefaultTableModel tableMDL;
    JScrollPane sp;
    
    public JTableDemo(){
        super();
        setLayout(new BorderLayout());
        setSize(600, 400);
        
        tableMDL = new DefaultTableModel();
        table = new JTable(tableMDL){
            @Override
            public Class getColumnClass(int column){
                switch (column){
                    case 0 : return Integer.class;
                    case 1 : return String.class;
                    case 2 : return Character.class;
                    case 3 : return String.class;
                    case 4 : return Double.class;
                    default : return Boolean.class;
                }
            }
        };
        
        tableMDL.addColumn("No");
        tableMDL.addColumn("Name");
        tableMDL.addColumn("Gender");
        tableMDL.addColumn("City");
        tableMDL.addColumn("Salary");
        tableMDL.addColumn("Boolean");
        
        tableMDL.addRow(new Object[] {new Integer(10), "XYZ", new Character('M'), "Baalbek", new Double(1200.00), true});
        tableMDL.addRow(new Object[] {new Integer(25), "ABC", new Character('F'), "Jounieh", new Double(1850.00), false});
        
        sp = new JScrollPane(table);
        add(sp, BorderLayout.CENTER);
        
        table.getModel().addTableModelListener(this);
    }
    
    @Override
    public void tableChanged(TableModelEvent e){
        JOptionPane.showMessageDialog(null, "Change in table data!");
    }
    public static void main(String args[]){
        JTableDemo table1 = new JTableDemo();
        table1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        table1.setSize(600, 200);
        table1.setVisible(true);
        table1.setTitle("table 1");
    }
}
