import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

public class Mod implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b;
    JFrame f;

    Mod() {
        f = new JFrame("gui");

        l1 = new JLabel("whats your marks on oops");
        l1.setBounds(50, 50, 300, 20);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(50, 90, 200, 20);
        f.add(t1);

        l2 = new JLabel("whats your marks in operating system ");
        l2.setBounds(50, 150, 300, 20);
        f.add(l2);

        t2 = new JTextField();
        t2.setBounds(50, 180, 200, 20);
        f.add(t2);

        b = new JButton("Submit");
        b.setBounds(50, 220, 95, 30);
        f.add(b);
        b.addActionListener(this);

        l3 = new JLabel("the sum of marks is : ");
        l3.setBounds(50, 270, 300, 20);
        f.add(l3);
        f.setLayout(null); // Null layout allows precise positioning of components
        f.setSize(500, 500); // Set the size of the frame
        f.setVisible(true); // Make the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify what happens when the frame is closed

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Submit")) {
            printResult(t1.getText(), t2.getText());
        }

    }

    public void printResult(String a, String b) {
        int n1, n2;
        if (a.isEmpty() || b.isEmpty()) {
            l3.setText("cannot be empty");

        } else {
            try {
                n1 = Integer.parseInt(a);
                n2 = Integer.parseInt(b);
                if (n1 < 0 || n2 < 0) {
                    l3.setText("cannot be less than 0");
                } else {
                    int sum = n1 + n2;
                    String ans = Integer.toString(sum);
                    l3.setText("result" + ans);
                    t1.setEditable(false); // Disable text field editing
                    t2.setEditable(false);
                }
            } catch (Exception e) {
                l3.setText("Result : Invalid input"); // Handle exceptions for non-integer input
            }

        }
    }

    public static void main(String[] args) {
        new Mod();
    }
}
