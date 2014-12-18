package testing;

import VIEW.FormOutput; 
import javax.swing.JFrame;
import VIEW.FrameUtama;

public class TestFormOutput {
public static void main(String[] args) {

    JFrame testFrame = new JFrame();
    
    FormOutput testDialog = new FormOutput();
    
    testFrame.add(testDialog);
}
}
