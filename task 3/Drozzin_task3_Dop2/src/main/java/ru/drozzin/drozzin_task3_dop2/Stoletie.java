package ru.drozzin.drozzin_task3_dop2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Stoletie {

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
        int god = Integer.parseInt(vvod.getText());
        if (god > 0) {
            int stoletie = ((int) ((god - 1) / 100)) + 1;
            vivod.setText(String.valueOf(stoletie));
        }
        else
            vivod.setText("Ошибка, год является отрицательным");
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'Stoletie.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'Stoletie.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'Stoletie.fxml'.";
    }

}
