module org.example.drozzin_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.drozzin_task2 to javafx.fxml;
    exports org.example.drozzin_task2;
}