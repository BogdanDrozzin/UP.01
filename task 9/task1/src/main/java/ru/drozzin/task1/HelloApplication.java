package ru.drozzin.task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static java.lang.Float.parseFloat;
import static java.lang.Math.*;
import static java.lang.Math.cos;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        primaryStage.setTitle("Практическая работа 1");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene createScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcbutton = new Button("Найти среднее геометрическое");
        Label resultLabel = new Label();
        calcbutton.setOnAction(www -> {
            try {
                double a = Double.parseDouble(sideAField.getText());
                double b = Double.parseDouble(sideBField.getText());
                if (a > 0 && b > 0) {
                    double s = Math.sqrt(a * b);
                    resultLabel.setText("среднее геометрическое: " + s);
                } else {
                    resultLabel.setText("Ошибка, одно из чисел отрицательное");
                }
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a ="), sideAField, new Label("b ="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcbutton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene createScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField sideX1Field = new TextField();
        TextField sideX2Field = new TextField();
        TextField sideX3Field = new TextField();
        TextField sideY1Field = new TextField();
        TextField sideY2Field = new TextField();
        TextField sideY3Field = new TextField();
        Button calcbutton = new Button("Найти площадь и периметр");
        Label resultLabel = new Label();
        Label resultLabel1 = new Label();
        calcbutton.setOnAction(www->{
            float x1 = parseFloat(sideX1Field.getText());
            float x2 = parseFloat(sideX2Field.getText());
            float x3 = parseFloat(sideX3Field.getText());
            float y1 = parseFloat(sideY1Field.getText());
            float y2 = parseFloat(sideY2Field.getText());
            float y3 = parseFloat(sideY3Field.getText());

            float a = (float) sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
            float b = (float) sqrt(pow(x3 - x2, 2) + pow(y3 - y2, 2));
            float c = (float) sqrt(pow(x3 - x1, 2) + pow(y3 - y1, 2));

            float p = (a + b + c) / 2;
            float P = p * 2;
            float S = (float) sqrt(p * (p - a) * (p - b) * (p - c));

            resultLabel.setText("Площадь: " + S);
            resultLabel1.setText("Периметр: " + P);
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x1 ="), sideX1Field, new Label("x2 ="), sideX2Field);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("x3 ="), sideX3Field, new Label("y1 ="), sideY1Field);
        root3.setAlignment(Pos.CENTER);
        HBox root4 = new HBox(10, new Label("y2 ="), sideY2Field, new Label("y3 ="), sideY3Field);
        root4.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, root4, calcbutton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField sideAField = new TextField();
        Button calcbutton = new Button("Найти градусы");
        Label resultLabel = new Label();
        calcbutton.setOnAction(www->{
            float a;
            a = parseFloat(sideAField.getText());
            resultLabel.setText("Количество градусов= " + (a * 3.14));
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a ="), sideAField);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, resultLabel);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1,root3, calcbutton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
    private Scene createScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
        TextField aa = new TextField();
        TextField bb = new TextField();
        Button calcbutton = new Button("Найти D");
        Label resultLabel = new Label();
        calcbutton.setOnAction(www->{
            float L = (float) (1 + 24.86 * pow(10, -2));
            float a = Float.parseFloat(aa.getText());
            float b = Float.parseFloat(bb.getText());
            float D = (float) ((L + sin(a * b)) / (2 + cos(pow(a, 2))) + b - pow(10, b));
            resultLabel.setText(String.valueOf(D));
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("L ="), aa, new Label("I ="), bb);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, resultLabel);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1,root3, calcbutton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
}