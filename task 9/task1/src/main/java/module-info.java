module ru.drozzin.task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.drozzin.task1 to javafx.fxml;
    exports ru.drozzin.task1;
}