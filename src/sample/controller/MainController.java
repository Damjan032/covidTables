package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.model.Patient;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TableView<Patient> t_Patients = new TableView<Patient>();
    @FXML
    private TableColumn<Patient, String> id = new TableColumn<Patient, String>();
    @FXML
    private TableColumn<Patient, String> name = new TableColumn<Patient, String>();

    public ObservableList<Patient> list = FXCollections.observableArrayList(
            new Patient("1", "Pera"),
            new Patient("2", "Mile"),
            new Patient("3", "Stole")
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<Patient, String>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Patient, String>("name"));
        t_Patients.setItems(list);
    }
}
