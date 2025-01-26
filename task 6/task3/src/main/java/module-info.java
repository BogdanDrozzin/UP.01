module com.drozzin.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.drozzin.task3 to javafx.fxml;
    exports com.drozzin.task3;
}