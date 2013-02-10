package com.example.scratch;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.JTextField;

public class Scratch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scratch pad = new Scratch();
		pad.go();

	}
	
	/**
	 * A general button.
	 */
	JButton button;
	
	/**
	 * A general frame.
	 */
	JFrame frame;
	
	/**
	 * Number of items.
	 */
	private int nItems = 2;
	private String filetext;
	
	/**
	 * Starts the application.
	 */
	private void go(){
		frame =  new JFrame();
		button = new JButton("Hello World");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addButtons();
			}
			
		});
		frame.add(button);
		frame.setLayout( new GridLayout(2,0));
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem new_item = new JMenuItem("New");
		new_item.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addButtons();
			}
			
		});
		
		JMenuItem open_file = new JMenuItem("Open File...");
		open_file.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int returnVal = chooser.showOpenDialog(frame);
				if( returnVal == JFileChooser.APPROVE_OPTION){
					try {
						String filename= chooser.getSelectedFile().getAbsolutePath();
						filetext = new Scanner(new File(filename)).useDelimiter("\\A").next();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					
				}
			}
			
		});
		
		JMenuItem close_file = new JMenuItem("Close");
		close_file.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
			
		});
		
		menu.add(new_item);
		menu.add(open_file);
		menu.add(close_file);
		menubar.add(menu);
		frame.setJMenuBar(menubar);
		
	}
	
	private void addButtons()
	{
		switch(nItems){
			case 2: frame.add(new JScrollPane(new JTextArea(filetext)));break;
		}
		button.setText(" Items :"+nItems++);
		frame.setVisible(true);	
	}

}
