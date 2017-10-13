package control;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerMenuBar implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem tempMenu = (JMenuItem) e.getSource();

        if(tempMenu.getActionCommand().equals("Exit")){
            System.exit(0);
        }else if(tempMenu.getActionCommand().equals("Skin 1")){
            try {
                UIManager.setLookAndFeel(new TextureLookAndFeel());
            } catch (UnsupportedLookAndFeelException e1) {
                e1.printStackTrace();
            }
            JFrame.setDefaultLookAndFeelDecorated(true);
        }else if(tempMenu.getActionCommand().equals("Skin 2")){
            try {
                UIManager.setLookAndFeel(new AluminiumLookAndFeel());
            } catch (UnsupportedLookAndFeelException e1) {
                e1.printStackTrace();
            }
            JFrame.setDefaultLookAndFeelDecorated(true);
        }
    }
}
