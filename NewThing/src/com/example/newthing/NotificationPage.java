package com.example.newthing;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Bundle;

public class NotificationPage extends ActionBarActivity implements OnClickListener {
	
	//Declaring variables
		Button btnNotification;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);

		//Initializing variables
		btnNotification = (Button)findViewById(R.id.btnNotice);

		//Setting click listener
		btnNotification.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// switch case
		switch (v.getId()) {
		case R.id.btnNotice:
			break;

		default:
			break;
		}
		
	}

}
