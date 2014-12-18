/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author SolaUi
 */
public class logo extends JPanel{
    private BufferedImage logo;

    /**
     * Creates a new instance of ImagePanel
     */
    public logo() {
        try {
// buka file. Cari file gambar lain di computer anda
            File img = new File("NoPicture.png");
// baca image
            logo = ImageIO.read(img);
//img.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(logo,
                0, 0, 700, 1050,
                0, 0, logo.getWidth(null), logo.getHeight(null),
                null);
    }
}
