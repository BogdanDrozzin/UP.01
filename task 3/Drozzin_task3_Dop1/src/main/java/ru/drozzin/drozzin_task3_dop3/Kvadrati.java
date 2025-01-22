package ru.drozzin.drozzin_task3_dop3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class Kvadrati {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField A;

    @FXML
    private TextField B;

    @FXML
    private Button Button;

    @FXML
    private TextField C;

    @FXML
    private Label sv_mest;

    @FXML
    private Label vivod;

    @FXML
    void Button(ActionEvent event) {
        float a = Float.parseFloat(A.getText());
        float b = Float.parseFloat(B.getText());
        float c = Float.parseFloat(C.getText());
        int kolvo_kvadratov = (int) (a * b / pow(c, 2));
        double sv_mst = a * b - pow(c, 2) * kolvo_kvadratov;
        vivod.setText(String.valueOf(kolvo_kvadratov));
        sv_mest.setText(String.valueOf(sv_mst));
    }

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'Kolichestvo_kvadratov.fxml'.";
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'Kolichestvo_kvadratov.fxml'.";
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'Kolichestvo_kvadratov.fxml'.";
        assert C != null : "fx:id=\"C\" was not injected: check your FXML file 'Kolichestvo_kvadratov.fxml'.";
        assert sv_mest != null : "fx:id=\"sv_mest\" was not injected: check your FXML file 'Kolichestvo_kvadratov.fxml'.";
        assert vivod != null : "fx:id=\"vivod\" was not injected: check your FXML file 'Kolichestvo_kvadratov.fxml'.";

    }

}
