package ru.drozzin.task7.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static ru.drozzin.task7.Util.Manager.showThourthStage;

public class ThirdPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField EmailTF;

    @FXML
    private TextField PASSWORDtF;

    @FXML
    private TextField doublEPW;

    static String email, pass1, pass2;

    @FXML
    void REGISTRATION(ActionEvent event) {
        email = EmailTF.getText();
        pass1 = PASSWORDtF.getText();
        pass2 = doublEPW.getText();
        if (pass1.equals(pass2)){
            showThourthStage("FourthPage.fxml", "Marathon Skills 2016 - Register as a runner");
        }
        else {
            doublEPW.setText("Ошибка! Пароли не совпадают");
        }
    }

    @FXML
    void initialize() {
        assert EmailTF != null : "fx:id=\"EmailTF\" was not injected: check your FXML file 'ThirdPage.fxml'.";
        assert PASSWORDtF != null : "fx:id=\"PASSWORDtF\" was not injected: check your FXML file 'ThirdPage.fxml'.";
        assert doublEPW != null : "fx:id=\"doublEPW\" was not injected: check your FXML file 'ThirdPage.fxml'.";

    }

}
