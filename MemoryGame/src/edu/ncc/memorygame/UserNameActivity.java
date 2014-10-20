package edu.ncc.memorygame;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class UserNameActivity  extends Activity  implements View.OnClickListener{
	
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_name);
		btn = (Button)findViewById(R.id.done);
		btn.setOnClickListener(this);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}
	
	public void onClick(View v) {
		if(v.getId() == R.id.done)
		{
			String userName = ((EditText)findViewById(R.id.userName)).getText().toString();
			Intent mainIntent = new Intent(this, MainActivity.class);
			Bundle b = new Bundle();
			b.putString("name", userName);
			mainIntent.putExtras(b);
			startActivity(mainIntent);
		}
		
		
	
	}
	
	
}

