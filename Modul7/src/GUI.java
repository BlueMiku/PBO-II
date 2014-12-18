
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public final class GUI extends JFrame implements ActionListener {

    JPanel pa, pb, p1, p2;
    JLabel namaLabel;
    JButton showButton, connectButton;
    JTextField namaText;
    JTable empTable;

    public GUI() {
        this.setTitle(" ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        addPanel();
    }

    public void addPanel() {
        pa = new JPanel();
        pa.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.red),
                "Employee"));
        empTable = new JTable();
        empTable.setPreferredScrollableViewportSize(new Dimension(700, 350));
        JScrollPane scrollPane = new JScrollPane(empTable);
        pa.add(scrollPane);
        pb = new JPanel();
        pb.setLayout(new GridLayout(2, 1));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1));
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        namaLabel = new JLabel("Masukan nama ");
        p2.add(namaLabel);
        namaText = new JTextField();
        namaText.setColumns(16);
        p2.add(namaText);
        showButton = new JButton("Tampil");
        showButton.addActionListener(this);
        connectButton = new JButton("Cek Koneksi");
        connectButton.addActionListener((ActionEvent e) -> {
            DataHandler dh = new DataHandler();
            JOptionPane.showMessageDialog(null, dh.getDBConnection2());
        });

        p2.add(showButton);
        p2.add(connectButton);
        pb.add(p1);
        pb.add(p2);
        this.setLayout(new GridLayout(2, 1));
        this.add(pa);
        this.add(pb);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        if ((clickedButton.getText()).compareTo("Tampil") == 0) {
            EmployeeTableModel emp;
            try {
                System.out.println(namaText.getText());
                emp = new EmployeeTableModel(namaText.getText());
                empTable.setModel(emp);
                empTable.revalidate();
            } catch (Exception ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

