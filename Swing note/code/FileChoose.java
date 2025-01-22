import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChoose {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("File Chooser Example");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextArea for text editing
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Create a JScrollPane to make the JTextArea scrollable
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Create a JMenuBar with Open and Save options
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");

        // Add action listeners for the open and save menu items
        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Open File");

                // Filter for text files
                fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                        String line;
                        textArea.setText(""); // Clear previous text
                        while ((line = reader.readLine()) != null) {
                            textArea.append(line + "\n");
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error opening file", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save File");

                // Filter for text files
                fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

                int result = fileChooser.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                        writer.write(textArea.getText());
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // Add menu items to the file menu, and the menu bar to the frame
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // Add the scroll pane containing the text area to the frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set the frame background color
        frame.getContentPane().setBackground(Color.WHITE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
