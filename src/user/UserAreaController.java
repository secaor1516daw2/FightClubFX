/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sergio
 */
public class UserAreaController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtRace;
    
    @FXML
    private void btnCreatePet(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/user/CrearPetUsr.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Create Pet");
        stage.show();
    }
    
    @FXML
    private void btnModPet(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/user/CrearPetUsr.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Modificar Pet");
        stage.show();
    }
    
    @FXML
    private void btnModTeam(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/user/CrearEquipUsr.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("User Area");
        stage.show();
    }
    
    @FXML
    private void btnCombInd(ActionEvent event) throws Exception {
    ((Node) (event.getSource())).getScene().getWindow().hide();
    Parent parent = FXMLLoader.load(getClass().getResource("/user/CombatIndUsr.fxml"));
    Stage stage = new Stage();
    Scene scene = new Scene(parent);
    stage.setScene(scene);
    stage.setTitle("Combate Individual");
    stage.show();
    }
    
    @FXML
    private void btnCombTeam(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/user/CombatEquipUsr.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Combate Equipo");
        stage.show();
    }
    
    @FXML
    private void btnRank(ActionEvent event) throws Exception {
    ((Node) (event.getSource())).getScene().getWindow().hide();
    Parent parent = FXMLLoader.load(getClass().getResource("/user/RankingUsr.fxml"));
    Stage stage = new Stage();
    Scene scene = new Scene(parent);
    stage.setScene(scene);
    stage.setTitle("Ranking");
    stage.show();
    }
    @FXML
    private void btnReturnLog(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/login/Login.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
