package com.example.newthing;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class AddPage extends ActionBarActivity implements OnClickListener {
	
	public static double addition(double NumOne,double NumTwo){
	    double Result = NumOne + NumTwo;
	
	   return Result;
    } 
	//Declaring variables
			EditText etNumOne , etNumTwo;
			Button btnAdd , btnBack;
			String strAnswer, strNumOne, strNumTwo;
			TextView tvResult;
			double NumOne;
			double NumTwo;
			double Result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);
		
		        //Initializing variables
				etNumOne = (EditText)findViewById(R.id.etAddNumOne);
				etNumTwo = (EditText)findViewById(R.id.etAddNumTwo);
				
				tvResult = (TextView)findViewById(R.id.tvAddResult);
				
				btnAdd = (Button)findViewById(R.id.btnAdd);
				btnBack = (Button)findViewById(R.id.btnAddBack);

				//Setting click listener
				btnAdd.setOnClickListener(this);
				btnBack.setOnClickListener(this);
				
				//Converting string to double
				NumOne = Double.parseDouble(etNumOne.getText().toString());
				NumTwo = Double.parseDouble(etNumTwo.getText().toString());

		
	}

	@Override
	public void onClick(View v) {
		// switch case
				switch (v.getId()) {
				case R.id.btnAdd:
					//calling the method by its method name
					//Answer will be a double
					Result = addition(NumOne , NumTwo);
					
					//Converting the double to string
					//The result takes in a string value
					strAnswer = String.valueOf(Result);
					
					//Displaying the result
					tvResult.setText( "The result is " + strAnswer);
					break;
					
				case R.id.btnAddBack:
					startActivity(new Intent(getApplicationContext(),MainPage.class));
					
				default:
					break;
				}
		
	}

}
