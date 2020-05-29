/*
Write a program that draws the picture of a house.

Step 1: Create the java program with "filename.java ".
Step 2: Create the html program with "filename.html".
Step 3: Compile the java program "javac filename.java".
Step 4: View applet using "appletviewer filename.html".

Note: Both program must have the same name and Both program must be in same folder.

*/

import java.awt.*;
import java.applet.*;

public class Question28 extends Applet {
    public void paint (Graphics g) {
        background(g);
        house (g);
        roof1 (g);
        roof2 (g);
        windows (g);
        framing (g);
        extras (g);
        text (g);
    }

    public void background(Graphics g) {
        setBackground (new Color(65, 105, 225));
        g.setColor (new Color (225, 225, 225));
        g.fillOval (15, 35, 170, 55);
        g.fillOval (20, 20, 160, 50);
        g.fillOval (350, 50, 170, 55);
        g.fillOval (355, 35, 160, 50);   
        g.setColor (new Color(225, 140, 0)); 
        g.fillOval (650, 035, 120, 120);
    }

    public void house (Graphics g) {
        g.setColor (new Color(139, 69, 19));   
        g.fillRect (100, 250, 400, 200);
        g.fillRect (499, 320, 200, 130);
        g.setColor(new Color(190, 190, 190));     
        g.fillRect (160, 150, 60, 90);
        g.fillRect (245, 380, 110, 70);
        g.fillRect (508, 350, 180, 100);
        g.setColor (new Color(186, 134, 11)); 
        g.fillOval (282, 412, 10, 10);
        g.fillOval (307, 412, 10, 10);
    }

    public void roof1 (Graphics g) {
        g.setColor(new Color(190, 190, 190)); 
        int x[] = {98, 300, 501};
        int y[] = {250, 130, 250};
        g.fillPolygon(x, y, 3);
    }

    public void roof2 (Graphics g) {
        g.setColor (new Color(190, 190, 190));
        int x[] = {499, 499, 700};
        int y[] = {320, 249, 320};
        g.fillPolygon(x, y, 3);
    }

    public void windows (Graphics g) {
        g.setColor (new Color(186, 134, 11)); 
        g.fillOval (521, 350, 68, 31);
        g.fillOval (606, 350, 68, 31);
        g.fillRect (121, 261, 78, 78);
        g.fillRect (121, 361, 78, 78);
        g.fillRect (401, 261, 78, 78);
        g.fillRect (401, 361, 78, 78);
        g.fillOval (241, 261, 118, 78);   
        g.setColor (new Color(175, 238, 238));
        g.fillRect (125, 265, 70, 70);
        g.fillRect (125, 365, 70, 70);
        g.fillRect (405, 265, 70, 70);
        g.fillRect (405, 365, 70, 70);
        g.fillOval (245, 265, 110, 70);
        g.fillOval (525, 353, 60, 25);
        g.fillOval (610, 353, 60, 25);
    }

    public void framing (Graphics g) {
        g.setColor (new Color(139, 69, 19));   
        g.fillRect (298, 380, 2, 70);
        g.fillRect (508, 382, 180, 2);
        g.fillRect (508, 417, 180, 2);
        g.setColor (new Color(186, 134, 11)); 
        g.fillRect (157, 265, 5, 70);
        g.fillRect (157, 365, 5, 70);
        g.fillRect (437, 265, 5, 70);
        g.fillRect (438, 365, 5, 70);
        g.fillRect (297, 265, 5, 70);
        g.fillRect (125, 298, 70, 5);
        g.fillRect (125, 398, 70, 5);
        g.fillRect (405, 298, 70, 5);
        g.fillRect (405, 398, 70, 5);
        g.fillRect (245, 298, 110, 5);
        g.fillRect (245, 375, 110, 5); 
        g.fillRect (240, 375, 5, 75);
        g.fillRect (352, 375, 5, 75);
        g.fillRect (508, 345, 180, 5);
        g.fillRect (503, 345, 5, 105);
        g.fillRect (688, 345, 5, 105);
    }

    public void extras (Graphics g) {
        g.setColor (new Color(210, 180, 140)); 
        g.fillOval (160, 105, 35, 45);
        g.fillOval (170, 95, 35, 45);
        g.fillOval (160, 85, 35, 45);
        g.fillOval (170, 35, 35, 45);
        g.fillOval (160, 25, 35, 45);
        g.fillOval (170, 15, 35, 45);
        g.setColor (new Color(105, 105, 105)); 
        g.fillRect (508, 450, 180, 150);
        g.fillRect (245, 450, 107, 50);
        g.fillRect (274, 500, 50, 40);
        g.fillRect (274, 520, 250, 45);
        }

    public void text (Graphics g) {   
        g.setColor(new Color(225, 0, 0));             
        g.drawString("House portrait by: Kamal", 390, 70);
    }
}
