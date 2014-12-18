package VIEW;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class tsst {
    public static void main(String[] args) {
        FrameUtama frame = new FrameUtama();
        frame.setLayout(null);
        ImageIcon img = new ImageIcon("C:\\Users\\SolaUi\\Downloads\\Guns_weapons_pantyhose_mahou_shoujo_madoka_magica_anime_akemi_homura_anime_girls_black_hair_2100x1300.jpg");
        frame.setIconImage(img.getImage());
        FormInput panel = new FormInput(frame, true);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setVisible(true);
       
    }
         
}
