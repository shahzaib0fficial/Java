import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class c3JTextFeild {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Text Feild");
        jFrame.setBounds(100,200,700,500);
        Container container = jFrame.getContentPane();
        container.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Font font = new Font("Arial",Font.ITALIC,32);

        JTextField textField = new JTextField();
        textField.setBounds(0,0,400,34);
        textField.setText("Hello World");
        textField.setFont(font);
        // textField.setEditable(false);
        container.add(textField);

        jFrame.setVisible(true);
    }
}
