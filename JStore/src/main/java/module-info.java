module ru.ialexdm.jstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ialexdm.jstore to javafx.fxml;
    exports ru.ialexdm.jstore;
    opens ru.ialexdm.jstore.models.repositories to javafx.fxml;
    exports ru.ialexdm.jstore.models.repositories;
    opens ru.ialexdm.jstore.models to javafx.fxml;
    exports ru.ialexdm.jstore.models;
}