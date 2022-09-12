package com.tnsif.Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class Applet1 extends Applet {
	
	private static final long serialVersionUID = 1L;
	Button b1,b2;
	TextField t;
	public void init() {
		add(b1 = new Button("       Click     "));
		add(t = new TextField(10));
		add(b2 = new Button("       Close      "));
		
	}
	public boolean action(Event e, Object o) {
		if(e.target.equals(b1))
			t.setText("   Hello   ");
		if(e.target.equals(b2))
			t.setText("");
		return false;
	}

}
