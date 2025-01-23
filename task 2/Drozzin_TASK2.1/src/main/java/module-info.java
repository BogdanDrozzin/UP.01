module org.example.drozzin_task21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.drozzin_task21 to javafx.fxml;
    exports org.example.drozzin_task21;
}