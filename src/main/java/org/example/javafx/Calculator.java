package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calculator.class.getResource("calculator.fxml"));
        Scene sceneCalculator = new Scene(fxmlLoader.load(), 160, 250);
        stage.setTitle("Calculator");
        stage.setScene(sceneCalculator);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}