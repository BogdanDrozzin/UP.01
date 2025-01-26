package com.drozzin.task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;
import java.util.List;

public class Task2Controller {

    @FXML
    private Label ResultLabel;

    @FXML
    private TextField nTextField;

    @FXML
    private ListView<Integer> SetListView;

    @FXML
    void OKonAction(ActionEvent event) {
        List<Integer> data = SetListView.getItems();
        double sum = 0;
        int count = 0;

        for (int number : data) {
            if (number % 8 == 0) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            ResultLabel.setText(String.format("Среднее: %.1f", average));
        } else {
            ResultLabel.setText("NO");
        }
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void donAction(ActionEvent event) {
        String input = nTextField.getText().trim();
        try {
            int number = Integer.parseInt(input);
            if (number > 0 && number <= 300) {
                SetListView.getItems().add(number);
            }
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            nTextField.setText("");
        }
    }
}
