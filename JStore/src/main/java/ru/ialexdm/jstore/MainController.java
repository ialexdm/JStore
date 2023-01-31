package ru.ialexdm.jstore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private Parent root;
    private Stage itemStage;
    private Scene itemScene;

    @FXML
    Button itemsButton;

    public void switchScene(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("items.fxml"));
        itemStage = (Stage) itemsButton.getScene().getWindow();
        itemScene = new Scene(root, 640,480);
        itemStage.setScene(itemScene);
        itemStage.setTitle("JStore:items");
        itemStage.show();
    }
}