package ru.drozzin.drozzin_task31;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Konvert {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button;

    @FXML
    private Label vivod;

    @FXML
    private TextField vvod;

    @FXML
    void button(ActionEvent event) {
        double number = Double.parseDouble(vvod.getText());
        if (number > 99 && number < 1000) {
            double poslednee = (int) (number % 10) * 10;
            double srednee = (int) (number % 100 / 10);
            vivod.setText(String.valueOf(srednee + poslednee));
        }
        else
            vivod.setText("Ошибка, неправильный ввод");
    }

    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'Konvert.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'Konvert.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'Konvert.fxml'.";

    }

}
