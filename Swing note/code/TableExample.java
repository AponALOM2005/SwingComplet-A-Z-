import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JTable Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define column names
        String[] columnNames = {"Name", "Age", "Gender"};

        // Define data for the table (rows)
        Object[][] data = {
            {"John", 25, "Male"},
            {"Sarah", 30, "Female"},
            {"Apon", 22, "Male"},
            {"Janika", 24, "Female"}
        };

        // Create a DefaultTableModel to hold data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable with the model
        JTable table = new JTable(model);

        // Add the table to a JScrollPane (for scrolling capability)
        JScrollPane scrollPane = new JScrollPane(table);

        // Set table settings (e.g., column width, cell selection)
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setPreferredScrollableViewportSize(new Dimension(400, 200));

        // Add the JScrollPane to the frame
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
