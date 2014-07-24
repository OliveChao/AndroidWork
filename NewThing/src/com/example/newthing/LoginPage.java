package com.example.newthing;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class LoginPage extends ActionBarActivity implements OnClickListener {
	
	//Declaring variables
		EditText etUserName , etPassword;
		Button btnToast , btnBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		//Initializing variables
				etUserName = (EditText)findViewById(R.id.etLoginUser);
				etPassword = (EditText)findViewById(R.id.etLoginPassword);
				
				btnToast = (Button)findViewById(R.id.btnLoginToast);
				btnToast.setOnClickListener(this);
				btnBack = (Button)findViewById(R.id.btnLoginBack);
				btnBack.setOnClickListener(this);

				
			}

			@Override
			public void onClick(View v) {
				// Switch case statement
				switch (v.getId()) {
				case R.id.btnLoginToast:
					startActivity(new Intent(getApplicationContext(),MainPage.class));
					
					break;
					
				case R.id.btnLoginBack:
					startActivity(new Intent(getApplicationContext(),MainPage.class));
					
					break;
					
				default:
					break;
				}
	}

}
