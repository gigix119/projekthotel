package koy.podstawy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Projekt implements ActionListener {
    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public Projekt() {
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks : 0");
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 40, 50, 60));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OUR GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Projekt();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks :" + count);
    }
}
