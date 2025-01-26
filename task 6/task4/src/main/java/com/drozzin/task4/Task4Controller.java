package com.drozzin.task4;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task4Controller {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label ResultLabel;

    @FXML
    protected void OKonAction() {
        String aInput = aTextField.getText();
        String nInput = nTextField.getText();
        double A = Double.parseDouble(aInput);
        int N = Integer.parseInt(nInput);

        double sum = 1;
        double currentTerm = 1;

        for (int i = 1; i <= N; i++) {
            currentTerm *= A;
            sum += currentTerm;
        }

        ResultLabel.setText(String.valueOf(sum));


    }

    @FXML
    protected void cancelonAction() {
        Platform.exit();
    }
}