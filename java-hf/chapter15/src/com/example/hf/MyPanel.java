package com.example.hf;

import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Just a check
	 */
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillRect(20,50,100,100);
	}

}
