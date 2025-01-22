import javax.swing.*; // Import Swing components
import java.awt.event.*; // Import event handling

public class LIST {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JList Example");
        frame.setSize(400, 300); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a JLabel for instructions
        JLabel label = new JLabel("Select a fruit from the list:");
        label.setBounds(50, 20, 200, 20); // Set position and size of the label

        // Create a JList with a list of items
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango", "Orange"};
        JList<String> fruitList = new JList<>(fruits);
        fruitList.setBounds(50, 50, 100, 100); // Set position and size of the list

        // Add a ListSelectionListener to handle item selection
        fruitList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { // Avoid duplicate events
                String selectedFruit = fruitList.getSelectedValue();
                System.out.println("You selected: " + selectedFruit);
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(fruitList);
        frame.setLayout(null); // Set layout manager to null
        frame.setVisible(true); // Make the frame visible
    }
}
