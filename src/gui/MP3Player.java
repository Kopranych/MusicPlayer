package gui;

import control.ActionListenerButton;
import control.ActionListenerMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MP3Player extends JFrame {
    private JPanel panelPlayer;
    private JPanel panelPlaylist;
    private JPanel panelManager;

    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuService;
    private JMenuItem menuOpenPlaylist;
    private JMenuItem menuSavePlaylist;
    private JMenuItem menuExit;
    private JMenu menuChangeSkin;
    private JMenuItem skinOne;
    private JMenuItem skinTwo;

    private ButtonImproved btnPlay;
    private ButtonImproved btnPause;
    private ButtonImproved btnStop;
    private ButtonImproved btnPrevious;
    private ButtonImproved btnNext;
    private JToggleButton tglBtnVolume;
    private JSlider sldVolume;
    private JSlider sldTrack;
    private JPanel panelVolume;
    private Container container;

    private JScrollPane scrolList;
    private JList playList;
    private ButtonImproved btnAddTrack;
    private ButtonImproved btnRemoveTrack;
    private ButtonImproved btnDownTrack;
    private ButtonImproved btnUpTrack;
    private JPanel panelBtnPlaylist;

    private JTextField fieldSearch;
    private ButtonImproved btnSearch;
    private JPanel panelSearch;

    private ActionListenerMenuBar listenerMenuBar;
    private ActionListenerButton listenerButton;

    private static final int WIDTH_WINDOW = 400;
    private static final int HEIGHT_WINDOW = 500;

    public MP3Player(String title) throws HeadlessException {
        super(title);
        setIconImage(new ImageIcon("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\multimedia-player.png").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(WIDTH_WINDOW,HEIGHT_WINDOW);
        setResizable(false);
        setLocationRelativeTo(null);
        listenerMenuBar = new ActionListenerMenuBar();
        listenerMenuBar.setWindowPlayer(this);
        listenerButton = new ActionListenerButton();
        container = getContentPane();
        container.setLayout(new BorderLayout());

    }


    public void createUIComponents() {
        // TODO: place custom component creation code here
        ArrayList<JButton> listButtons = new ArrayList<JButton>();

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
        menuChangeSkin.setIcon(new ImageIcon("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\multimedia-player.png"));
        skinOne.addActionListener(listenerMenuBar);
        skinTwo.addActionListener(listenerMenuBar);

        menuBar.add(menuFile);
        menuBar.add(menuService);
        setJMenuBar(menuBar);

        listButtons.add(btnPlay= new ButtonImproved());
        listButtons.add(btnStop= new ButtonImproved());
        listButtons.add(btnNext= new ButtonImproved());
        listButtons.add(btnPrevious= new ButtonImproved());
        listButtons.add(btnPause= new ButtonImproved());
        Iterator<JButton> itr = listButtons.iterator();
//        while (itr.hasNext()){
//
//        }

        btnPlay.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\player_play.png");
        btnPlay.removeFrameButton();
        btnPlay.setToolTipText("Воспроизвести");
        btnStop.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\player_stop.png");
        btnStop.removeFrameButton();
        btnStop.setToolTipText("Остановить");
        btnNext.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\player_end.png");
        btnNext.removeFrameButton();
        btnNext.setToolTipText("Следующий");
        btnPrevious.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\player_start.png");
        btnPrevious.removeFrameButton();
        btnPrevious.setToolTipText("Предыдущий");

        btnPlay.addActionListener(listenerButton);
        btnPlay.setToolTipText("Воспроизвести");
//        btnPlay.addFocusListener(new FocusAdapter() {
//            @Override
////            public void focusGained(FocusEvent e) {
////                super.focusGained(e);
////                e.paramString(btnPlay.getTool);
////            }
//        });



        container.add(BorderLayout.NORTH, panelManager = new JPanel());
        container.add(BorderLayout.CENTER, panelPlaylist = new JPanel());
        panelManager.setLayout(new BorderLayout());
        panelManager.add(BorderLayout.NORTH, sldTrack = new JSlider());
        sldTrack.setToolTipText("Перемотка");

        tglBtnVolume = new JToggleButton();
        tglBtnVolume.setIcon(new ImageIcon("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\volume_up.png"));
        panelManager.add(BorderLayout.CENTER, panelPlayer = new JPanel());
        tglBtnVolume.setToolTipText("Звук");
        tglBtnVolume.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(tglBtnVolume.isSelected()){
                    tglBtnVolume.setIcon(new ImageIcon("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\volume_down.png"));
                    tglBtnVolume.setToolTipText("Звук выключен");
                }else {
                    tglBtnVolume.setIcon(new ImageIcon("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\volume_up.png"));
                    tglBtnVolume.setToolTipText("Звук включен");
                }
            }
        });

        panelManager.add(BorderLayout.SOUTH, panelVolume= new JPanel());
        panelVolume.add(sldVolume = new JSlider());
        panelVolume.add(tglBtnVolume);
        sldVolume.setToolTipText("Громкость");


        panelPlayer.add(btnPrevious);
        panelPlayer.add(btnPlay);
        panelPlayer.add(btnStop);
        panelPlayer.add(btnNext);
        panelPlayer.setBackground(Color.GRAY);

        panelPlaylist.setLayout(new BorderLayout());
        scrolList = new JScrollPane(playList = new JList());
        panelPlaylist.add(BorderLayout.CENTER, scrolList);
        panelPlaylist.add(BorderLayout.SOUTH, panelBtnPlaylist = new JPanel());
        panelPlaylist.add(BorderLayout.NORTH, panelSearch = new JPanel());
        panelSearch.add(fieldSearch = new JTextField());
        panelSearch.add(btnSearch = new ButtonImproved("Найти"));

        btnAddTrack = new ButtonImproved();
        btnAddTrack.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\add.png");
        btnAddTrack.removeFrameButton();
        btnAddTrack.setToolTipText("Добавить песню");
        btnRemoveTrack = new ButtonImproved();
        btnRemoveTrack.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\delete.png");
        btnRemoveTrack.removeFrameButton();
        btnRemoveTrack.setToolTipText("Удалить песню");
        btnUpTrack = new ButtonImproved();
        btnUpTrack.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\up.png");
        btnUpTrack.removeFrameButton();
        btnUpTrack.setToolTipText("Вверх");
        btnDownTrack = new ButtonImproved();
        btnDownTrack.addIconButton("C:\\JavaDevelopment\\MusicPleer\\src\\icon\\down.png");
        btnDownTrack.removeFrameButton();
        btnDownTrack.setToolTipText("Вниз");

        panelBtnPlaylist.add(btnAddTrack);
        panelBtnPlaylist.add(btnRemoveTrack);
        panelBtnPlaylist.add(btnUpTrack);
        panelBtnPlaylist.add(btnDownTrack);

    }
}
