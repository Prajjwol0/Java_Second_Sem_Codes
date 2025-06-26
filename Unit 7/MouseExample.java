
/* 4. Create a Java Swing application with a JButton. Use a MouseListener to detect when the mouse
enters and exits the button, changing its text to "Mouse Entered" and "Mouse Exited" respectively.
 */

import javax.swing.*;
import java.awt.event.*;

public class MouseExample {
    public static void main(String[] args) {
        // Create a window (JFrame)
        JFrame frame = new JFrame("Mouse Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Hover me");

        // Add a mouse listener to detect enter and exit
        button.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent e) {
                button.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                button.setText("Mouse Exited");
            }

            // We must include these, even if we don’t use them
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
        });

        // Add the button to the window
        frame.add(button);

        // Show the window
        frame.setVisible(true);
    }
}

