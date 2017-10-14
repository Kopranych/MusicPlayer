package gui;

import javax.swing.*;

public class ButtonImproved extends JButton {


    public ButtonImproved() {
    }

    public ButtonImproved(String text) {
        super(text);
    }

    public void removeFrameButton() {
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setFocusPainted(false);
    }

    public void addIconButton(String path){
        this.setIcon(new ImageIcon(path));
    }
}
