package org.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static javafx.scene.control.ButtonBar.setButtonUniformSize;

public class CalculatorController implements Initializable {



    private String equation = "";
    private String equationDisplay = "";
    private String number1 = "";
    private String operator = "";
    private double resultDouble = 0.0;
    private boolean clearFlag = false;

    @FXML
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonInverse, buttonComa, buttonCE, buttonC, buttonClear, buttonDivision, buttonMultiply, buttonMinus,
            buttonPlus, buttonEq;
    @FXML
    private TextField equationField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Button[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
        buttonInverse, buttonComa, buttonCE, buttonC, buttonClear, buttonDivision, buttonMultiply, buttonMinus,
        buttonPlus, buttonEq};
        for (Button button : buttons) {
            setButtonUniformSize(button, false);
            button.setMinWidth(40);
            button.setMinHeight(40);
        }
    }
    private void updateFields() {
        equationField.setText(equationDisplay);
        if (clearFlag)
        {
            clearFlag = false;
            equationDisplay = equation;
        }
        equationField.setText(equationDisplay);
    }

    public void numberClicked(MouseEvent mouseEvent) {
        Button buttonClicked = (Button) mouseEvent.getSource();
        String buttonText = buttonClicked.getText();
        equation += buttonText;
        equationDisplay += buttonText;
        updateFields();
    }

    public void clearClicked() {
        equation = "";
        equationDisplay = "";
        number1 = "";
        updateFields();
    }
    public void undoClicked() {
        if (clearFlag || equation.isEmpty()) {
            return;
        }
        equation = equation.substring(0, equation.length() - 1);
        equationDisplay = equationDisplay.substring(0, equationDisplay.length() - 1);
        updateFields();
    }

    public void inverseClicked() {
        if (clearFlag || !number1.isEmpty() || equation.isEmpty()) {
            return;
        }
        if(equation.charAt(0) == '-') {
            equation = equation.substring(1);
            equationDisplay = equationDisplay.substring(1);
        }
        else {
            equation = '-' + equation;
            equationDisplay = '-' + equationDisplay;
        }
        updateFields();
    }

    public void operatorClicked(MouseEvent mouseEvent) {
        if (!number1.isEmpty() || clearFlag || equation.isEmpty())
        {
            return;
        }
        Button buttonClicked = (Button) mouseEvent.getSource();
        String buttonText = buttonClicked.getText();
        operator = buttonText;
        equationDisplay += buttonText;
        number1 = equation;
        equation = "";
        updateFields();
    }

    public void eqClicked() {
        if (!Objects.equals(number1, "")  && !equation.isEmpty()) {
            if (Objects.equals(operator, "/")) {
                resultDouble = Double.parseDouble(number1) / Double.parseDouble(equation);
            }
            if (Objects.equals(operator, "+")) {
                resultDouble = Double.parseDouble(number1) + Double.parseDouble(equation);
            }
            if (Objects.equals(operator, "-")){
                resultDouble = Double.parseDouble(number1) - Double.parseDouble(equation);
            }
            if (Objects.equals(operator, "X")) {
                resultDouble = Double.parseDouble(number1) * Double.parseDouble(equation);
            }
            equationDisplay += "=";
            equation = "";
            equationDisplay += String.valueOf(resultDouble);
            updateFields();
            resultDouble = 0.0;
            number1 = "";
            clearFlag = true;
        }
    }

    public void comaClicked(MouseEvent mouseEvent) {
        if (Objects.equals(number1, "") && !clearFlag) {
            Button buttonClicked = (Button) mouseEvent.getSource();
            String buttonText = buttonClicked.getText();
            equation += buttonText;
            equationDisplay += buttonText;
            updateFields();
        }
    }
}