/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sergio
 */
public class CrearEquipUsrController implements Initializable {

    @FXML
    private ComboBox<String> combobox;
    
    @FXML
    private Label label;
    
    @FXML
    private void btnComboBox(ActionEvent event)throws Exception {
        label.setText("Selected Value: "+combobox.getValue());  
    }
    ObservableList<String> list = FXCollections.observableArrayList(
        "Value-1","Value-2","Value-3","Value-4","Value-5","Value-6"
    );
    
    @FXML
    private void btnReturnUser(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/user/UserArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("User Area");
        stage.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //combobox.setItems(list);
    }    
    
}
