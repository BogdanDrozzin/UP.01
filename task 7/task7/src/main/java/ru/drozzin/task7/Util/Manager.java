package ru.drozzin.task7.Util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.drozzin.task7.HelloApplication;

import java.io.IOException;

public class Manager {
    public static Stage mainStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    public static void showMainStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            stage.setScene((scene));
            stage.setTitle(title);
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setMaximized(true);
            mainStage = stage;
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSecondStage(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene((scene));
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showThirdStage(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene((scene));
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showThourthStage(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene((scene));
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showFithStage(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene((scene));
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSixStage(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene((scene));
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}