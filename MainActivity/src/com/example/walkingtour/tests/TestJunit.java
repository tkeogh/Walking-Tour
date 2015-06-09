package com.example.walkingtour.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import com.example.walkingtour.R;
import com.example.walkingtour.Secondscreen;
import com.example.walkingtour.map;
import com.example.walkingtour.point;

public class TestJunit extends  android.test.ActivityUnitTestCase<Secondscreen>{

	private Secondscreen tester;
	private Button b;
	private EditText e;
	
	public TestJunit() {
		super(Secondscreen.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(),Secondscreen.class);
		startActivity(intent,null,null);
		tester = getActivity();
	}
	
	public  void testNull()	{
	assertNotNull("Screen is null",tester);
		
	}
	
	public void testButton(){
		b= (Button)tester.findViewById(R.id.buttonmap);
		assertNotNull("Button is null",b);
	}
	
	public void testEdit1()	{
		e = (EditText)tester.findViewById(R.id.editText1);
		assertNotNull("EditText 1 is null", e);
	}
	
	public void testEdit2()	{
		e = (EditText)tester.findViewById(R.id.EditText01);
		assertNotNull("EditText 2  is null", e);
	}
	
	public void testEdit3()	{
		e = (EditText)tester.findViewById(R.id.EditText02);
		assertNotNull("EditText 3 is null", e);
	}
	
	public void testEdit1TextEntry()	{
		e = (EditText)tester.findViewById(R.id.editText1);
		e.setText("Hello");
		assertEquals("Text entry is wrong", e.getText().toString(), "Hello");
	}
	
	public void testEdit2TextEntry()	{
		e = (EditText)tester.findViewById(R.id.EditText01);
		e.setText("jj");
		assertEquals("Text entry is wrong",e.getText().toString(),"jj");
	}
	
	public void testEdit3TextEntry()	{
		e = (EditText)tester.findViewById(R.id.EditText02);
		e.setText("Test");
		assertEquals("Text entry is wrong",e.getText().toString(),"Test");
	}

}
