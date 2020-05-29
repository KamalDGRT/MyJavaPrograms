/*
Write a java Applet program to plot the face:
*/

import java.applet.*; 
import java.awt.*; 

public class Question27 extends Applet { 
    public void paint(Graphics g) 
    { 

        // Oval for face outline 
        g.drawOval(80, 70, 150, 150); 

        // Ovals for eyes 
        // with black color filled 
        g.setColor(Color.BLACK); 
        g.fillOval(120, 120, 15, 15); 
        g.fillOval(170, 120, 15, 15); 

        // Arc for the smile 
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}
