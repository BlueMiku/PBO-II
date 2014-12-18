package Image;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.apache.commons.io.FileUtils;

public class PanelTambahFotoAnggota extends JPanel implements ActionListener {

 
    private JLabel labelKodeAnggota;
    private JTextField textKodeAnggota;
    private JButton tombolSimpan;
    private JButton tombolCariGambar;
    private File file;
    private BufferedImage image;
    private JPanel panelTombol;

    public PanelTambahFotoAnggota() {
        try {
            file = new File("NoPicture.png");
            image = ImageIO.read(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        panelTombol = new JPanel();
        panelTombol.setLayout(new FlowLayout());
        
        this.add(panelTombol);

        labelKodeAnggota = new JLabel("Kode");
        panelTombol.add(labelKodeAnggota);

        textKodeAnggota = new JTextField();
        textKodeAnggota.setColumns(10);
        panelTombol.add(textKodeAnggota);
        textKodeAnggota.addActionListener(this);
        textKodeAnggota.setEditable(true);

        tombolCariGambar = new JButton("Cari Gambar");
        panelTombol.add(tombolCariGambar);
        tombolCariGambar.addActionListener(this);

        tombolSimpan = new JButton("Simpan");
        panelTombol.add(tombolSimpan);
        tombolSimpan.addActionListener(this);
        
        
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public void paintComponent(Graphics g) {
        try {
            image = ImageIO.read(file);
            g.drawImage(image, 50, 50, 220, 300, 0, 0, image.getWidth(null), image.getHeight(null), null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void simpan() throws FileNotFoundException, IOException{
        FileOutputStream os = new FileOutputStream(file);
        os.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = null;
        if (e.getSource() == tombolCariGambar) {
            chooser = new JFileChooser();
            int status = chooser.showOpenDialog(this);
            if (status == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
                repaint();
            }
        } else if (e.getSource() == tombolSimpan) {
        try {
        
            FileUtils.copyFile(file, new File(textKodeAnggota.getText()+".png"));
            
            }
         catch (IOException g) {
            System.out.println("Terjadi kesalahan dalam membaca Image");
            System.exit(1);
        }      
            JOptionPane.showMessageDialog(null, "Tersimpan");
        }
    }}

