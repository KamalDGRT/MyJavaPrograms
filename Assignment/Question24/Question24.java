/*
Develop an applet that receives three numeric values as input from the user and then
displays the largest of the three on the screen. Write a HTML pages and test the applet.

Step 1: Create the java program with "filename.java ".
Step 2: Create the html program with "filename.html".
Step 3: Compile the java program "javac filename.java".
Step 4: View applet using "appletviewer filename.html".

Note: Both program must have the same name and Both program must be in same folder.
*/

import java.awt.*;
import java.applet.*;

public class Question24 extends Applet
{
    TextField T1, T2, T3;

    public void init(){
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);

        add(T1);
        add(T2);
        add(T3);

        T1.setText("0");
        T2.setText("0");
        T3.setText("0");
    }

    public void paint(Graphics g){
        int a, b, c,result;
        String str;
        g.drawString("Enter value to Check the Maximum of 3 ", 10, 50);

        str = T1.getText();
        a = Integer.parseInt(str);
        str = T2.getText();
        b = Integer.parseInt(str);
        str = T3.getText();
        c = Integer.parseInt(str);

        g.setColor(Color.blue);
        if (a > b && a > c) 
            result = a;
        else if (b > c)
            result = b;
        else 
            result = c;
        
        g.drawString("Maximnum of 3 No is " + result, 10, 70);
        showStatus("MAXIMUM OF 3 NUMBERS");
    }

    public boolean action(Event e, Object o){
        repaint();
        return true;
    }
}
