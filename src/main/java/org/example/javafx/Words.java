package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Words extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Words.class.getResource("words.fxml"));
        Scene sceneWords = new Scene(fxmlLoader.load(), 350, 200);
        stage.setTitle("Words");
        stage.setScene(sceneWords);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}