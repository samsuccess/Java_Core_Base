package homework8;

import javax.swing.*;
import java.awt.*;


public class DrawWindow extends JFrame {

    private BattleField battleField;

    static final int WINDOW_X = GameWindow.WINDOW_X + 50;
    static final int WINDOW_Y = GameWindow.WINDOW_Y + 50;
    static final int WINDOW_WIDTH = 205;
    static final int WINDOW_HEIGHT = 200;

    public DrawWindow(BattleField battleField) {
        this.battleField = battleField;
        setBounds(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Draw");

        setLayout(new BorderLayout());
        add(new JLabel("                         НИЧЬЯ"), BorderLayout.CENTER);


        setVisible(false);
    }

}

