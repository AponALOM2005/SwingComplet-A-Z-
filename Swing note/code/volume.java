import javax.swing.*; // Import Swing components
import javax.swing.event.*; // Import event handling for JSlider

public class volume {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Slider Example");
        frame.setSize(400, 300); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a JLabel to display instructions
        JLabel label = new JLabel("Move the slider to select a value:");
        label.setBounds(50, 20, 300, 20); // Set position and size of the label

        // Create a JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50); // min, max, initial value
        slider.setBounds(50, 50, 300, 50); // Set position and size of the slider
        slider.setMajorTickSpacing(20); // Set major tick spacing
        slider.setMinorTickSpacing(5); // Set minor tick spacing
        slider.setPaintTicks(true); // Enable tick marks
        slider.setPaintLabels(true); // Enable labels

        // Add a ChangeListener to handle slider value changes
        slider.addChangeListener(e -> {
            int value = slider.getValue();
            System.out.println("Slider Value: " + value); // Display the current value in the console
        });

        // Add components to the frame
        frame.add(label);
        frame.add(slider);
        frame.setLayout(null); // Set layout manager to null
        frame.setVisible(true); // Make the frame visible
    }
}
