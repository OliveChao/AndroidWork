package com.example.newthing;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Bundle;

public class SpinnerPage extends ActionBarActivity implements OnItemSelectedListener {
	//declaration
	Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinner);
	  
	        //Spinner element
	        spinner1=(Spinner) findViewById(R.id.spinner1);
	        
	        //Spinner on click
	        spinner1.setOnItemSelectedListener(this);
	        
	        //This are my spinner drop down elements
	        List<String> list = new ArrayList<String>();
	        list.add("Kenya");
	        list.add("Uganda");
	        list.add("Tanzania");
	        list.add("Somalia");
	        list.add("Sudan");
	        list.add("Nigeria");
	        list.add("Algeria");
	        list.add("Brazil");
	        list.add("Germany");
	        list.add("Argentina");
	        list.add("Ethiopia");
	        
	        //design
	        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
	        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	       
	        //attaching data adapter to spinners
	        spinner1.setAdapter(dataAdapter);
	       
	       
	    }
	    @Override
	    public void onItemSelected(AdapterView<?> parent, View view, int position,
	            long id) {
	    //on selecting a spinner item
	        String item = parent.getItemAtPosition(position).toString();
	        Toast.makeText(this, "country : "+ String.valueOf(spinner1.getSelectedItem()), Toast.LENGTH_LONG).show();
	         
	       
	    }
	    @Override
	    public void onNothingSelected(AdapterView<?> parent) {
	   
	       
	    }
		
	}

