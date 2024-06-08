import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class c2JLabel {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("Learning JLabel");
        
        jFrame.setBounds(100,200,700,500);
        
        jFrame.setLayout(null);

        Font font = new Font("Arial",Font.BOLD,34);

        ImageIcon imageIcon = new ImageIcon("images/icon.jpg");

        JLabel jLabel = new JLabel("Hello World",imageIcon,JLabel.CENTER);
        jLabel.setBounds(50,50,500,200);
        jLabel.setFont(font);

        
        Container container = jFrame.getContentPane();
        container.add(jLabel);


        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
