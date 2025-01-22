package ru.drozzin.drozzin_task32;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class tysacha {

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
        if (number > 999) {
            int sotnya = (int) (number / 100) % 10 * 100;
            vivod.setText(String.valueOf(sotnya));
        }
        else
            vivod.setText("Ошибка, введённое число меньше 1000");
    }

    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'tysacha.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'tysacha.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'tysacha.fxml'.";

    }

}
