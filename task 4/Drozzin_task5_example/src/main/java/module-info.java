module ru.drozzin.drozzin_task5_example {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.drozzin_task5_example to javafx.fxml;
    exports ru.drozzin.drozzin_task5_example;
}