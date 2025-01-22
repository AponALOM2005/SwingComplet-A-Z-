import javax.swing.*;
import java.awt.*;

public class COLORbackgroundText{
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Name Display Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the background color of the frame to white
        frame.getContentPane().setBackground(Color.WHITE);

        // Create a JLabel to display your name "Apon"
        JLabel nameLabel = new JLabel("Apon", SwingConstants.CENTER);
        
        // Set the font to bold and color to blue
        nameLabel.setFont(new Font("Arial", Font.BOLD, 50)); // Font: Arial, Bold, Size 50
        nameLabel.setForeground(Color.BLUE); // Text color: Blue

        // Set the bounds for the label
        nameLabel.setBounds(150, 150, 200, 50);

        // Set the layout to null for absolute positioning
        frame.setLayout(null);

        // Add the nameLabel to the frame
        frame.add(nameLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
