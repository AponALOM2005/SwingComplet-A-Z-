import javax.swing.*;
import java.awt.*;

public class ToolsName {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("List with Tooltips");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a list of items
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        
        // Create a JList with the items
        JList<String> list = new JList<>(items);
        
        // Set a custom ListCellRenderer to add tooltips
        list.setCellRenderer((list1, value, index, isSelected, cellHasFocus) -> {
            JLabel label = new JLabel(value);
            // Set tooltip for each item
            label.setToolTipText("This is " + value);
            return label;
        });

        // Create a JScrollPane to hold the list
        JScrollPane scrollPane = new JScrollPane(list);

        // Add the scroll pane to the frame
        frame.add(scrollPane);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
