/**
 * Created by IntelliJ IDEA.
 * User: mcreardon
 * Date: 20/01/12
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SwingDemo implements ActionListener{

    JLabel jlab;

    SwingDemo() { 
    // 1st Create the JFrame container.
    JFrame jfrm = new JFrame("A very Simple Swing Program.");
        
    // Add flowlayout
    jfrm.getContentPane().setLayout(new FlowLayout());
        
    // Initial size 
    jfrm.setSize(274, 100);
    
    // set default on close
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    // Add some buttons
    JButton jbtnFirst = new JButton("First");
    JButton jbtnSecond = new JButton("Second");
        
    // Add action listeners
    jbtnFirst.addActionListener(this);
    jbtnSecond.addActionListener(this);
        
      
    // create a text based label
    //JLabel jlab = new JLabel(" Swing is the new GUI");

    // add the label to the content pane
    
    jfrm.getContentPane().add(jbtnFirst);
    jfrm.getContentPane().add(jbtnSecond);

    // create a text based label
    jlab = new JLabel("Press a button");
    jfrm.getContentPane().add(jlab);
        
    // Add the label to the content pane
    jfrm.setVisible(true);
    }
    
    // We need to handle button action events
    public void actionPerformed(ActionEvent ae) {
    if ( ae.getActionCommand().equals("First"))
        jlab.setText("first button was pressed");
    else
        jlab.setText("second button was pressed");
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
