package ru.drozzin.task7.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.drozzin.task7.Util.Manager.showMainStage;
import static ru.drozzin.task7.Util.Manager.showSecondStage;

public class SixPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button NazadButton;

    @FXML
    private Button Okbutton;

    @FXML
    void Nazad(ActionEvent event) {
        showSecondStage("SecondPage.fxml", "Marathon Skills 2016");
    }

    @FXML
    void OkButton(ActionEvent stage) {
        showSecondStage("SecondPage.fxml", "Marathon Skills 2016");
    }

    @FXML
    void initialize() {
        assert NazadButton != null : "fx:id=\"NazadButton\" was not injected: check your FXML file 'SixPage.fxml'.";
        assert Okbutton != null : "fx:id=\"Okbutton\" was not injected: check your FXML file 'SixPage.fxml'.";

    }

}
