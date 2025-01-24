package ru.drozzin.drozzin_task56;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task56 {

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
        vivod.setText(findZero(N));
    }

    @FXML
    void initialize() {
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task56.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'task56.fxml'.";

    }

    String findZero(int N){
        String Nstr = String.valueOf(N);
        if (Nstr.indexOf("0") > 0) return "true";
        return "false";
    }
}
