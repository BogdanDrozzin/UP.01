package ru.drozzin.drozzin_task33;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class denNedeli {

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
        float den = Float.parseFloat(vvod.getText());
        if (den > 0 && den < 366) {
            den = den % 7;
            switch ((int) den) {
                case (1):
                    vivod.setText("Понедельник");
                    break;
                case (2):
                    vivod.setText("Вторник");
                    break;
                case (3):
                    vivod.setText("Среда");
                    break;
                case (4):
                    vivod.setText("Четверг");
                    break;
                case (5):
                    vivod.setText("Пятница");
                    break;
                case (6):
                    vivod.setText("Суббота");
                    break;
                case (0):
                    vivod.setText("Воскресенье");
                    break;
            }
        } else {
            vivod.setText("Ошибка, число превышает количество дней, введите число от 1 до 365");
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'denNedeli.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'denNedeli.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'denNedeli.fxml'.";

    }

}
