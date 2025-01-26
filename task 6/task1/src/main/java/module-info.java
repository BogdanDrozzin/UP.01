module com.drozzin.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.drozzin.task1 to javafx.fxml;
    exports com.drozzin.task1;
}