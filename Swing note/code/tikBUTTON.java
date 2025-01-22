import javax.swing.*; // Import Swing components
import java.awt.event.*; // Import event handling

public class tikBUTTON{
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Checkbox Example");
        frame.setSize(400, 200); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a JCheckBox (checkbox)
        JCheckBox checkbox = new JCheckBox("I agree to the terms and conditions");
        checkbox.setBounds(50, 50, 300, 30); // Set position and size of the checkbox

        // Add an ItemListener to handle checkbox state changes
        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox selected!");
                } else {
                    System.out.println("Checkbox deselected!");
                }
            }
        });

        // Add the checkbox to the frame
        frame.add(checkbox);
        frame.setLayout(null); // Set layout manager to null
        frame.setVisible(true); // Make the frame visible
    }
}
