package ru.drozzin.task7.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static ru.drozzin.task7.Controller.ThirdPageController.email;
import static ru.drozzin.task7.Controller.ThirdPageController.pass1;
import static ru.drozzin.task7.Controller.ThirdPageController.pass2;
import static ru.drozzin.task7.Util.Manager.showFithStage;

public class FourthPageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Login;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    void Autorize(ActionEvent event) {
        String em2 = email.getText();
        String pass = password.getText();
        if (ThirdPageController.email.equals(em2) && pass.equals(pass1))
        {
            showFithStage("Five.fxml", "Marathon Skills 2016 - Register as a runner");
        }
        else
        {
            password.setText("Ошибка. Введены неправильные данные");
        }
    }

    @FXML
    void initialize() {
        assert Login != null : "fx:id=\"Login\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'FourthPage.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'FourthPage.fxml'.";

    }

}
