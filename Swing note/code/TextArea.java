import javax.swing.*;
import java.awt.*;

public class TextArea {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JTextArea Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextArea
        JTextArea textArea = new JTextArea();
        
        // Set properties for the text area
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));  // Set font
        textArea.setForeground(Color.BLACK);  // Set text color
        textArea.setBackground(Color.LIGHT_GRAY);  // Set background color
        textArea.setLineWrap(true);  // Enable line wrapping
        textArea.setWrapStyleWord(true);  // Wrap at word boundaries
        textArea.setText("my name is apon and i love all girls hostels girls");

        // Create a JScrollPane to make the JTextArea scrollable
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  // Always show vertical scrollbar

        // Add the JScrollPane to the frame
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
