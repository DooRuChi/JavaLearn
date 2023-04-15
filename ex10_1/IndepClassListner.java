package ex10_1;

import javax.swing.*;
import java.awt.*;

public class IndepClassListner extends JFrame {
    public IndepClassListner() {
        setTitle("Action 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        container.add(btn);

        setSize(350, 150);
        setVisible(true);
    }
}
