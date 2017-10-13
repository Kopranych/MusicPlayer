package gui;

import control.ActionListenerMenuBar;

import javax.swing.*;
import java.awt.*;

public class MP3Player extends JFrame {
    private JPanel panelPlayer;
    private JPanel panelPlaylist;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuService;
    private JMenuItem menuOpenPlaylist;
    private JMenuItem menuSavePlaylist;
    private JMenuItem menuExit;
    private JMenu menuChangeSkin;
    private JMenuItem skinOne;
    private JMenuItem skinTwo;
    private ActionListenerMenuBar listenerMenuBar;

    public MP3Player(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(500,500);
        listenerMenuBar = new ActionListenerMenuBar();
    }


    public void createUIComponents() {
        // TODO: place custom component creation code here
       // setContentPane(rootPanel = new JPanel());

        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuOpenPlaylist = new JMenuItem("Open playlist");
        menuFile.add(menuOpenPlaylist);
        menuFile.add(menuSavePlaylist = new JMenuItem("Save playlist"));
        menuFile.addSeparator();
        menuFile.add(menuExit = new JMenuItem("Exit"));
        menuExit.addActionListener(listenerMenuBar);

        menuService = new JMenu("Service");
        menuService.add(menuChangeSkin = new JMenu("Change skin"));
        menuChangeSkin.add(skinOne = new JMenuItem("Skin 1"));
        menuChangeSkin.add(skinTwo = new JMenuItem("Skin 2"));
        skinOne.addActionListener(listenerMenuBar);

        menuBar.add(menuFile);
        menuBar.add(menuService);
        setJMenuBar(menuBar);

    }
}
