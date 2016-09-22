package edu.ramapo.jkole.FGA.draw;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FXPaint {
	DrawArea drawArea;
	
	ActionListener actionListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
		}
	};
	public void show() {
	    // create main frame
	   
	    Container content;
	    // set layout on content pane
//	    content.setLayout(new BorderLayout());
	    // create draw area
	    drawArea = new DrawArea();
	 
	    // add to content pane
//	    content.add(drawArea, BorderLayout.CENTER);
	 
	    // add to content pane
//	    content.add(controls, BorderLayout.NORTH);
	 
//	    frame.setSize(600, 600);
	    // can close frame
//	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // show the swing paint result
//	    frame.setVisible(true);
	 
	    // Now you can try our S
	}
}
