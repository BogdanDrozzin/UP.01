module ru.drozzin.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.task to javafx.fxml;
    exports ru.drozzin.task;
}