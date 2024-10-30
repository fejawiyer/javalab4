package org.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;


public class TextFlagController implements Initializable {

    private int firstColor = 0;
    private int secondColor = 0;
    private int thirdColor = 0;
    @FXML
    private Label labelFirstColor, labelSecondColor, labelThirdColor;
    @FXML
    private RadioButton button11, button12, button13, button21, button22, button23, button31, button32, button33;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        RadioButton[] buttons1 = {button11, button12, button13};
        RadioButton[] buttons2 = {button21, button22, button23};
        RadioButton[] buttons3 = {button31, button32, button33};
        ToggleGroup colors1 = new ToggleGroup();
        ToggleGroup colors2 = new ToggleGroup();
        ToggleGroup colors3 = new ToggleGroup();
        for (RadioButton radioButton : buttons1) {
            radioButton.setToggleGroup(colors1);
        }
        for (RadioButton radioButton : buttons2) {
            radioButton.setToggleGroup(colors2);
        }
        for (RadioButton radioButton : buttons3) {
            radioButton.setToggleGroup(colors3);
        }
        button11.setOnAction(actionEvent -> firstColor = 1);
        button12.setOnAction(actionEvent -> firstColor = 2);
        button13.setOnAction(actionEvent -> firstColor = 3);
        button21.setOnAction(actionEvent -> secondColor = 1);
        button22.setOnAction(actionEvent -> secondColor = 2);
        button23.setOnAction(actionEvent -> secondColor = 3);
        button31.setOnAction(actionEvent -> thirdColor = 1);
        button32.setOnAction(actionEvent -> thirdColor = 2);
        button33.setOnAction(actionEvent -> thirdColor = 3);


    }
    private void colorUpdate(Label label, int color) {
        if (color == 1) {
            label.setText("Красный");
        }
        if (color == 2) {
            label.setText("Белый");
        }
        if (color == 3) {
            label.setText("Зелёный");
        }
    }

    public void draw() {
        if(firstColor == 0 || secondColor == 0 || thirdColor == 0) {
            return;
        }
        colorUpdate(labelFirstColor, firstColor);
        colorUpdate(labelSecondColor, secondColor);
        colorUpdate(labelThirdColor, thirdColor);
    }


}
