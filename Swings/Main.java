import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    JButton number[];
    JButton plus;
    JButton minus;
    JButton multiply;
    JButton divide;
    JButton equals;
    JButton dot;
    
    JTextField operand1;
    JTextField operand2;
    JTextField output;

    public Calculator() {
        this.setTitle("My Calulator");
        setSize(225,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        number = new JButton[10];
        for(int i=0;i<10;i++) {
            number[i] = new JButton(""+i);
        }
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("/");
        equals = new JButton("=");
        dot = new JButton(".");

        operand1 = new JTextField(7);
        operand2 = new JTextField(7);
        output = new JTextField(15);

        JPanel top = new JPanel();
        top.setLayout(new GridLayout(2,1));
        add(top, BorderLayout.NORTH);

        JPanel input = new JPanel();
        input.add(operand1);
        input.add(operand2);

        JPanel result = new JPanel();
        result.add(output);

        top.add(input);
        top.add(result);

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4,1));
        center.add(getRow(number[7], number[8], number[9], plus));
        center.add(getRow(number[4], number[5], number[6], minus));
        center.add(getRow(number[1], number[2], number[3], multiply));
        center.add(getRow(dot, number[0], equals, divide));

        add(center);
    }

    private JPanel getRow(JButton b1,JButton b2,JButton b3,JButton b4){
        JPanel row = new JPanel();
        row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
        row.add(Box.createHorizontalGlue());
        row.add(b1);
        row.add(b2);
        row.add(b3);
        row.add(b4);
        row.add(Box.createHorizontalGlue());

        return row;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
        calculator.setResizable(false);
    }
}