package org.example.drozzin_task2;

import java.net.URL;
import java.util.ResourceBundle;
import static java.lang.Math.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Srednee_Geometricheskoe {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button;

    @FXML
    private Label Result;

    @FXML
    private Label aLB;

    @FXML
    private TextField aTF;

    @FXML
    private Label bLB;

    @FXML
    private TextField bTF;

    @FXML
    void Button(ActionEvent event) {
        float a = Float.parseFloat(aTF.getText().toString());
        float b = Float.parseFloat(bTF.getText().toString());
        Result.setText("Среднее геометрическое=" + (sqrt(a * b)));
    }


    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'Geometriya.fxml'.";
        assert Result != null : "fx:id=\"Result\" was not injected: check your FXML file 'Geometriya.fxml'.";
        assert aLB != null : "fx:id=\"aLB\" was not injected: check your FXML file 'Geometriya.fxml'.";
        assert aTF != null : "fx:id=\"aTF\" was not injected: check your FXML file 'Geometriya.fxml'.";
        assert bLB != null : "fx:id=\"bLB\" was not injected: check your FXML file 'Geometriya.fxml'.";
        assert bTF != null : "fx:id=\"bTF\" was not injected: check your FXML file 'Geometriya.fxml'.";

    }

}