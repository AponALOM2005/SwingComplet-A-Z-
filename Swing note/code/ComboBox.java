import javax.swing.*; // Import Swing components
import java.awt.event.*; // Import event handling

public class ComboBox {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(400, 200); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a JLabel for instructions
        JLabel label = new JLabel("Select your favorite programming language:");
        label.setBounds(50, 20, 300, 20); // Set position and size of the label

        // Create a JComboBox (drop-down menu)
        String[] languages = {"Java", "Python", "C++", "JavaScript", "Ruby"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(50, 50, 200, 30); // Set position and size of the combo box

        // Add an ActionListener to handle selection events
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item
                String selectedLanguage = (String) comboBox.getSelectedItem();
                System.out.println("You selected: " + selectedLanguage);
            }
        });

        // Add the components to the frame
        frame.add(label);
        frame.add(comboBox);
        frame.setLayout(null); // Set layout manager to null
        frame.setVisible(true); // Make the frame visible
    }
}
