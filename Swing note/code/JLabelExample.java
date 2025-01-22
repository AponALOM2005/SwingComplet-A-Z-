import javax.swing.*;
import java.awt.*;

public class JLabelExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JLabel Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with text
        JLabel label = new JLabel("FUCK YOU");
        
        // Set label properties (optional)
        label.setFont(new Font("Arial", Font.BOLD, 16));  // Set font
        label.setForeground(Color.BLUE);  // Set text color
        label.setHorizontalAlignment(SwingConstants.CENTER);  // Center align the text

        // Add the JLabel to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
