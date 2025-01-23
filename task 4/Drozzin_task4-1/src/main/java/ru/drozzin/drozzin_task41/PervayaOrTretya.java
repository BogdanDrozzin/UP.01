package ru.drozzin.drozzin_task41;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PervayaOrTretya {

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
        int first = number / 100;
        int three = number % 10;
        if (first > three){
            vivod.setText("Первое число больше третьего");
        }
        else
            vivod.setText("Третье число больше первого");
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'PervayaOrTretya.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'PervayaOrTretya.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'PervayaOrTretya.fxml'.";

    }

}
