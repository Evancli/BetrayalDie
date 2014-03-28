package com.evanli.betrayaldie;

import java.util.Random;

public class ArtificialDie {

	private static Random rand = new Random();
	private int maxValue;
	private int value;
	
	public ArtificialDie() {
		maxValue = 3;
	}
	
	public int roll() {
		value = rand.nextInt(maxValue);
		
		return value;
	}
	
	public void setMaxValue(int v) {
		maxValue = v;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	
	public int getValue() {
		return value;
	}
}
