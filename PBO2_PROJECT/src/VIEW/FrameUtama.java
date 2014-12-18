package VIEW;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import javax.swing.*;
import newpackage.DigitalClock;

    public class FrameUtama extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu optionMenu, help;
    JMenuItem exitMenu, tambahPasien,tablePasien;
    JLabel gambar,jamLabel;
    private File file;
    private BufferedImage image;
    JPanel panel;
    
    public FrameUtama(){
       
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("PT.GGWP");
        
        Panel();
        menuBar = new JMenuBar();
        optionMenu = new JMenu("Pilihan");
        menuBar.add(optionMenu);
        help = new JMenu("Help");
        menuBar.add(help);
        exitMenu = new JMenuItem("Exit");
        tambahPasien = new JMenuItem("Tambah Pasien");
        tablePasien = new JMenuItem("Table Pasien");
        optionMenu.add(tambahPasien);
        optionMenu.add(exitMenu);
        optionMenu.add(tablePasien);
        setJMenuBar(menuBar);
        setVisible(true);
        
        exitMenu.addActionListener(this);
        tambahPasien.addActionListener(this);
        tablePasien.addActionListener(this);
   
    }

    public void Panel()
    {
        panel = new JPanel();
        panel.setLayout(null);
        DigitalClock jam = new DigitalClock();
        
        ImageIcon image = new ImageIcon("NoPicture.png");
        gambar = new JLabel(image);
        gambar.setBounds(100,100,494,375);
        jam.setBounds(250, 480, 200, 200);
        panel.add(gambar);
        panel.add(jam);
        this.add(panel);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == exitMenu){
            System.exit(0);
        } 
        else if(event.getSource() == tambahPasien){
            FormInput input = new FormInput(this, true);
        }
        else if(event.getSource() == tablePasien){
            
            
        FormOutput output = new FormOutput(this,true);
        }
    }
}
