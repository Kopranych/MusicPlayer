import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import gui.MP3PlayerWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        MP3PlayerWindow windowPlayer = new MP3PlayerWindow("Player");
        windowPlayer.createUIComponents();
        windowPlayer.setVisible(true);
    }
}
