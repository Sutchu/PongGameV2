package view;

import javax.swing.*;

public class MainFrame extends JFrame {


    /**Activates the JFrame environment*/
    public MainFrame() {
        super();
    }

    /**Adjusts the features of the frame*/
    public void initProperties() {
        requestFocus(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();

        //addListeners();
    }

    /**Adds listeners to frame*/
    private void addListeners() {
        Listeners listeners = new Listeners();
        addMouseListener(listeners);
        addMouseMotionListener(listeners);
        addKeyListener(listeners);
    }
}