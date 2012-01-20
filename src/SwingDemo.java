/**
 * Created by IntelliJ IDEA.
 * User: mcreardon
 * Date: 20/01/12
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */

import javax.swing.*;

public class SwingDemo {
    
    SwingDemo() { 
    // 1st Create the JFrame container.
    JFrame jfrm = new JFrame("A very Simple Swing Program");
        
    // Initial size 
    jfrm.setSize(274, 100);
    
    // set default on close
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // create a text based label
    JLabel jlab = new JLabel(" Swing is the new GUI");


        
    // Add the label to the content pane
    jfrm.setVisible(true);
    
    }
    
    public static void main(String args[]) {

    // Create the frame on the dispatching thread.
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new SwingDemo();
        }
    });

    }
}
