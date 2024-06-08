import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class c4JPasswordFeild {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Password Feild");
        jFrame.setBounds(100,200,700,500);
        jFrame.setLayout(null);
        Container container = jFrame.getContentPane();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(100,100,200,32);
        container.add(jPasswordField);

        jPasswordField.setEchoChar('*');
        // jPasswordField.setEchoChar((char)0);

        jFrame.setVisible(true);
    }
}
