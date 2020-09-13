package lesson7a;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow() {

        setBounds(400, 400, 800,600);
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(null);
        JButton button1 = new JButton("btn1");
        button1.setBounds(100, 100, 150, 100);
        add(button1);




        setVisible(true);
    }
}
