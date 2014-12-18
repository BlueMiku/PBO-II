package VIEW;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class FormOutput extends JDialog {
   
    table tab = new table();
    private final FrameUtama owner;
    public FormOutput(final FrameUtama owner, boolean modal) 
    {   
        this.owner = owner;
       JFrame fr = new JFrame();
        fr.setSize(1280,720);
        table aa = new table();
        fr.add(aa);
        fr.setVisible(true);
    }

 
}


