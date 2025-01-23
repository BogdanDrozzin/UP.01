package ru.drozzin.drozzin_task45;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task45 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button;

    @FXML
    private Label vivod;

    @FXML
    private TextField vvodX;

    @FXML
    private TextField vvodY;

    @FXML
    void Button(ActionEvent event) {
        double x = Double.parseDouble(vvodX.getText());
        double y = Double.parseDouble(vvodY.getText());
        if (x > 50 || y > 25 || x < -50 || y < -25){
            vivod.setText("Нет");
        }
        else if (x < 50 && y < 25 && x > -50 && y > -25){
            vivod.setText("Да");
        }
        else {
            vivod.setText("На границе");
        }
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'task45.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'task45.fxml'.";
        assert vvodX != null : "fx:id=\"vvodX\" was not injected: check your FXML file 'task45.fxml'.";
        assert vvodY != null : "fx:id=\"vvodY\" was not injected: check your FXML file 'task45.fxml'.";

    }

}
