package com.drozzin.task3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task3Controller {

    @FXML
    private TextField nTextField;

    @FXML
    private Label ResultLabel;

    @FXML
    protected void OKonAction() {
        String input = nTextField.getText();
        int N = Integer.parseInt(input);
        if (N > 0) {
            int sum = 0;
            for (int i = N; i <= 2 * N; i++) {
                sum += i * i;
            }
            ResultLabel.setText(String.valueOf(sum));
        } else {
            ResultLabel.setText("Введите число больше 0");
        }

    }

    @FXML
    protected void cancelonAction() {
        Platform.exit();
    }

}