import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class BackgroundChanger implements ActionListener{
    Container container;
    JButton jButton1 = new JButton("RED");
    JButton jButton2 = new JButton("BLUE");
    JButton jButton3 = new JButton("GREEN");

    BackgroundChanger() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Background Changer");
        jFrame.setBounds(100,100,700,500);
        jFrame.setLayout(null);
        container = jFrame.getContentPane();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jButton1.setBounds(100,100,100,30);
        jButton2.setBounds(250,100,100,30);
        jButton3.setBounds(400,100,100,30);

        container.add(jButton1);
        container.add(jButton2);
        container.add(jButton3);


        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);

        jFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jButton1) {
            container.setBackground(Color.RED);
        }
        else if(e.getSource() == jButton2) {
            container.setBackground(Color.BLUE);
        }
        else {
            container.setBackground(Color.GREEN);
        }
    }
}

public class c6ButtonActionListener {
    public static void main(String[] args) {
        new BackgroundChanger();
    }
}
