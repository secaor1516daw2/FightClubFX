/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightclub;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sergio
 */
public class AdminAreaController implements Initializable {

    @FXML
    private void btnCreateUser(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/CrearUsuari.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Crear Usuari");
        stage.show();
    }

    @FXML
    private void btnModUser(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/CrearUsuari.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Modificar Usuari");
        stage.show();
    }

    @FXML
    private void btnDelUser(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/DelUser.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Eliminar Usuari");
        stage.show();
    }
    
    @FXML
    private void btnCreatePet(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/CrearPetAdmin.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Crear Criatura");
        stage.show();
    }
    
    @FXML
    private void btnModPet(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/CrearPetAdmin.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Modificar Criatura");
        stage.show();
    }

    @FXML
    private void btnModTeam(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/CrearEquipo.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Crear/Modificar Equipo");
        stage.show();
    }
    
    @FXML
    private void btnCombInd(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/UserArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("User Area");
        stage.show();
    }
    
    @FXML
    private void btnCombTeam(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/UserArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("User Area");
        stage.show();
    }
    
    @FXML
    private void btnRank(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/UserArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("User Area");
        stage.show();
    }
    
    @FXML
    private void btnReturnLog(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/Login.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
    
    @FXML
    private void btnReturnAdmin(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/AdminArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Admin Area");
        stage.show();
    }

    @FXML
    private Label lblMessage;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtLema;

    @FXML
    private void btnCreateAction(ActionEvent event) throws Exception {
        if ((txtUsername.getText().length() == 0) || (txtPassword.getText().length() == 0) || (txtLema.getText().length() == 0) ) {
            lblMessage.setText("Username, Password or Lema left");
        } else {
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/AdminArea.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("Admin Area");
            stage.show();

        }
    }

    @FXML
    private TextField txtAtac;
    @FXML
    private TextField txtDefensa;
    @FXML
    private TextField txtRaza;
    @FXML
    private TextField txtMedi;
    @FXML
    private TextField txtHabilitat;
    @FXML
    private TextField txtReady;

    @FXML
    private void btnCreatePetAction(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/AdminArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void btnDelUserAction(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fightclub/AdminArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //combobox.setItems(list);
        
    }

}
