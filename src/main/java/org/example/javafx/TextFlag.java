package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TextFlag extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calculator.class.getResource("textflag.fxml"));
        Scene sceneTextflag = new Scene(fxmlLoader.load(), 400, 350);
        stage.setTitle("Textflag");
        stage.setScene(sceneTextflag);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}