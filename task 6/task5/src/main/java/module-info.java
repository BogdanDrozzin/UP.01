module com.drozzin.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.drozzin.task5 to javafx.fxml;
    exports com.drozzin.task5;
}