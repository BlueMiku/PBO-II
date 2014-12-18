import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public final class GUI extends JFrame implements ActionListener{
    static int openFrameCount = 0;
    static final int xOffset = 30, yOffset = 30;
    JLabel searchLabel;
    JButton showButton;
    JButton connectButton;
    JTextField searchField;
    JTable empTable;
    JPanel panel1, panel2, panel3, panel4;
    DigitalClock jamDigital;

    public GUI() {
        setTitle("Table Employee");
        setSize(800, 600);
        Panel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Panel() {
        panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.blue),
                "Employee"));
        
        empTable = new JTable();
        empTable.setPreferredScrollableViewportSize(new Dimension(700, 350));
        JScrollPane scrollPane = new JScrollPane(empTable);
        panel1.add(scrollPane);
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 1));

        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2, 1));
        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        
        searchLabel = new JLabel("Masukkan nama : ");
        add(searchLabel);
        searchField = new JTextField();
        add(searchField);
        showButton = new JButton("Tampil");
        showButton.addActionListener(this);
        add(showButton);
        connectButton = new JButton("Cek Koneksi");
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataHandler cek = new DataHandler();
                JOptionPane.showMessageDialog(null, cek.getDBConnnection());
            }
        });
        jamDigital = new DigitalClock();
        panel3.add(searchLabel);
        panel3.add(searchField);
        panel4.add(showButton);
        panel4.add(connectButton);
        panel4.add(jamDigital);
        panel2.add(panel3);
        panel2.add(panel4);
        this.setLayout(new GridLayout(2, 1));
        this.add(panel1);
        this.add(panel2);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        if ((clickedButton.getText()).compareTo("Tampil") == 0) {
            EmployeeTableModel e;
            System.out.println(searchField.getText());
            try {
                e = new EmployeeTableModel(searchField.getText());
                empTable.setModel(e);
                empTable.revalidate();
            } catch (Exception ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}
