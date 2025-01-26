package ru.drozzin.drozzin_task5_example;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class example {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ok;

    @FXML
    private Button otm;

    @FXML
    private ListView<?> spisok;

    @FXML
    private Label vhodDannie;

    @FXML
    private TextField vvod;

    @FXML
    void Button(ActionEvent event) {
    }

    @FXML
    void ok(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert ok != null : "fx:id=\"ok\" was not injected: check your FXML file 'example.fxml'.";
        assert otm != null : "fx:id=\"otm\" was not injected: check your FXML file 'example.fxml'.";
        assert spisok != null : "fx:id=\"spisok\" was not injected: check your FXML file 'example.fxml'.";
        assert vhodDannie != null : "fx:id=\"vhodDannie\" was not injected: check your FXML file 'example.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'example.fxml'.";

    }

}
