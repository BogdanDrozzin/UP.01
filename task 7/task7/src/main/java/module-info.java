module ru.drozzin.task7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.task7 to javafx.fxml;
    exports ru.drozzin.task7;
    exports ru.drozzin.task7.Controller;
    opens ru.drozzin.task7.Controller to javafx.fxml;
}