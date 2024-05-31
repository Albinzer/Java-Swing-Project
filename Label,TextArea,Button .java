// Write a program to perform aLabel,TextArea, Button using GUI.


import javax.swing.*;
import java.awt.event.*;

public class Abs13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Abs13");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter your Message");
        label.setBounds(50, 20, 150, 30);
        frame.add(label);

        JTextArea textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(50, 60, 600, 250);
        frame.add(scroll);

        JButton button = new JButton("Done");
        button.setBounds(50, 320, 80, 35);
        frame.add(button);

        button.addActionListener(e -> {
            String message = textArea.getText();
            JOptionPane.showMessageDialog(frame, message);
        });

        frame.setVisible(true);
    }
}
