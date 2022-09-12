package com.tnsif.Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class LeapYear extends Applet  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField t1,t2;
	Button b1;
	//int year =2000;
    //boolean leap = false;
	public void init() {
		
		add(t1=new TextField(10));
		add(b1=new Button("Answer"));
		add(t2=new TextField(15));
	}
	
	public boolean action(Event e,Object o) {	
		String str=t1.getText();
		Integer num=Integer.valueOf(str);
		//String res;
			if(e.target.equals(b1)) {
			     if(num%4==0)
			        t2.setText("Is Leap Year");
			      else
			       t2.setText("Is Not Leap Year");
		}
			return false;
	}
}
	
		