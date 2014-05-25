package com.test.fuckex;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class FuckExActivity extends Activity implements OnClickListener {
	DatePicker datepicker;
	Button btn;
	EditText password;
	Calendar c;
	ClipboardManager clipboard;
	ClipData clipData;
	int y,m,d,pass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fuck_ex);
		
		c=Calendar.getInstance(); 
		
		
		datepicker=(DatePicker)findViewById(R.id.datePicker);
		btn=(Button)findViewById(R.id.create);
		password=(EditText)findViewById(R.id.password);
		clipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
		
		btn.setOnClickListener(this);
		
		y=datepicker.getYear();
		m=datepicker.getMonth();
		d=datepicker.getDayOfMonth();
		
		pass=(y*m*d+m*m+d*d+y*m+y*d+m*d)*y;
		
		if(pass<10000000) pass*=11;
		
		clipData = ClipData.newPlainText("PASS", String.valueOf(pass));
		clipboard.setPrimaryClip(clipData);
		
		password.setText(String.valueOf(pass));
		

	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		finish();
	}

	public void onClick(View v){
		
		y=datepicker.getYear();
		m=datepicker.getMonth();
		d=datepicker.getDayOfMonth();
		
		pass=(y*m*d+m*m+d*d+y*m+y*d+m*d)*y;
		
		if(pass<10000000) pass*=11;
		
		clipData = ClipData.newPlainText("PASS", String.valueOf(pass));
		clipboard.setPrimaryClip(clipData);
		
		password.setText(String.valueOf(pass));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fuck_ex, menu);
		return true;
	}

}
