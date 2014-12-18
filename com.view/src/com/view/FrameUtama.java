package com.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameUtama extends JFrame{

    JFrame frame;
    JMenu pekerjaMenu;
    JMenu helpMenu;
    JMenuBar menuBar;   
    JMenuItem exitMenu;
    JMenuItem EditPekerja;
    
    public FrameUtama()
    {
      frame = new JFrame();
      frame.setVisible(true);
      frame.setSize(300, 150);
      frame.setTitle("PT. XYZ");
      frame.setLayout(null);
      menuBar = new JMenuBar();
      frame.setJMenuBar(menuBar);
      
      pekerjaMenu = new JMenu("Pekerja");
      menuBar.add(pekerjaMenu);
       
      helpMenu = new JMenu("Help");
      menuBar.add(helpMenu);
      
      EditPekerja = new JMenuItem("EditPekerja");
      pekerjaMenu.add(EditPekerja);
      
      exitMenu = new JMenuItem("exit");
      pekerjaMenu.add(exitMenu);
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    
    
    
}
