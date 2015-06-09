package com.example.walkingtour.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import android.content.Intent;
import android.widget.Button;

import com.example.walkingtour.MainActivity;
import com.example.walkingtour.R;
import com.example.walkingtour.point;

public class TestMainScreen extends  android.test.ActivityUnitTestCase<MainActivity> {

	private MainActivity main;
	private Button b;
	
	public TestMainScreen() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(),MainActivity.class);
		startActivity(intent,null,null);
		main = getActivity();
	}

	@Test
	public void testMainScreen()	{
		assertNotNull("Screen is null", main);
	}
	
	public void testButton() {
		b = (Button)main.findViewById(R.id.button1);
		assertNotNull("Button is null", b);
	}

}
