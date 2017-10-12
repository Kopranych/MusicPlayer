import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import gui.MP3Player;
import gui.PlayerGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        MP3Player windowPlayer = new MP3Player("Player");
        windowPlayer.createUIComponents();
        windowPlayer.setVisible(true);
    }
}
