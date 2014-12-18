

package TestImage;

import Image.PanelTambahFotoAnggota;
import java.awt.BorderLayout;

import javax.swing.JFrame;


public class TestImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Using Java2D");
        frame.setLayout(new BorderLayout());
        
        PanelTambahFotoAnggota panel = new PanelTambahFotoAnggota();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
    }
}
