module pr.drozzin.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pr.drozzin.task2 to javafx.fxml;
    exports pr.drozzin.task2;
}