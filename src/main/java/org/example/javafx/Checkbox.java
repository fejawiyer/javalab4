package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Checkbox extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Checkbox.class.getResource("checkbox.fxml"));
        Scene checkboxScene = new Scene(fxmlLoader.load(), 350, 200);
        stage.setTitle("Checkbox");
        stage.setScene(checkboxScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}