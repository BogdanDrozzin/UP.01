module ru.drozzin.drozzin_task42 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.drozzin_task42 to javafx.fxml;
    exports ru.drozzin.drozzin_task42;
}