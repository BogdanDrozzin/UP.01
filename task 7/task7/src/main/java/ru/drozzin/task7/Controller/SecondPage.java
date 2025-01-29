package ru.drozzin.task7.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.drozzin.task7.Util.Manager.*;

public class SecondPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Autorize;

    @FXML
    private Button Reg;

    @FXML
    void Autorize(ActionEvent event) {
        showThourthStage("FourthPage.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void Regestration(ActionEvent event) {
        showThirdStage("ThirdPage.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void initialize() {
        assert Autorize != null : "fx:id=\"Autorize\" was not injected: check your FXML file 'SecondPage.fxml'.";
        assert Reg != null : "fx:id=\"Reg\" was not injected: check your FXML file 'SecondPage.fxml'.";

    }

}
