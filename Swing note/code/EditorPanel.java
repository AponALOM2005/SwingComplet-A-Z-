import javax.swing.*;
import java.awt.*;

public class EditorPanel {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Text Editor Panel");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel as the editor panel
        JPanel editorPanel = new JPanel();
        editorPanel.setLayout(new BorderLayout()); // Using BorderLayout

        // Create a JTextArea for typing text
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16)); // Set font style and size
        textArea.setLineWrap(true); // Wrap text to the next line when it reaches the end of the panel
        textArea.setWrapStyleWord(true); // Wrap whole words to the next line
        textArea.setBackground(Color.WHITE); // Set background color for the text area

        // Create a JScrollPane to add scrollbars if the text exceeds the visible area
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // Disable horizontal scrollbar

        // Add the scrollPane to the editorPanel
        editorPanel.add(scrollPane, BorderLayout.CENTER);

        // Add the editorPanel to the frame
        frame.setLayout(new BorderLayout());
        frame.add(editorPanel, BorderLayout.CENTER);

        // Set the frame background color to light gray
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Make the frame visible
        frame.setVisible(true);
    }
}
