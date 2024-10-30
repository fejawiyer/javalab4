package org.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckboxController implements Initializable {

    @FXML
    private Button button1, button2, button3;

    @FXML
    private CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
    }

    public void CheckBox1() {
        button1.setVisible(checkBox1.isSelected());
    }
    public void CheckBox2() {
        button2.setVisible(checkBox2.isSelected());
    }
    public void CheckBox3() {
        button3.setVisible(checkBox3.isSelected());
    }

}