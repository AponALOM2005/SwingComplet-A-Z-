import javax.swing.*; // Import Swing components
import java.awt.event.*; // Import event handling

public class button {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Java Button Example");
        frame.setSize(400, 200); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a JButton (button)
        JButton button = new JButton("Click Me");
        button.setBounds(150, 70, 100, 40); // Set position and size of the button

        // Add an ActionListener to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!"); // Print a message in the console
            }
        });

        // Add the button to the frame
        frame.add(button);
        frame.setLayout(null); // Set layout manager to null
        frame.setVisible(true); // Make the frame visible
    }
}
