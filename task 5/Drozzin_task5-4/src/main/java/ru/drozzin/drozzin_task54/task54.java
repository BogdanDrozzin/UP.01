package ru.drozzin.drozzin_task54;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task54 {

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
        int N = Integer.parseInt(vvod.getText());
        if (N > 0){
            int k = N/3;
            vivod.setText(String.valueOf(k));
        }
        else {
            vivod.setText("Введите корректное значение");
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'task54.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task54.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'task54.fxml'.";

    }

}
