package com.drozzin.task5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Task5Controller {
    @FXML
    private Label ResultLabel;

    @FXML
    private TextField nTextField;

    public void OKonAction(ActionEvent actionEvent) {
        double N = Double.parseDouble(nTextField.getText().toString());
        double sum = 0;
        double a = 1;
        double b = 1;

        for (int k = 1; k <= N; k++) {
            if (k > 1) {
                a = 3 * b + 2 * a;
                b = 2 * a + b;
            }
            double term = Math.pow(2, k) / ((1 + Math.pow(a, 2) + Math.pow(b, 2)) * factorial(k));
            sum += term;
        }
        ResultLabel.setText(String.valueOf(sum));
    }

    public void cancelonAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
