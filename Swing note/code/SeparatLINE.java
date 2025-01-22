import javax.swing.*;
import java.awt.*;

public class SeparatLINE{
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JSeparator Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical layout
        
        // Add some components before the separator
        JLabel label1 = new JLabel("First section");
        JButton button1 = new JButton("Button 1");
        
        // Create a separator (horizontal line)
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        
        // Add some components after the separator
        JLabel label2 = new JLabel("Second section");
        JButton button2 = new JButton("Button 2");
        
        // Add components to the panel
        panel.add(label1);
        panel.add(button1);
        panel.add(separator);  // Add the separator
        panel.add(label2);
        panel.add(button2);
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
