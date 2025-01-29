package ru.drozzin.task7.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.drozzin.task7.Util.Manager.showSixStage;

public class FivePageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void CancelOnAction(ActionEvent event) {

    }

    @FXML
    void RegOnAction(ActionEvent event) {
        showSixStage("SixPage.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void initialize() {
    }

}
