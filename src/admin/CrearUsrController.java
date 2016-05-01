/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sergio
 */
public class CrearUsrController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private Label lblMessage;
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
            Parent parent = FXMLLoader.load(getClass().getResource("/admin/AdminArea.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("Admin Area");
            stage.show();

        }
    }
    
    @FXML
    private void btnReturnAdmin(ActionEvent event) throws Exception {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/admin/AdminArea.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Admin Area");
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
