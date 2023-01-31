module ru.ialexdm.jstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ialexdm.jstore to javafx.fxml;
    exports ru.ialexdm.jstore;
}