package org.example.drozzin_task21;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.sqrt;

public class RadianController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Btn;

    @FXML
    private TextField aLB;

    @FXML
    private Label aTF;

    @FXML
    private Label grLB;

    @FXML
    void Btn(ActionEvent event) {
        double PI = 3.14;
        float a = Float.parseFloat(aLB.getText().toString());
        double gradus = a * PI;
        grLB.setText("Количество градусов= " + gradus);
    }

    @FXML
    void initialize() {
        assert Btn != null : "fx:id=\"Btn\" was not injected: check your FXML file 'RadianController.fxml'.";
        assert aLB != null : "fx:id=\"aLB\" was not injected: check your FXML file 'RadianController.fxml'.";
        assert aTF != null : "fx:id=\"aTF\" was not injected: check your FXML file 'RadianController.fxml'.";
        assert grLB != null : "fx:id=\"grLB\" was not injected: check your FXML file 'RadianController.fxml'.";

    }

}
