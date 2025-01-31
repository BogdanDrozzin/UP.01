module ru.drozzin.task9_demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.drozzin.task9_demo to javafx.fxml;
    exports ru.drozzin.task9_demo;
}