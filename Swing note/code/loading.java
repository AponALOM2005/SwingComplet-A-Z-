import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class loading {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("LOADING...");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JProgressBar with a range from 0 to 100
        JProgressBar progressBar = new JProgressBar(0, 100);
        
        // Set initial progress value
        progressBar.setValue(0);
        progressBar.setStringPainted(true);  // Display progress as text
        progressBar.setForeground(Color.RED);  // Set progress color
        progressBar.setBackground(Color.WHITE);  // Set background color of progress bar

        // Add the progress bar to the frame
        frame.add(progressBar, BorderLayout.CENTER);

        // Create a new thread to simulate a time-consuming task
        Thread progressThread = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(100);  // Simulate time-consuming task
                    progressBar.setValue(i);  // Update progress bar value
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the progress thread
        progressThread.start();

        // Make the frame visible
        frame.setVisible(true);
    }
}
