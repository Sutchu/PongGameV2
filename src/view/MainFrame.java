package view;

import controller.Controller;

import javax.swing.*;

public class MainFrame extends JFrame {


    public MainFrame() {
        super();
        requestFocus(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new MainPanel());
        pack();

        addListeners();
        startThread();
    }

    private void addListeners() {
        Listeners listeners = new Listeners();
        addMouseListener(listeners);
        addMouseMotionListener(listeners);
        addKeyListener(listeners);
    }

    private void startThread() {
        Timer timer = new Timer(10, e -> {
            Controller.getInstance().updateGame();
            repaint();
        });

        timer.start();
    }


    public static void main(String[] args) {new MainFrame();}
}