package com.test.fuck;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class FuckActivity extends Activity {
	private static final String TAG = "Fuck";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuck);
    }
    
    public void button1_Click(View view){
    	int m,d,y,password;
    	EditText txtMM=(EditText) findViewById(R.id.MM);
    	EditText txtDD=(EditText) findViewById(R.id.DD);
    	EditText txtYY=(EditText) findViewById(R.id.YY);
    	EditText txtPass=(EditText) findViewById(R.id.password);
    	
    	m = Integer.valueOf(txtMM.getText().toString());
    	d = Integer.valueOf(txtDD.getText().toString());
    	y = Integer.valueOf(txtYY.getText().toString());
    	
    	password = (m+28)*(d+19)*(y+10)*m*d;
    	
    	txtPass.setText(String.valueOf(password));
    }


    
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fuck, menu);
        return true;
    }
    
}
