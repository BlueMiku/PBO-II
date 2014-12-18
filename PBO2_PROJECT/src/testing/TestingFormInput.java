package testing;

import VIEW.FormInput;
import VIEW.FrameUtama;
import javax.swing.JFrame;

public class TestingFormInput {
public static void main(String[] args) 
{
     JFrame testFrame = new JFrame();
     FrameUtama owner = null;
     FormInput testDialog = new FormInput(owner,true);
     
     testFrame.add(testDialog);
    
    testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
    
}
