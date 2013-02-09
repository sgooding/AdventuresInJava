package com.example.hf;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{

	JButton button;
	MyPanel panel;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();

	}

	public void go() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		button = new JButton("Click Me");
		panel = new MyPanel();
		
		button.addActionListener(this);
		
		
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		button.setText("I've been clicked");
	}

}
