import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingApp {

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    // Setup the application's window
                    JFrame frame = new JFrame("Swing Text Editor");
                    frame.setName("a");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    // Setup the content pane
                    JPanel contentPane = new JPanel();
                    contentPane.setLayout(new BorderLayout());
                    frame.setContentPane(contentPane);

                    // Add a button to the content pane
                    final JButton button = new JButton("Click here");
                    contentPane.add(button, BorderLayout.CENTER);

                    button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            button.setText("Clicked");
                        }
                    });

                    // Display the window
                    frame.pack();
                    frame.setSize(640, 480);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            });
        }
    }
