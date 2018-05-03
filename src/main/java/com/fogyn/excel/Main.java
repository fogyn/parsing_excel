package com.fogyn.excel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxResourceURL = getClass().getClassLoader().getResource("sample.fxml");
        if (fxResourceURL == null)
            throw new RuntimeException("JAva FX layout file wasn't found");

        Parent root = FXMLLoader.load(fxResourceURL);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 520, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
