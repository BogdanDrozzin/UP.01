package ru.drozzin.drozzin_task42;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class usl {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button;

    @FXML
    private Label vivod;

    @FXML
    private TextField vvodA;

    @FXML
    private TextField vvodB;

    @FXML
    void Button(ActionEvent event) {
        int a = Integer.parseInt(vvodA.getText());
        int b = Integer.parseInt(vvodB.getText());
        if (a != b) {
            int c = a;
            a = a + b;
            b = b + c;
            vivod.setText("a =" + a + " b =" + b);
        } else {
            a = 0;
            b = 0;
            vivod.setText("a =" + a + " b =" + b);
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'usl.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'usl.fxml'.";
        assert vvodA != null : "fx:id=\"vvodA\" was not injected: check your FXML file 'usl.fxml'.";
        assert vvodB != null : "fx:id=\"vvodB\" was not injected: check your FXML file 'usl.fxml'.";

    }

}
