module ru.drozzin.drozzin_task3_dop2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.drozzin_task3_dop2 to javafx.fxml;
    exports ru.drozzin.drozzin_task3_dop2;
}