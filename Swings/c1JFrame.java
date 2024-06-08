import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class c1JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // create a frame

        frame.setTitle("Code 1"); // set title to the frame

        ImageIcon imageIcon = new ImageIcon("images/icon.jpg"); // imageicon info
        frame.setIconImage(imageIcon.getImage()); // setting icon to frame

        
        Container container = frame.getContentPane(); // getting area of the frame
        container.setBackground(Color.CYAN); // setting background color

        frame.setBounds(100, 200, 700, 500); // define position x then y and then width of frame and height of frame

        frame.setResizable(false); // the frame can't be resizeable

        frame.setVisible(true); // display frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program close from the memory
    }    
}