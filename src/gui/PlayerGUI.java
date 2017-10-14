package gui;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;

import javax.swing.*;
import java.awt.*;


public class PlayerGUI extends JFrame {

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JSlider slider1;
    private JSpinner spinner1;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuService;
    private JMenu menuOpenPlaylist;
    private JMenu menuSavePlaylist;
    private JMenu menuExit;

    public PlayerGUI(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setPreferredSize(new Dimension(400, 500));
    }


    public void createUIComponents() {
        // TODO: place custom component creation code here
        Container container = getContentPane();
        container.add(panel = new JPanel());
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuOpenPlaylist = new JMenu("Open playlist");
        menuFile.add(menuOpenPlaylist);

        menuBar.add(menuFile);
        setJMenuBar(menuBar);

    }


}
