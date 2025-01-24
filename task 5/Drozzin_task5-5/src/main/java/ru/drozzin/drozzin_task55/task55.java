package ru.drozzin.drozzin_task55;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task55 {

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
        int N = Integer.parseInt(vvod.getText());
        int k = 0;
        int f = 0;
        while (f < N){
            k++;
            f = f + k;
        }
        vivod.setText(f + " " + k);
    }

    @FXML
    void initialize() {
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task55.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'task55.fxml'.";

    }

}
