
/* 4. Create a Java Swing application with a JButton. Use a MouseListener to detect when the mouse
enters and exits the button, changing its text to "Mouse Entered" and "Mouse Exited" respectively.
 */
// Class
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample {
   public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("MouseListener Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute positioning for simplicity

        // Create a JButton
        JButton button = new JButton("Hover me");
        button.setBounds(90, 70, 120, 40); // x, y, width, height

        // Add MouseListener to the button
        button.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent e) {
                button.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                button.setText("Mouse Exited");
            }

            public void mouseClicked(MouseEvent e) {
                // Not used
            }

            public void mousePressed(MouseEvent e) {
                // Not used
            }

            public void mouseReleased(MouseEvent e) {
                // Not used
            }
        });

        // Add button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
