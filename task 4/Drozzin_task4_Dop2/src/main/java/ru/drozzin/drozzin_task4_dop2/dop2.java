package ru.drozzin.drozzin_task4_dop2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dop2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button;

    @FXML
    private Label vivod;

    @FXML
    private TextField vvod;

    @FXML
    void Button(ActionEvent event) {
        int number = Integer.parseInt(vvod.getText());
        if (number > 0 && number < 1000) {
            if (number > 0 && number < 10 && number % 2 == 0) {
                vivod.setText("Чётное однозначное число");
            } else if (number > 0 && number < 10 && number % 2 == 1) {
                vivod.setText("Нечётное однозначное число");
            } else if (number >= 10 && number < 100 && number % 2 == 0) {
                vivod.setText("Чётное двузначное число");
            } else if (number >= 10 && number < 100 && number % 2 == 1) {
                vivod.setText("Нечётное двузначное число");
            } else if (number > 99 && number < 1000 && number % 2 == 0) {
                vivod.setText("Чётное трёхзначное число");
            } else if (number > 99 && number < 1000 && number % 2 == 1) {
                vivod.setText("Нечётное трёхзначное число");
            }
        }
        else{
            vivod.setText("Ошибка. Введите значение от 1 до 999");
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'dop2.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'dop2.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'dop2.fxml'.";

    }

}