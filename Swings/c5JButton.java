import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class c5JButton {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(100,200,700,500);
        jFrame.setLayout(null);
        Container container = jFrame.getContentPane();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Click Me");
        jButton.setBounds(10,10,90,30);
        container.add(jButton);

        jFrame.setVisible(true);
    }
}
