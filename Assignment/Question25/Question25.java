/*
Write applets to draw the following shapes:
    a). Cone
    b).Cylinder
    c). Square inside a circle
    d). Circle inside square


Step 1: Create the java program with "filename.java ".
Step 2: Create the html program with "filename.html".
Step 3: Compile the java program "javac filename.java".
Step 4: View applet using "appletviewer filename.html".

Note: Both program must have the same name and Both program must be in same folder.

*/

import java.awt.*;
import java.applet.*;

public class Question25 extends Applet {
    public void paint(Graphics g) {
        /*Cylinder*/
        g.drawString("(b).Cylinder",10,110);
        g.drawOval(10,10,50,10);
        g.drawOval(10,80,50,10);
        g.drawLine(10,15,10,85);
        g.drawLine(60,15,60,85);

        /*Squar Inside A Circle*/
        g.drawString("(c).Squar Inside A Circle",150,110);
        g.drawOval(180,10,80,80);
        g.drawRect(192,22,55,55);

        /*Circle Inside a Squar*/
        g.drawString("(d).Circle Inside a Squar",290,110);
        g.drawRect(290,10,80,80);
        g.drawOval(290,10,80,80);

        g.drawOval(80,280,320,100);
        g.drawLine(240,50,82,320);
        g.drawLine(240,50,398,320);
        g.drawLine(240,330,398,330);
        g.drawLine(240,50,240,330);
        g.drawString("Radius",260,360);
        g.drawString("Height",246,255);
        g.drawString("Slant Height",340,210);
        g.drawString("Cone",220,420);
    }
}
