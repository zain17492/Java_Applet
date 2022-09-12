package com.tnsif.Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;

public class Applet2 extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	
	
	public void init() {
		add(l1= new Label("Num 1"));
		add(t1 = new TextField(5));
		add(l2 = new Label("Num 2"));
		add(t2 =new TextField(5));
		add(l3 =new Label("="));
		add(t3 = new TextField(5));
		add(b1=new Button("Addition"));
		add(b2= new Button("Subtract"));
		add(b3= new Button("Multiply"));
		add(b4 = new Button("Divide"));
		
		
	}
	public boolean action(Event e, Object o) {
		int x=Integer.parseInt(t1.getText());
		int y=Integer.parseInt(t2.getText());
		int sum=x+y;
		int sub=x-y;
		int mul=x*y;
		float div= (float)x/(float)y;
		if(e.target.equals(b1))
			t3.setText(String.valueOf(sum));
		if(e.target.equals(b2))
			t3.setText(String.valueOf(sub));
		if(e.target.equals(b3))
			t3.setText(String.valueOf(mul));
		if(e.target.equals(b4))
			t3.setText(String.valueOf(div));
		
		
		
		return false;
		
		
	}
	
	  

}
         