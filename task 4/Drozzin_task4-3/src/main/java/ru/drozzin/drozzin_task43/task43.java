package ru.drozzin.drozzin_task43;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task43 {

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
    private TextField vvodC;

    @FXML
    void Button(ActionEvent event) {
        double a = Double.parseDouble(vvodA.getText());
        double b = Double.parseDouble(vvodB.getText());
        double c = Double.parseDouble(vvodC.getText());
        if (a > b && b > c || a < b && b < c){
            a = a * 2;
            b = b * 2;
            c = c * 2;
            vivod.setText("A= " + a + " B=" + b + " C=" + c);
        }
        else{
            vivod.setText("A= " + (a * -1) + " B= " + (b * -1) + " C= " + (c * -1));
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'task43.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task43.fxml'.";
        assert vvodA != null : "fx:id=\"vvodA\" was not injected: check your FXML file 'task43.fxml'.";
        assert vvodB != null : "fx:id=\"vvodB\" was not injected: check your FXML file 'task43.fxml'.";
        assert vvodC != null : "fx:id=\"vvodC\" was not injected: check your FXML file 'task43.fxml'.";

    }

}
