package com.example.newthing;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class CounterPage extends ActionBarActivity implements OnClickListener {
	//Declaring variables
	EditText etEnterNo;
	Button btnIncreament , btnDecreament;
	String strEnterNo;
	TextView tvResult;
	int EnterNo;
	double Result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counter);

		//Initializing variables
				etEnterNo = (EditText)findViewById(R.id.etCounterNo);
				
				tvResult = (TextView)findViewById(R.id.tvCounterResult);
				
				btnIncreament = (Button)findViewById(R.id.btnCounterIncrease);
				btnDecreament = (Button)findViewById(R.id.btnCounterDecrease);

				//Setting click listener
				btnIncreament.setOnClickListener(this);
				btnDecreament.setOnClickListener(this);
				
				//Converting string to double
				EnterNo = Integer.parseInt(etEnterNo.getText().toString());
				
	}

	@Override
	public void onClick(View v) {
		// if statement
		
		
	}		

	}


