import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;

public class FileTREE{
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JTree Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the root node for the tree
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");

        // Create child nodes for the root node
        DefaultMutableTreeNode nodeA = new DefaultMutableTreeNode("Node A");
        DefaultMutableTreeNode nodeB = new DefaultMutableTreeNode("Node B");
        DefaultMutableTreeNode nodeC = new DefaultMutableTreeNode("Node C");

        // Add child nodes to the root node
        rootNode.add(nodeA);
        rootNode.add(nodeB);
        rootNode.add(nodeC);

        // Create leaf nodes under Node A
        nodeA.add(new DefaultMutableTreeNode("Leaf A1"));
        nodeA.add(new DefaultMutableTreeNode("Leaf A2"));

        // Create leaf nodes under Node B
        nodeB.add(new DefaultMutableTreeNode("Leaf B1"));
        
        // Create the JTree using the root node
        JTree tree = new JTree(rootNode);

        // Optionally, expand all nodes for demonstration
        for (int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }

        // Add the JTree to a JScrollPane to make it scrollable
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
