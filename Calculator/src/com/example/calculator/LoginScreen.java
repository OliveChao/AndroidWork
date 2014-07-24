package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class LoginScreen extends ActionBarActivity implements OnClickListener {
	
	//Declaring variables
	EditText etEmail , etPassword;
	Button btnSubmit , btnCancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		//Initializing variables
		etEmail = (EditText)findViewById(R.id.etLoginEmail);
		etPassword = (EditText)findViewById(R.id.etLoginPassword);
		
		btnSubmit = (Button)findViewById(R.id.btnLoginSubmit);
		btnSubmit.setOnClickListener(this);
		btnCancel = (Button)findViewById(R.id.btnLoginCancel);
		btnCancel.setOnClickListener(this);

		
	}

	@Override
	public void onClick(View v) {
		// Switch case statement
		switch (v.getId()) {
		case R.id.btnLoginSubmit:
			startActivity(new Intent(getApplicationContext(),HomeScreen.class));
			
			break;
			
		case R.id.btnLoginCancel:
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			
			break;
			
		default:
			break;
		}
		
	}

}
