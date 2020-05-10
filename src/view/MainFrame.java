package view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private Listeners listeners;

    /**Activates the JFrame environment*/
    public MainFrame() {
        super();

        add(new MainPanel());
        pack();
        requestFocus(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        addListeners();
    }


    /**Adds listeners to frame */
    private void addListeners() {
        listeners = new Listeners();
        addMouseListener(listeners);
        addMouseMotionListener(listeners);
        addKeyListener(listeners);
    }
}