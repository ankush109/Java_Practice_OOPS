import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

public class g implements ActionListener {
    JFrame f; // A frame for the GUI
    JTextField t1, t2; // Text fields for entering admission counts
    JLabel l1, l2, res; // Labels for instructions and displaying results
    JButton b; // A button to trigger the action

    g() {
        f = new JFrame("GUI"); // Create a JFrame (the main window) with the title "GUI"

        // Create and set properties for the first label
        l1 = new JLabel("Enter admission count for CSE");
        l1.setBounds(50, 50, 300, 20); // Set position and size
        f.add(l1); // Add it to the frame

        // Create and set properties for the first text field
        t1 = new JTextField();
        t1.setBounds(50, 90, 200, 20);
        f.add(t1);

        // Create and set properties for the second label
        l2 = new JLabel("Enter admission count for CSBS");
        l2.setBounds(50, 150, 300, 20);
        f.add(l2);

        // Create and set properties for the second text field
        t2 = new JTextField();
        t2.setBounds(50, 180, 200, 20);
        f.add(t2);

        // Create and set properties for the button
        b = new JButton("Submit");
        b.setBounds(50, 220, 95, 30);
        f.add(b);
        b.addActionListener(this); // Register this class as an ActionListener for the button

        // Create and set properties for the result label
        res = new JLabel("Result : ");
        res.setBounds(50, 270, 300, 20);
        f.add(res);

        // Should always be at the end: Set layout to null, set frame size, make it
        // visible, and specify the close operation
        f.setLayout(null); // Null layout allows precise positioning of components
        f.setSize(500, 500); // Set the size of the frame
        f.setVisible(true); // Make the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify what happens when the frame is closed
    }

    public void actionPerformed(ActionEvent ae) {
        // This method is called when the button is clicked
        if (ae.getActionCommand().equals("Submit")) {
            // Check if the action command of the event is "Submit"
            displayResult(t1.getText(), t2.getText()); // Call the displayResult method with text field inputs
        }
    }

    public void displayResult(String a, String b) {
        int n1, n2;
        if (a.isEmpty() || b.isEmpty()) {
            res.setText("Result : Input Field empty");
        } else {
            try {
                n1 = Integer.parseInt(a); // Parse the input to an integer
                n2 = Integer.parseInt(b);
                if (n1 <= 0 || n2 <= 0) {
                    res.setText("Result : Value cannot be less than 1");
                } else {
                    int sum = n1 + n2; // Calculate the sum
                    String r = Integer.toString(sum); // Convert the result back to a string
                    res.setText("Result : " + r); // Display the result in the label
                    t1.setEditable(false); // Disable text field editing
                    t2.setEditable(false);
                }
            } catch (Exception e) {
                res.setText("Result : Invalid input"); // Handle exceptions for non-integer input
            }
        }
    }

    public static void main(String args[]) throws Exception {
        new g(); // Create an instance of the "g" class to launch the GUI
    }
}
