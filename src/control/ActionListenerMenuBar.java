package control;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import gui.MP3PlayerWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerMenuBar implements ActionListener {
    private MP3PlayerWindow windowPlayer;

    public void setWindowPlayer(MP3PlayerWindow windowPlayer) {
        this.windowPlayer = windowPlayer;
    }

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
            SwingUtilities.updateComponentTreeUI(windowPlayer);
        }else if(tempMenu.getActionCommand().equals("Skin 2")){
            try {
                UIManager.setLookAndFeel(new AluminiumLookAndFeel());
            } catch (UnsupportedLookAndFeelException e1) {
                e1.printStackTrace();
            }
            SwingUtilities.updateComponentTreeUI(windowPlayer);
        }
    }
}
