////Write a program to perform 'counting character and word' using GUI. in java 


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CharacterWordCounter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Character and Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null);

        // Create components
        JLabel instructionLabel = new JLabel("Enter text:");
        JLabel charCountLabel = new JLabel("Character Count:");
        JLabel wordCountLabel = new JLabel("Word Count:");
        JLabel charCountResult = new JLabel("0");
        JLabel wordCountResult = new JLabel("0");
        frame.add(instructionLabel);
        frame.add(charCountLabel);
        frame.add(wordCountLabel);
        frame.add(charCountResult);
        frame.add(wordCountResult);

        JTextArea textArea = new JTextArea();
        frame.add(textArea);

        JButton countButton = new JButton("Count");
        frame.add(countButton);

        // Set bounds for components
        instructionLabel.setBounds(20, 20, 100, 30);
        textArea.setBounds(20, 60, 450, 100);
        countButton.setBounds(20, 180, 80, 30);
        charCountLabel.setBounds(120, 180, 120, 30);
        wordCountLabel.setBounds(120, 220, 120, 30);
        charCountResult.setBounds(250, 180, 100, 30);
        wordCountResult.setBounds(250, 220, 100, 30);

        // Add action listener to the button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                int charCount = text.length();
                int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;

                charCountResult.setText(String.valueOf(charCount));
                wordCountResult.setText(String.valueOf(wordCount));
            }
        });

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
