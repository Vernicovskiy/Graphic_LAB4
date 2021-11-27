package bsu.rfe.java.group6.lab4.Vernicovskiy.varA7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class MainFrame extends JFrame {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 600;
    public  MainFrame(){
        super("Построение графиков функции на основе заранее подготовленных файлов");
        setSize(WIDTH,HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit(); // отцентровка
        setLocation((kit.getScreenSize().width - WIDTH) / 2,
                (kit.getScreenSize().height - HEIGHT) / 2);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);
        Action openGraphicsAction = new AbstractAction("Открыть файл") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                fileChooser.setDialogTitle("Our Directory");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                if(fileChooser.showOpenDialog(MainFrame.this) /*Функция открытия диалогового окна «Открыть файл*/ == JFileChooser.APPROVE_OPTION){


                }

            }
        };
        fileMenu.add(openGraphicsAction);

        JMenu graphicsMenu = new JMenu("График");
        menuBar.add(graphicsMenu);



    }
     public static void main(String args[]){
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


     }
}
