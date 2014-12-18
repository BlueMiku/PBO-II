
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MainFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JFrame frameUtama;
    JMenu optionMenu;
    JMenuItem EmployeeTable;
    
    public MainFrame(){
    this.setTitle("Employee");
    this.setSize(800,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    menuBar = new JMenuBar();
    optionMenu = new JMenu("Option");
    
    
    EmployeeTable = new JMenuItem("Employee Table");
    EmployeeTable.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK));
    EmployeeTable.setMnemonic(KeyEvent.VK_E);
    optionMenu.add(EmployeeTable);
    setJMenuBar(menuBar);
    menuBar.add(optionMenu);
    setVisible(true);
    
    EmployeeTable.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == EmployeeTable){
            GUI gui = new GUI();
        } 
    }
   
    
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
    }
    
   
}

