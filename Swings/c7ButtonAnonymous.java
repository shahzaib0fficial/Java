import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class c7ButtonAnonymous {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Anonymous Class");
        jFrame.setBounds(100,100,700,500);
        jFrame.setLayout(null);
        Container container =  jFrame.getContentPane();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Click Me");
        jButton.setBounds(10,10,100,30);
        container.add(jButton);
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                container.setBackground(Color.cyan);
            }
        });
        
        jFrame.setVisible(true);
    }
}