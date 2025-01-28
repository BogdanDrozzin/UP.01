module ru.drozzin.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.drozzin.pagetopage to javafx.fxml;
    exports ru.drozzin.pagetopage;
    exports ru.drozzin.pagetopage.controller;
    opens ru.drozzin.pagetopage.controller to javafx.fxml;
    exports ru.drozzin.pagetopage.util;
    opens ru.drozzin.pagetopage.util to javafx.fxml;
}