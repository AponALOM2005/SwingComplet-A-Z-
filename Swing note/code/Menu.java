import javax.swing.*; // Import Swing components
import java.awt.event.*; // Import event handling

public class Menu {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(400, 300); // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        // Create a JMenuBar (menu bar)
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu (menu)
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // Create JMenuItems (menu items)
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add ActionListener to the "Exit" menu item
        exitItem.addActionListener(e -> {
            System.out.println("Exiting the application...");
            System.exit(0); // Exit the program
        });

        // Add ActionListener to the "New" menu item
        newItem.addActionListener(e -> System.out.println("New File Created!"));

        // Add ActionListener to the "Open" menu item
        openItem.addActionListener(e -> System.out.println("Opening a File..."));

        // Add menu items to the "File" menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Add the menu bar to the frame
        frame.setJMenuBar(menuBar);
        frame.setLayout(null); // Set layout manager to null
        frame.setVisible(true); // Make the frame visible
    }
}
