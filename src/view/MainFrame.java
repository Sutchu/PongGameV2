package view;

import javax.swing.*;

public class MainFrame extends JFrame {


    public MainFrame() {
        super();
    }

    public void initProperties() {
        requestFocus(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

        //addListeners();
    }

    private void addListeners() {
        Listeners listeners = new Listeners();
        addMouseListener(listeners);
        addMouseMotionListener(listeners);
        addKeyListener(listeners);
    }
}