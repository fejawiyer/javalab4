package org.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;


public class OrderController implements Initializable {


    private double orderSum = 0;
    private int firstPosition = 0;
    private int secondPosition = 0;
    private int thirdPosition = 0;
    @FXML
    private Label labelFirstPosQuantity, labelSecondPosQuantity, labelThirdPosQuantity, labelTotal;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelTotal.setVisible(false);
    }
    private void labelsUpdate() {
        labelFirstPosQuantity.setText(firstPosition + " шт.");
        labelSecondPosQuantity.setText(secondPosition + " шт.");
        labelThirdPosQuantity.setText(thirdPosition + " шт.");
        if (orderSum != 0){
            labelTotal.setText("Итого:" + orderSum + " р.");
            labelTotal.setVisible(true);
        }
    }

    public void firstPosInc(){
        firstPosition++;
        labelsUpdate();
    }
    public void secondPosInc(){
        secondPosition++;
        labelsUpdate();

    }
    public void thirdPosInc(){
        thirdPosition++;
        labelsUpdate();

    }
    public void firstPosDec(){
        if (firstPosition == 0) {
            return;
        }
        firstPosition--;
        labelsUpdate();

    }
    public void secondPosDec(){
        if (secondPosition == 0) {
            return;
        }
        secondPosition--;
        labelsUpdate();

    }
    public void thirdPosDec(){
        if (thirdPosition == 0) {
            return;
        }
        thirdPosition--;
        labelsUpdate();

    }
    public void makeOrder() {
        orderSum = firstPosition*129+secondPosition*99+thirdPosition*99;
        labelsUpdate();

    }

}
