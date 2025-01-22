package pr.drozzin.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class HelloController {
    @FXML
    private Label resultS;

    @FXML
    private Label resultP;

    @FXML
    private TextField x1ET;

    @FXML
    private TextField x2ET;

    @FXML
    private TextField x3ET;

    @FXML
    private TextField y1ET;

    @FXML
    private TextField y2ET;

    @FXML
    private TextField y3ET;


    public void check(ActionEvent actionEvent) {
        float x1 = Float.parseFloat(x1ET.getText());
        float x2 = Float.parseFloat(x2ET.getText());
        float x3 = Float.parseFloat(x3ET.getText());
        float y1 = Float.parseFloat(y1ET.getText());
        float y2 = Float.parseFloat(y2ET.getText());
        float y3 = Float.parseFloat(y3ET.getText());

        float a = (float) sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        float b = (float) sqrt(pow(x3 - x2, 2) + pow(y3 - y2, 2));
        float c = (float) sqrt(pow(x3 - x1, 2) + pow(y3 - y1, 2));

        float p = (a + b + c) / 2;
        float P = p * 2;
        float S = (float) sqrt(p * (p - a) * (p - b) * (p - c));

        resultS.setText("Площадь: " + S);
        resultP.setText("Периметр: " + P);
    }
}