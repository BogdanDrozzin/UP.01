module ru.drozzin.drozzin_task4_dop1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.drozzin_task4_dop1 to javafx.fxml;
    exports ru.drozzin.drozzin_task4_dop1;
}