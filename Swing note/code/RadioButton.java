import javax.swing.*; // Import Swing components
import java.awt.event.*; // Import event handling

public class RadioButton{
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Radio Button Example");
        frame.setSize(400, 300); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a JLabel for instructions
        JLabel label = new JLabel("Select your favorite color:");
        label.setBounds(50, 20, 200, 20); // Set position and size of the label

        // Create JRadioButtons (radio buttons)
        JRadioButton redButton = new JRadioButton("Red");
        redButton.setBounds(50, 50, 100, 20);

        JRadioButton blueButton = new JRadioButton("Blue");
        blueButton.setBounds(50, 80, 100, 20);

        JRadioButton greenButton = new JRadioButton("Green");
        greenButton.setBounds(50, 110, 100, 20);

        // Group the radio buttons so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(blueButton);
        group.add(greenButton);

        // Add ActionListeners to handle radio button selection
        redButton.addActionListener(e -> System.out.println("You selected: Red"));
        blueButton.addActionListener(e -> System.out.println("You selected: Blue"));
        greenButton.addActionListener(e -> System.out.println("You selected: Green"));

        // Add components to the frame
        frame.add(label);
        frame.add(redButton);
        frame.add(blueButton);
        frame.add(greenButton);
        frame.setLayout(null); // Set layout manager to null
        frame.setVisible(true); // Make the frame visible
    }
}
