package ru.drozzin.task7.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.drozzin.task7.Util.Manager.showSecondStage;

public class FirstPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Begun;

    @FXML
    private Button cancel;

    @FXML
    private Button vhod;

    @FXML
    private Button vihod;

    @FXML
    void begun(ActionEvent event) {
        showSecondStage("SecondPage.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void initialize() {
        assert Begun != null : "fx:id=\"Begun\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert cancel != null : "fx:id=\"cancel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vhod != null : "fx:id=\"vhod\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vihod != null : "fx:id=\"vihod\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
