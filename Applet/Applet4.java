package com.tnsif.Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public  class Applet4 extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name ="", gender="";
	int age;
	Button b1;
	Label l1,l2,l3;
	TextField t;
	CheckboxGroup g;
	Checkbox m,f;
	Choice c;
	public void init() {
		add(l1 =new Label("Enter Name:"));
		add(t =new TextField(10));
		add(l2 =new Label("Select Gender:"));
		add(m =new Checkbox("Male",g,true));
		add(f =new Checkbox("Female",g, false));
		add(l3 =new Label("Age:"));
		add(c =new Choice());
		c.add("18");
		c.add("19");
		c.add("20");
		c.add("21");
		c.add("22");
		c.add("23");
		c.add("24");
		c.add("25");
		add(b1 =new Button("Submit"));
		b1.addActionListener(this);
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Name:"+name, 20, 100);
		g.drawString("Gender:"+gender, 20, 120);
		g.drawString("Age:"+age, 20, 140);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	 name = t.getText();
	 gender = g.getSelectedCheckbox().getLabel();
	 age = Integer.parseInt(c.getSelectedItem());
	 repaint();
		
	}
}

//<APPLET code="Applet2.class" width=200 height ="150"> </APPLET>
