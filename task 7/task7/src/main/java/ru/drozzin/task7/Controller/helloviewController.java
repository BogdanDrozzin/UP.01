package ru.drozzin.task7.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class helloviewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button begun;

    @FXML
    void Begun(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert begun != null : "fx:id=\"begun\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
