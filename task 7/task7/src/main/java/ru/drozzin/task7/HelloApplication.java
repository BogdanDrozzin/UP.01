package ru.drozzin.task7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.drozzin.task7.Util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage, "hello-view.fxml", "Marathon Skills 2016");
    }

    public static void main(String[] args) {
        launch();
    }
}