package gui;

import javax.swing.*;
import java.awt.*;

public class MP3Player extends JFrame {
    private JPanel rootPanel;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuService;
    private JMenu menuOpenPlaylist;
    private JMenu menuSavePlaylist;
    private JMenu menuExit;

    public MP3Player(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setDefaultLookAndFeelDecorated(true);
    }


    public void createUIComponents() {
        // TODO: place custom component creation code here
        Container container = getContentPane();

        container.add(panel = new JPanel());

        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuOpenPlaylist = new JMenu("Open playlist");
        menuFile.add(menuOpenPlaylist);
        container.add(menuBar);
        menuBar.add(menuFile);
        setJMenuBar(menuBar);
        setSize(500,500);
    }
}
