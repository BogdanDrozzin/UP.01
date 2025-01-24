package ru.drozzin.drozzin_task52;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task52 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label vivod;

    @FXML
    private TextField vvod;

    @FXML
    void Button(ActionEvent event) {
        int vozrast = Integer.parseInt(vvod.getText());
        int desyatki = vozrast / 10;
        int edinici = vozrast % 10;
        String d = "Введите корректное число";
        String ed = "";
        if (vozrast > 20 && vozrast < 69) {
            switch (desyatki) {
                case (2):
                    d = "двадцать ";
                    break;
                case (3):
                    d = "тридцать ";
                    break;
                case (4):
                    d = "сорок ";
                    break;
                case (5):
                    d = "пятьдесят ";
                    break;
                case (6):
                    d = "шестьдесят ";
                    break;
            }
            switch (edinici) {
                case (0):
                    ed = "лет";
                    break;

                case (1):
                    ed = "один год";
                    break;
                case (2):
                    ed = "два года";
                    break;
                case (3):
                    ed = "три года";
                    break;
                case (4):
                    ed = "четыре года";
                    break;
                case (5):
                    ed = "пять лет";
                    break;
                case (6):
                    ed = "шесть лет";
                    break;
                case (7):
                    ed = "семь лет";
                    break;
                case (8):
                    ed = "восемь лет";
                    break;
                case (9):
                    ed = "девять лет";
                    break;
            }
            vivod.setText(d + ed);
        } else {
            vivod.setText(String.valueOf(d));
        }

    }


    @FXML
    void initialize() {
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task52.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'task52.fxml'.";

    }

}
