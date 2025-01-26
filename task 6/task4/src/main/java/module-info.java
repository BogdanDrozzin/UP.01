module com.drozzin.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.drozzin.task4 to javafx.fxml;
    exports com.drozzin.task4;
}