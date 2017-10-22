import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import control.ComparatorMp3;
import gui.MP3PlayerWindow;
import model.MP3file;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

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
//        MP3PlayerWindow player = new MP3PlayerWindow("Player");
//        List<MP3file> list = new ArrayList();
//        list.add(new MP3file("25/17"));
//        list.add(new MP3file("Грот"));
//        list.add(new MP3file("D-man55"));
//        list.add(new MP3file("Миша Маваши"));
//        list.add(new MP3file("Баста"));
//        list.add(new MP3file("Каста"));
//        System.out.println(list);
//        System.out.println(list.contains(player));
//        System.out.println(list.get(1).equals(4));
//        System.out.println(list.indexOf("I am"));
//        list.sort(new ComparatorMp3());
//
//        for (MP3file mp3file : list) {
//            System.out.println(mp3file.getName());
//        }
////        TreeSet<MP3file> listSet = new TreeSet<>(list);
////        for (MP3file mp3file : listSet) {
////            System.out.println(mp3file.getName());
////        }


    }
}
