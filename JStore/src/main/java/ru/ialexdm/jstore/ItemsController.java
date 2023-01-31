package ru.ialexdm.jstore;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ru.ialexdm.jstore.infrastructure.memory.ItemMemoryRepository;
import ru.ialexdm.jstore.models.Item;
import ru.ialexdm.jstore.models.repositories.ItemRepository;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ItemsController implements Initializable {
    private ItemRepository itemRepository = new ItemMemoryRepository();
    ObservableList<Item> items = FXCollections.observableArrayList();

    private Parent root;
    private Stage itemStage;
    private Scene itemScene;
    @FXML
    private Button backButton;

    @FXML
    private TableColumn<Item, String> brandColumn;

    @FXML
    private TableColumn<Item, String> categoryColumn;

    @FXML
    private TableColumn<Item, Integer> idColumn;

    @FXML
    private TableView<Item> itemsTable;

    @FXML
    private Label jstoreHeader;

    @FXML
    private TableColumn<Item, String> nameColumn;


    public void switchMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        itemStage = (Stage) backButton.getScene().getWindow();
        itemScene = new Scene(root, 640,480);
        itemStage.setScene(itemScene);
        itemStage.setTitle("JStore!");
        itemStage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<Item, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("category"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("brand"));
        items.addAll(itemRepository.getAllItems());
        itemsTable.setItems(items);
    }
}
