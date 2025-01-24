package ru.drozzin.drozzin_task51;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task51 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button;

    @FXML
    private Label vivod;

    @FXML
    private TextField vvod_ish;

    @FXML
    private TextField vvod_napr;

    @FXML
    void Button(ActionEvent event) {
        int ish_napr = Integer.parseInt(vvod_ish.getText());
        int tek_napr = Integer.parseInt(vvod_napr.getText());
        int nast_napr = ish_napr + tek_napr;
        if (nast_napr == 0){
            vivod.setText("Робот продолжает направление");
        } else if (nast_napr == 1) {
            vivod.setText("Робот повернул налево");
        } else {
            vivod.setText("Робот повернул направо");
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'task51.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task51.fxml'.";
        assert vvod_ish != null : "fx:id=\"vvod_ish\" was not injected: check your FXML file 'task51.fxml'.";
        assert vvod_napr != null : "fx:id=\"vvod_napr\" was not injected: check your FXML file 'task51.fxml'.";

    }

}
