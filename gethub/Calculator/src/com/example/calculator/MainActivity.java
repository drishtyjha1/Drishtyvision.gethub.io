package com.example.calculator;

import android.os.Bundle;

import java.util.ArrayList;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv;
	EditText t1,t2;
	Button b1,b2,b3,b4,b5;
private int[] numbericButton={R.id.button6,R.id.button7,R.id.button8};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		tv=(TextView)findViewById(R.id.textView2);
		t1=(EditText)findViewById(R.id.editText1);
		t2=(EditText)findViewById(R.id.editText2);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		
		  
		b1.setOnClickListener (new click());
		b2.setOnClickListener(new click1());
		b3.setOnClickListener(new click2());
		b4.setOnClickListener(new click3());
		b5.setOnClickListener(new click4());
		
	}
	 class click implements OnClickListener
		{

			@Override
			public void onClick(View v) {
				int a1=Integer.parseInt(t1.getText().toString());
				int a2=Integer.parseInt(t2.getText().toString());
				int ans= a1+a2;
				tv.setText(String.valueOf(ans));
			}

		
		}
	 class click1 implements OnClickListener
		{

			@Override
			public void onClick(View v) {
				int a1=Integer.parseInt(t1.getText().toString());
				int a2=Integer.parseInt(t2.getText().toString());
				int ans= a1-a2;
				tv.setText(String.valueOf(ans));
			}

		
		}
	 class click2 implements OnClickListener
		{

			@Override
			public void onClick(View v) {
				int a1=Integer.parseInt(t1.getText().toString());
				int a2=Integer.parseInt(t2.getText().toString());
				int ans= a1*a2;
				tv.setText(String.valueOf(ans));
			}

		
		}
	 class click3 implements OnClickListener
		{

			@Override
			public void onClick(View v) {
				int a1=Integer.parseInt(t1.getText().toString());
				int a2=Integer.parseInt(t2.getText().toString());
				int ans= a1/a2;
				tv.setText(String.valueOf(ans));
			}

		
		}
	 class click4 implements OnClickListener
		{

			@Override
			public void onClick(View v) {
				int a1=Integer.parseInt(t1.getText().toString());
				int a2=Integer.parseInt(t2.getText().toString());
				int ans= a1%a2;
				tv.setText(String.valueOf(ans));
			}

				}
			
		}
	 
	


