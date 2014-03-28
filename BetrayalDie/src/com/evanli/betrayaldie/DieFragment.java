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

import java.util.ArrayList;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DieFragment extends Fragment {

	private int bgColor;

	private int dieCount;

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	
	private Button die1;
	private Button die2;
	private Button die3;
	private Button die4;
	private Button die5;
	private Button die6;
	private Button die7;
	private Button die8;
	
	private ArrayList<Button> diceButtonArray;
	private ArrayList<ArtificialDie> dieArray;
	
	private Button rollButton;

	private LinearLayout dieContainer;
	
	private int rollValue;
	
	private TextView lastTextView1;
	private TextView lastTextView2;
	private TextView lastTextView3;
	private TextView lastTextView4;
	private TextView lastTextView5;
	
	public DieFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);

		bgColor = Color.parseColor("#ff4444");

		button1 = (Button) rootView.findViewById(R.id.button1);

		button1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button1, 1);
			}
		});

		button2 = (Button) rootView.findViewById(R.id.button2);

		button2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button2, 2);
			}
		});

		button3 = (Button) rootView.findViewById(R.id.button3);

		button3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button3, 3);
			}
		});

		button4 = (Button) rootView.findViewById(R.id.button4);

		button4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button4, 4);
			}
		});

		button5 = (Button) rootView.findViewById(R.id.button5);

		button5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button5, 5);
			}
		});

		button6 = (Button) rootView.findViewById(R.id.button6);

		button6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button6, 6);
			}
		});

		button7 = (Button) rootView.findViewById(R.id.button7);

		button7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button7, 7);
			}
		});

		button8 = (Button) rootView.findViewById(R.id.button8);

		button8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				selectButton(button8, 8);
			}
		});
		
		die1 = (Button) rootView.findViewById(R.id.die1);
		die1.setVisibility(View.GONE);
		die1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die1,1);
			}
		});
		
		die2 = (Button) rootView.findViewById(R.id.die2);
		die2.setVisibility(View.GONE);
		die2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die2,2);
			}
		});
		
		die3 = (Button) rootView.findViewById(R.id.die3);
		die3.setVisibility(View.GONE);
		die3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die3,3);
			}
		});
		
		die4 = (Button) rootView.findViewById(R.id.die4);
		die4.setVisibility(View.GONE);
		die4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die4,4);
			}
		});
		
		die5 = (Button) rootView.findViewById(R.id.die5);
		die5.setVisibility(View.GONE);
		die5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die5,5);
			}
		});
		
		die6 = (Button) rootView.findViewById(R.id.die6);
		die6.setVisibility(View.GONE);
		die6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die6,6);
			}
		});
		
		die7 = (Button) rootView.findViewById(R.id.die7);
		die7.setVisibility(View.GONE);
		die7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die7,7);
			}
		});
		
		die8 = (Button) rootView.findViewById(R.id.die8);
		die8.setVisibility(View.GONE);
		die8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				reroll(die8,8);
			}
		});
		
		diceButtonArray = new ArrayList<Button>();
		diceButtonArray.add(die1);
		diceButtonArray.add(die2);
		diceButtonArray.add(die3);
		diceButtonArray.add(die4);
		diceButtonArray.add(die5);
		diceButtonArray.add(die6);
		diceButtonArray.add(die7);
		diceButtonArray.add(die8);
		
		
		rollButton = (Button) rootView.findViewById(R.id.rollButton);
		rollButton.setBackgroundResource(R.drawable.center_die_initial);
		rollButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (dieCount == 0) {
					Toast toast = Toast.makeText(DieFragment.this.getActivity(), "Please select the number of dice to roll.", Toast.LENGTH_LONG);
					toast.show();
				} else {
					rollButton.setBackgroundResource(R.drawable.dice);
					roll();
				}
			}
		});
		
		dieArray = new ArrayList<ArtificialDie>();
		
		lastTextView1 = (TextView) rootView.findViewById(R.id.lastTextView1);
		lastTextView2 = (TextView) rootView.findViewById(R.id.lastTextView2);
		lastTextView3 = (TextView) rootView.findViewById(R.id.lastTextView3);
		lastTextView4 = (TextView) rootView.findViewById(R.id.lastTextView4);
		lastTextView5 = (TextView) rootView.findViewById(R.id.lastTextView5);
		
		return rootView;
	}

	private void pushToPreviousStack(String s) {
		
		lastTextView5.setText(lastTextView4.getText());
		lastTextView4.setText(lastTextView3.getText());
		lastTextView3.setText(lastTextView2.getText());
		lastTextView2.setText(lastTextView1.getText());
		lastTextView1.setText(s);
	}
	
	private void unselectAllButtons() {
		button1.setTextColor(Color.WHITE);
		button2.setTextColor(Color.WHITE);
		button3.setTextColor(Color.WHITE);
		button4.setTextColor(Color.WHITE);
		button5.setTextColor(Color.WHITE);
		button6.setTextColor(Color.WHITE);
		button7.setTextColor(Color.WHITE);
		button8.setTextColor(Color.WHITE);

		button1.setSelected(false);
		button2.setSelected(false);
		button3.setSelected(false);
		button4.setSelected(false);
		button5.setSelected(false);
		button6.setSelected(false);
		button7.setSelected(false);
		button8.setSelected(false);
	}

	private void selectButton(Button b, int newDieState) {
		if (b != null) {
			dieCount = newDieState;
			unselectAllButtons();
			b.setTextColor(bgColor);
			b.setSelected(true);
		}
	}
	
	private void reroll(Button b, int position) {
		ArtificialDie die = dieArray.get(position - 1);
		
		int value = die.roll();
		
		Button diceButton = diceButtonArray.get(position - 1);
		diceButton.setText(Integer.toString(value));
		
		rollValue = 0;
		
		for(ArtificialDie d : dieArray) {
			rollValue += d.getValue();
		}
		
		rollButton.setText(Integer.toString(rollValue));
		pushToPreviousStack(Integer.toString(rollValue));
	}
	
	private void roll() {
		dieArray.clear();
		hideAllDice();
		rollValue = 0;
		for(int i = 0; i < dieCount; i++) {
			ArtificialDie die = new ArtificialDie();
			
			dieArray.add(die);
			
			int value = die.roll();
			
			rollValue += value;
			
			Button diceButton = diceButtonArray.get(i);
			diceButton.setText(Integer.toString(value));
			diceButton.setVisibility(View.VISIBLE);
		}
		
		rollButton.setText(Integer.toString(rollValue));
		pushToPreviousStack(Integer.toString(rollValue));
	}
	
	private void hideAllDice() {
		for (Button button : diceButtonArray) {
			button.setVisibility(View.GONE);
		}
	}
}
