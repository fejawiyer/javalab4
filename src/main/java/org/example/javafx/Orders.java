package org.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Orders extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Checkbox.class.getResource("order.fxml"));
        Scene orderScene = new Scene(fxmlLoader.load(), 250, 350);
        stage.setTitle("Order");
        stage.setScene(orderScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
