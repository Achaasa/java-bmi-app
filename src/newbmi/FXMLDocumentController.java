/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author Achaasa
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private JFXTextField userWeight;

    @FXML
    private JFXTextField userHeight;

    @FXML
    private JFXButton calculatebtn;

    @FXML
    private Label answer;

    @FXML
    void calculate(ActionEvent event) {
        try{
            double heightentered=Double.parseDouble(userHeight.getText());
            double weightentered=Double.parseDouble(userWeight.getText());
            double bmi= weightentered/(heightentered*heightentered);
            DecimalFormat df = new DecimalFormat("#.##");
            answer.setText("BMI: "+ df.format(bmi));
            
            
        }catch (NumberFormatException e) {
            answer.setText("Invalid input");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
