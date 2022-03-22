package com.applet;
import java.applet.Applet;
import java.awt.Button;
public class Applet1 extends Applet
{
     Button b;
     public void init()
     {
    	 b=new Button("Submit");
    	 add(b);
     }
}
