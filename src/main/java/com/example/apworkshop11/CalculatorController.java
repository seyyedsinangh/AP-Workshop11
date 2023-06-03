package com.example.apworkshop11;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField resultTextField;

    private String textField = "";

    @FXML
    private void numberButtonPressed(ActionEvent event) {
        textField += ((Button)event.getSource()).getText();
        resultTextField.setText(textField);
    }

    @FXML
    private void clearButtonPressed(ActionEvent event) {
        textField = "";
        resultTextField.setText("");
    }

    @FXML
    private void operatorButtonPressed(ActionEvent event) {
        textField += " " + ((Button)event.getSource()).getText() + " ";
        resultTextField.setText(textField);
    }

    @FXML
    private void equalButtonPressed(ActionEvent event) {
        double result = MathParser.parse(textField);
        textField = String.valueOf(result);
        resultTextField.setText(textField);
    }
}