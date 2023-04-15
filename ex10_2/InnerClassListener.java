package ex10_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame {
    public InnerClassListener() {
        setTitle("ACtion 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        btn.addActionListener(new MyInnerActionListener());
        container.add(btn);
        setSize(350, 150);
        setVisible(true);
    }

    private class MyInnerActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");
        }

    }
}
