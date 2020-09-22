/*
Body Mass Index (BMI) is a measure of health on weight. It can be calculated by
taking your weight in kilograms and dividing by the square of your height in meters.
The interpretation of BMI for people 16 years or older is as follows:

BMI Interpretation
Below 16 -> seriously underweight
16–18 -> underweight
18–24 -> normal weight
24–29 -> overweight
29–35 -> seriously overweight
Above 35 -> gravely overweigh



Step 1: Create the java program with "filename.java ".
Step 2: Create the html program with "filename.html".
Step 3: Compile the java program "javac filename.java".
Step 4: View applet using "appletviewer filename.html".

Note: Both program must have the same name and Both program must be in same folder.
*/

import java.awt.*;
import java.applet.*;

public class Bmi extends Applet
{
    TextField height, weight, bmi;
    String comment;
    Label  heightLabel, weightLabel, bmiLabel, outputLabel;

    public void init(){

        weightLabel = new Label("Weight (in kg):");
        weight = new TextField(10);


        heightLabel    = new Label("Height (in meters):");
        height = new TextField(10);

        bmiLabel = new Label("BMI");
        bmi = new TextField(10);

        Button calcButton = new Button("Calculate");
        outputLabel = new Label("Click the Calculate button to see your body mass index.");

        add(heightLabel);
        add(height);
        add(weightLabel);
        add(weight);
        add(bmiLabel);
        add(bmi);
        add(calcButton);
        
        add(outputLabel);

        height.setText("0");
        weight.setText("0");
        bmi.setText("0");
    }

    public void paint(Graphics g){
    Double ht, wt, result;
        String str;
        g.drawString("Calculate your BMI here", 10, 50);

        str = height.getText();
        ht = Double.parseDouble(str);
        str = weight.getText();
        wt = Double.parseDouble(str);

        result = wt / Math.pow(ht,2);
        
        if(result < 16)
            comment = "seriously underweight";
        else if(result >= 16 && result <18)
            comment = "underweight";
        else if(result >= 18 && result <24)
            comment = "normal weight";
        else if(result >= 24 && result <29)
            comment = "overweight";
        else if(result >= 29 && result <35)
            comment = "seriously overweight";
        else if(result >= 35)
            comment = "gravely overweight";
        
        outputLabel.setText("You are " + comment + ".");
    }

    public boolean action(Event e, Object o){
        repaint();
        return true;
    }

}
