package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class persegiController{

    Persegi persegi = new Persegi(0,0);

    @FXML
    private Button hitungKelilingButton;

    @FXML
    private Button hitungLuasButton;

    @FXML
    private TextField panjangField;

    @FXML
    private TextField lebarField;

    @FXML
    private TextField resultTextField;

    @FXML
    public void hitungKelilingOnAction(ActionEvent event)
    {
        if (panjangField.getText().isEmpty()||lebarField.getText().isEmpty()) {
            resultTextField.setText("Length and height must be entered");
        } else {
            persegi.setPanjang(Double.parseDouble(panjangField.getText()));
            persegi.setLebar(Double.parseDouble(lebarField.getText()));
            resultTextField.setText("Keliling Persegi : " + persegi.hitungKeliling() + " cm");
        }
    }

    @FXML
    public void hitungLuasOnAction(ActionEvent event)
    {
        if (panjangField.getText().isEmpty()||lebarField.getText().isEmpty()) {
            resultTextField.setText("Length and height must be entered");
        } else {
            persegi.setPanjang(Double.parseDouble(panjangField.getText()));
            persegi.setLebar(Double.parseDouble(lebarField.getText()));
            resultTextField.setText("Keliling Luas : " + persegi.hitungKeliling() + " cm");
        }
    }

}
