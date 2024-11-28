package koy.podstawy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class MojProgram extends JFrame implements ActionListener {
    JButton bPodajDate, bWyjście;

    public MojProgram() {
        setSize(300, 200);
        setTitle("Window Java");
        setLayout(null);
        bPodajDate = new JButton("Podaj datę");
        bPodajDate.setBounds(50, 50, 100, 20);
        add(bPodajDate);
        bPodajDate.addActionListener(this);

        bWyjście = new JButton("Wyjście");
        bWyjście.setBounds(150, 50, 100, 20);
        add(bWyjście);
        bWyjście.addActionListener(this);
    }

    public static void main(String[] args) {
        MojProgram mojProgram = new MojProgram();
        mojProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mojProgram.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource();
        if (źródło == bPodajDate) {
        } else if (źródło == bWyjście)
            dispose();
        System.out.println(new Date());
    }
}
