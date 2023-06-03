package com.example.apworkshop11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Timer;

public class CalculatorController {

    @FXML
    private TextField resultTextField;

    private double result;

    @FXML
    private void number1ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "1");
    }

    @FXML
    private void number2ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "2");
    }

    @FXML
    private void number3ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "3");
    }

    @FXML
    private void number4ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "4");
    }

    @FXML
    private void number5ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "5");
    }

    @FXML
    private void number6ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "6");
    }

    @FXML
    private void number7ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "7");
    }

    @FXML
    private void number8ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "8");
    }

    @FXML
    private void number9ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "9");
    }

    @FXML
    private void number0ButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + "0");
    }

    @FXML
    private void acButtonPressed(ActionEvent event) {
        resultTextField.setText("");
    }

    @FXML
    private void pointButtonPressed(ActionEvent event) {
        String text = resultTextField.getText();
        resultTextField.setText(text + ".");
    }

    @FXML
    private void addButtonPressed(ActionEvent event) {
        //TODO WRITE A CALCULATE METHOD
        resultTextField.setText("");
    }

    @FXML
    private void subButtonPressed(ActionEvent event) {
        //TODO WRITE A CALCULATE METHOD
        resultTextField.setText("");
    }

    @FXML
    private void multiplyButtonPressed(ActionEvent event) {
        //TODO WRITE A CALCULATE METHOD
        resultTextField.setText("");
    }

    @FXML
    private void divideButtonPressed(ActionEvent event) {
        //TODO WRITE A CALCULATE METHOD
        resultTextField.setText("");
    }

    @FXML
    private void equalButtonPressed(ActionEvent event) {
        //TODO WRITE A CALCULATE METHOD
        resultTextField.setText(String.valueOf(result));
    }
}