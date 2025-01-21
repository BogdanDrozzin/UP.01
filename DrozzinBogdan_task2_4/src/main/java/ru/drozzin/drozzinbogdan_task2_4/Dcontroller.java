package ru.drozzin.drozzinbogdan_task2_4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class Dcontroller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField BTF;

    @FXML
    private Button Button;

    @FXML
    private Label DTF;

    @FXML
    private TextField aTF;

    @FXML
    void initialize(ActionEvent event) {
        float L = (float) (1 + 24.86 * pow(10, -2));
        float a = Float.parseFloat(this.aTF.getText().toString());
        float b = Float.parseFloat(this.BTF.getText().toString());
        float D = (float) ((L + sin(a * b)) / (2 + cos(pow(a, 2))) + b - pow(10, b));
        DTF.setText(String.valueOf(D));

    }

    @FXML
    void initialize() {
        assert BTF != null : "fx:id=\"BTF\" was not injected: check your FXML file 'Dcontroller.fxml'.";
        assert Button != null : "fx:id=\"Button\" was not injected: check your FXML file 'Dcontroller.fxml'.";
        assert DTF != null : "fx:id=\"DTF\" was not injected: check your FXML file 'Dcontroller.fxml'.";
        assert aTF != null : "fx:id=\"aTF\" was not injected: check your FXML file 'Dcontroller.fxml'.";

    }

}
