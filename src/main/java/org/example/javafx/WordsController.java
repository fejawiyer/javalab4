package org.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static javafx.scene.control.ButtonBar.setButtonUniformSize;

public class WordsController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private TextField textField1, textField2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setButtonUniformSize(button, false);
        button.setMinHeight(50);
        button.setMinWidth(50);
    }

    public void reverse() {
        var tmp = textField1.getText();
        textField1.setText(textField2.getText());
        textField2.setText(tmp);
        if (Objects.equals(button.getText(), "->")) {
            button.setText("<-");
        }
        else {
            button.setText("->");
        }
    }

}