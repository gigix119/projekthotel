package koy.podstawy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okienko extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public Okienko() {
        frame = new JFrame();


        button = new JButton("Podaj datę");
        button.setBounds(50, 50, 100, 20);
        add(button);
        button.addActionListener(this);

        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("OUR GUI");
        frame.pack();
        frame.setVisible(true);


        //JButton button = new JButton();
        //JLabel label = new JLabel();
    }

    public static void main(String[] args) {
        new Okienko();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//todo na wstepie pokaze jak zrobic pprogram okienkowy w Javie....
    }
}
