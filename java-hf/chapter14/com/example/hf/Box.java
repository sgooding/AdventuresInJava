package com.example.hf;

import java.io.*;

/**
 * A simple box to be serialized.
 */
public class Box implements Serializable {
	/**
	 * Just a simple box with serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The width in any unit.
	 */
	private int width;
	
	/**
	 * The height in any unit.
	 */
	private int height;

	/** 
	 * transient example keeps out any variables
	 */
	transient int ignoreme;

	/**
	 * Get's the current width.
	 * @return width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Get's the current height.
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Set's the width
	 * @param w
	 */
	public void setWidth(int w) {
		width = w;
	}

	/**
	 * Set's the height.
	 * @param h
	 */
	public void setHeight(int h) {
		height = h;
	}
}
