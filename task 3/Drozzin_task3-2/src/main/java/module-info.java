module ru.drozzin.drozzin_task32 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.drozzin_task32 to javafx.fxml;
    exports ru.drozzin.drozzin_task32;
}