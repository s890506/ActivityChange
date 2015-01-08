package com.example.activitychange;

import com.example.activitychange.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Button button = (Button) findViewById(R.id.button02);
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent();
				intent.setClass(SecondActivity.this, MainActivity.class);
				startActivity(intent);
				SecondActivity.this.finish();
			}
		});
	}
}

