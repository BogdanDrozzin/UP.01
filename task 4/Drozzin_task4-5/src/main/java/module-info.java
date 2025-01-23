module ru.drozzin.drozzin_task45 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.drozzin_task45 to javafx.fxml;
    exports ru.drozzin.drozzin_task45;
}