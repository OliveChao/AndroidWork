package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	
	//Declaring variables
	EditText etFirstName , etIdNumber , etEmail , etPassword;
	Button btnSubmit , btnCancel;
	
	String strFirstName , strEmail , strPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		//Initializing variables
		etFirstName = (EditText)findViewById(R.id.etRegisterFirstName);
		etIdNumber = (EditText)findViewById(R.id.etRegisterIdNumber);
		etEmail = (EditText)findViewById(R.id.etRegisterEmail);
		etPassword = (EditText)findViewById(R.id.etRegisterPassword);
		
		btnSubmit = (Button)findViewById(R.id.btnRegisterSubmit);
		btnSubmit.setOnClickListener(this);
		btnCancel = (Button)findViewById(R.id.btnRegisterCancel);
		btnCancel.setOnClickListener(this);
		
		//Getting data from editText
		strFirstName = etFirstName.getText().toString();

		
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnRegisterSubmit:
			startActivity(new Intent(getApplicationContext(),LoginScreen.class));
			Toast.makeText(getApplicationContext(), strFirstName, Toast.LENGTH_SHORT).show();
			
			break;
			
		case R.id.btnRegisterCancel:
			startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			
			break;

		default:
			break;
		}
		
	}

}
