package Classes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Close {
    static int option;
    static public void Exit(JFrame jf){
        option = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", 
                 JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(option == JOptionPane.YES_OPTION){
            jf.dispose();
        }
    }
}
