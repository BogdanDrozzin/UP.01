module com.drozzin.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.drozzin.task2 to javafx.fxml;
    exports com.drozzin.task2;
}