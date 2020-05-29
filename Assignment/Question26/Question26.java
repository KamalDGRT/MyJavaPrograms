/*
Write an applet that will display the following on a green background.
Use the following dimension: 
Rectangle: (10, 10, 300, 150), fill color: blue 
Left circle: (10, 10, 150, 150), fill color: yellow
Right circle: (159, 10, 150, 150), fill color: yellow
Text: (110, 90), color: red


Step 1: Create the java program with "filename.java ".
Step 2: Create the html program with "filename.html".
Step 3: Compile the java program "javac filename.java".
Step 4: View applet using "appletviewer filename.html".

*/
import java.awt.*;
import java.applet.*;

public class Question26 extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.GREEN); 

        g.setColor (Color.BLUE);
        g.fillRect(10, 10, 300, 150);

        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 150, 150);

        g.setColor(Color.YELLOW);
        g.fillOval(159, 10, 150, 150);

        g.setColor(Color.RED);
        g.drawString("Leo Valdez is Cool!", 110, 90);
    }
}
