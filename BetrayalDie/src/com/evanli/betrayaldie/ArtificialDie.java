/*
 * This file is part of BetrayalDie.

    BetrayalDie is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    BetrayalDie is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with BetrayalDie.  If not, see <http://www.gnu.org/licenses/>.
 */

/*  Created by Evan Li on 3/27/14.
 *  Copyright (c) 2014 Evan Li. All rights reserved.
 */

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
