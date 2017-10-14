package control;

import gui.ButtonImproved;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!(e.getSource() instanceof JButton)){
            return;
        }
        ButtonImproved temp = (ButtonImproved)e.getSource();
        if(temp.getIcon().toString().equals("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\player_play.png")){
            temp.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\player_pause.png");
        }else
            temp.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\player_play.png");
    }
}
