package com.example.walkingtour.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import com.example.walkingtour.R;
import com.example.walkingtour.Secondscreen;
import com.example.walkingtour.point;

public class TestPoint extends  android.test.ActivityUnitTestCase<point> {
	
	private point pt;
	private Button b;
	private EditText e;
	
	public TestPoint() {
		super(point.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(),point.class);
		startActivity(intent,null,null);
		pt = getActivity();
	}

	@Test
	public  void testPointScreenNull()	{
		assertNotNull("Screen is null", pt);
	}
	
	public void testAddPicButton()	{
		b = (Button)pt.findViewById(R.id.addpoi);
		assertNotNull("Button is null", b);
	}
	
	public void testAddPoiButton()	{
		b = (Button)pt.findViewById(R.id.takepic);
		assertNotNull("Button is null", b);
	}

	public void testEdit1()	{
		e = (EditText)pt.findViewById(R.id.poiname);
		assertNotNull("EditText 1 is null", e);
	}
	
	public void testEdit2()	{
		e = (EditText)pt.findViewById(R.id.poidescr);
		assertNotNull("EditText 2 is null", e);
	}
	
	public void testEdit1Text()	{
		e = (EditText)pt.findViewById(R.id.poiname);
		e.setText("name");
		assertEquals("EditText 1 text entry is wrong", e.getText().toString(), "name");
	}
	
	public void testEdit2Text()	{
		e = (EditText)pt.findViewById(R.id.poidescr);
		e.setText("Description");
		assertEquals("EditText 2 text entry is wrong", e.getText().toString(), "Description");
	}
}
