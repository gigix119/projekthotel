package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class FirstLesson extends JFrame implements ActionListener {


    public static void main(String[] args) {

        FirstLesson window = new FirstLesson();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

    public  FirstLesson (){

        setSize(300,200);
        setTitle("My first window ");
        setLayout(null);
        JButton button = new JButton("Podaj datę ");
        button.setBounds(100,60,100,20);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new Date());
    }
}
