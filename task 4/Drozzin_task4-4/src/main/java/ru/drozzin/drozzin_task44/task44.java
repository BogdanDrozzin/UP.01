package ru.drozzin.drozzin_task44;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;
import static java.lang.Math.exp;

public class task44 {

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
    private TextField vvodX;

    @FXML
    void Button(ActionEvent event) {
        float a = (float) Double.parseDouble(vvodA.getText());
        float x = (float) Double.parseDouble(vvodX.getText());
        float b = (float) Double.parseDouble(vvodB.getText());
        float y;
        if (x > PI) {
            y = (float) (1 - exp(-a * x) * sin((a * x) + b));
        } else if ((-1 * PI) <= x && x <= PI) {
            y = (float) (1 - exp(-a * x) * ((a * x) + b));
        } else {
            y = (float) (1 - (exp(-a * x) + exp(-b * x)));
        }
        vivod.setText(String.valueOf(y));
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'task44.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task44.fxml'.";
        assert vvodA != null : "fx:id=\"vvodA\" was not injected: check your FXML file 'task44.fxml'.";
        assert vvodB != null : "fx:id=\"vvodB\" was not injected: check your FXML file 'task44.fxml'.";
        assert vvodX != null : "fx:id=\"vvodX\" was not injected: check your FXML file 'task44.fxml'.";

    }

}
