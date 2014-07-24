package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;


public class HomeScreen extends ActionBarActivity implements OnClickListener {
	
	//Declaring variables
	EditText etNumberOne , etNumberTwo;
	Button btnAdd , btnSubtract , btnDivide , btnMultiply;
	String strAnswer, strNumberOne, strNumberTwo;
	TextView tvResult;
	double NumberOne;
	double NumberTwo;
	double Result;
	
	/*The opp class method.
	 *Opp the channel
	 *Operations the class
	 **/
	  Operations Ops;

	//This is the main method
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		
		//Initializing variables
		etNumberOne = (EditText)findViewById(R.id.etHomeNumberOne);
		etNumberTwo = (EditText)findViewById(R.id.etHomeNumberTwo);
		
		tvResult = (TextView)findViewById(R.id.tvResult);
		
		btnAdd = (Button)findViewById(R.id.btnHomeAdd);
		btnSubtract = (Button)findViewById(R.id.btnHomeSubtract);
		btnDivide = (Button)findViewById(R.id.btnHomeDivide);
		btnMultiply = (Button)findViewById(R.id.btnHomeMultiply);
		

		//Setting click listener
		btnAdd.setOnClickListener(this);
		btnSubtract.setOnClickListener(this);
		btnDivide.setOnClickListener(this);
		btnMultiply.setOnClickListener(this);
		
		
		//Converting string to double
		//EditText carries a string whereas we are working with doubles
		NumberOne = Double.parseDouble(etNumberOne.getText().toString());
		NumberTwo = Double.parseDouble(etNumberTwo.getText().toString());
		
		//Object Oriented Programming
		Ops = new Operations();
		
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnHomeAdd:
			//calling the method by its method name
			//Answer will be a double
			Result = Operations.addition(NumberOne , NumberTwo);
			
			//Converting the double to string
			//The result takes in a string value
			strAnswer = String.valueOf(Result);
			
			//Displaying the result
			tvResult.setText( "The result is " + strAnswer);
			break;
			
		case R.id.btnHomeSubtract:
			Result = Operations.subtraction(NumberOne, NumberTwo);
			strAnswer = String.valueOf(Result);
			tvResult.setText( "The result is" + strAnswer);
			
			break;
			
		case R.id.btnHomeDivide:
			Result = Operations.subtraction(NumberOne, NumberTwo);
			strAnswer = String.valueOf(Result);
			tvResult.setText( "The result is" + strAnswer);
			
			break;
			
		case R.id.btnHomeMultiply:
			Result = Operations.subtraction(NumberOne, NumberTwo);
			strAnswer = String.valueOf(Result);
			tvResult.setText( "The result is" + strAnswer);
			
		default:
			break;
		}
		
	}

}
