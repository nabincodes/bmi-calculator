package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField weight;
    public TextField height;
    public Button calculateBMI;

    public Label bmiResult;
    public TextArea bmiCondition;

    public void calculateBMI(){
        double w, h, bmi;
        String result;

        w = Double.parseDouble(weight.getText());
        h = Double.parseDouble(height.getText());
        bmi = Math.round(w/(h*h) * 100.0)/100.0;

        bmiResult.setText(Double.toString(bmi));

        if(bmi<18.5){
            result = "Your are Under Weight. Please consider increasing your diet.";
        }
        else if (bmi>18.5 && bmi < 25.0){
            result = "You are Normal. Please maintain your health.";
        }
        else{
            result = "You are Over Weight. Consider working on weight loss.";
        }
        bmiCondition.setWrapText(true);
        bmiCondition.setText(result);
    }



}
