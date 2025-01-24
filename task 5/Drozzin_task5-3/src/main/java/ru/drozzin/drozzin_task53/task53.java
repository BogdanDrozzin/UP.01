package ru.drozzin.drozzin_task53;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class task53 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button;

    @FXML
    private Label vivodD;

    @FXML
    private Label vivodDl;

    @FXML
    private Label vivodPl;

    @FXML
    private TextField vvodR;

    @FXML
    void Button(ActionEvent event) {
        double r = Double.parseDouble(vvodR.getText());
        double Diametr = 2 * r;
        double L = 2 * PI * r;
        double S = PI * pow(r, 2);
        vivodD.setText(String.valueOf(Diametr));
        vivodDl.setText(String.valueOf(L));
        vivodPl.setText(String.valueOf(S));
    }

    @FXML
    void initialize() {
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'task53.fxml'.";
        assert vivodD != null : "fx:id=\"vivodD\" was not injected: check your FXML file 'task53.fxml'.";
        assert vivodDl != null : "fx:id=\"vivodDl\" was not injected: check your FXML file 'task53.fxml'.";
        assert vivodPl != null : "fx:id=\"vivodPl\" was not injected: check your FXML file 'task53.fxml'.";
        assert vvodR != null : "fx:id=\"vvodR\" was not injected: check your FXML file 'task53.fxml'.";

    }

}
