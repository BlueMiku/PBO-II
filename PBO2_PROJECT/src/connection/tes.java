/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import VIEW.table;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

public class tes {
    public static void main(String[] args) throws SQLException {
        JFrame fr = new JFrame();
        fr.setSize(1280,720);
        table aa = new table();
        fr.add(aa);
        fr.setVisible(true);
        
    }
}
