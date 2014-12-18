package com_135314076_testing;


import com_135314076_view.DialogPekerja;
import com_135314076_view.FrameUtama;
import javax.swing.JFrame;


public class TestDialogPekerja {
public static void main(String[] args) {

    JFrame testFrame = new JFrame();
    FrameUtama owner = null;
    
    DialogPekerja testDialog = new DialogPekerja(owner,true);
    
    testFrame.add(testDialog);
}
}
