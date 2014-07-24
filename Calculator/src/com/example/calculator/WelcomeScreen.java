package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {
	
	//Declaration of variables
			Button btnLogin;
			Button btnRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
	    //Initializing variables
		btnLogin = (Button)findViewById(R.id.btnWelcomeLogin);
		btnLogin.setOnClickListener(this);
		btnRegister = (Button)findViewById(R.id.btnWelcomeRegister);
		btnRegister.setOnClickListener(this);
		
		//Getting data
		
		
	}

	@Override
	public void onClick(View v) {
		// The switch case
		switch (v.getId()) {
		case R.id.btnWelcomeLogin:
			startActivity(new Intent(getApplicationContext(),LoginScreen.class));
			
			break;
			
		case R.id.btnWelcomeRegister:
			startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
			
			break;

		default:
			break;
		}
		
	}

}
