package view;

import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private Listeners listeners;

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

        addListeners();
    }

    /**Adds listeners to frame*/
    private void addListeners() {
        listeners = new Listeners();
        addMouseListener(listeners);
        addMouseMotionListener(listeners);
        addKeyListener(listeners);
    }

    public ArrayList<String> getPressedKeys() {
        return listeners.getPressedkeys();
    }
}