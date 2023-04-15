package ex10_4;

import javax.swing.*;
import java.awt.*;

public class MouseListenerEx extends JFrame {
    private static JLabel la = new JLabel("Hello");

    public MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.addMouseListener(new MyMouseListener());

        container.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        container.add(la);

        setSize(250, 250);
        setVisible(true);
    }

    public static JLabel getLabel() {
        return la;
    }
}
