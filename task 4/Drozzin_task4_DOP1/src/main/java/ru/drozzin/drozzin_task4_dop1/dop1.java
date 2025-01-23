package ru.drozzin.drozzin_task4_dop1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dop1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button;

    @FXML
    private TextField chslo;

    @FXML
    private Label vivod;

    @FXML
    void Button(ActionEvent event) {
        int number = Integer.parseInt(chslo.getText());
        if (number > 0 && number % 2 == 0){
            vivod.setText("Положительное чётное");
        } else if (number > 0 && number % 2 == 1) {
            vivod.setText("Положительное нечётное");
        } else if (number < 0 && number % 2 == 0) {
            vivod.setText("Отрицательное чётное");
        }
        else {
            vivod.setText("Отрицательное нечётное");
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'dop1.fxml'.";
        assert chslo != null : "fx:id=\"chslo\" was not injected: check your FXML file 'dop1.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'dop1.fxml'.";

    }

}
