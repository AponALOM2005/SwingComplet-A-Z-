import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class TextPane{
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Text Pane Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextPane (for displaying styled text)
        JTextPane textPane = new JTextPane();
        textPane.setEditable(true); // Allow text editing

        // Create a StyledDocument to apply styles to the text
        StyledDocument doc = textPane.getStyledDocument();

        // Create styles for different text formats
        SimpleAttributeSet redBold = new SimpleAttributeSet();
        StyleConstants.setBold(redBold, true);
        StyleConstants.setForeground(redBold, Color.RED);

        SimpleAttributeSet blueItalic = new SimpleAttributeSet();
        StyleConstants.setItalic(blueItalic, true);
        StyleConstants.setForeground(blueItalic, Color.BLUE);

        // Insert some styled text into the JTextPane
        try {
            doc.insertString(doc.getLength(), "This is bold and red text.\n", redBold);
            doc.insertString(doc.getLength(), "This is italic and blue text.\n", blueItalic);
            doc.insertString(doc.getLength(), "This is normal text.\n", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        // Create a JScrollPane to add scrolling to the JTextPane
        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Add the scrollPane to the JFrame
        frame.add(scrollPane);

        // Set the background color of the frame
        frame.getContentPane().setBackground(Color.WHITE);

        // Make the frame visible
        frame.setVisible(true);
    }
}

