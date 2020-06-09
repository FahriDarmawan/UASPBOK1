package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class bangunDatarController implements Initializable {

    @FXML
    private BorderPane bdPane;
    @FXML
    private Button hitungKelilingButton;
    @FXML
    private Button hitungLuasButton;
    @FXML
    private TextField panjangField;
    @FXML
    private TextField lebarField;
    @FXML
    private TextField jariField;
    @FXML
    private TextField resultTextField;
    @FXML
    private TextField alasField;
    @FXML
    private TextField tinggiField;
    @FXML
    private TextField sisiAField;
    @FXML
    private TextField sisiBField;
    @FXML
    private TextField sisiCField;
    @FXML
    private ImageView exit;
    @FXML
    private ImageView home;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void persegi(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("persegi");
        bdPane.setCenter(view);
    }

    @FXML
    private void lingkaran(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("lingkaran");
        bdPane.setCenter(view);
    }

    @FXML
    private void segitiga(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("segitiga");
        bdPane.setCenter(view);
    }


    Persegi persegi = new Persegi(0,0);
    Lingkaran lingk = new Lingkaran(0);
    Segitiga sg1 = new Segitiga(0,0);
    Segitiga sg2 = new Segitiga(0,0,0);

    @FXML
    public void hitungKelilingPersegiOnAction(ActionEvent event)
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
    public void hitungLuasPersegiOnAction(ActionEvent event)
    {
        if (panjangField.getText().isEmpty()||lebarField.getText().isEmpty()) {
            resultTextField.setText("Length and height must be entered");
        } else {
            persegi.setPanjang(Double.parseDouble(panjangField.getText()));
            persegi.setLebar(Double.parseDouble(lebarField.getText()));
            resultTextField.setText("Luas Persegi : " + persegi.hitungLuas() + " cm\u00B2");
        }
    }

    @FXML
    public void hitungKelilingLingkaranOnAction(ActionEvent event)
    {
        if (jariField.getText().isEmpty()) {
            resultTextField.setText("Jari-jari must be entered");
        } else {
            lingk.setJari(Double.parseDouble(jariField.getText()));
            resultTextField.setText("Keliling Lingkaran : " + lingk.hitungKeliling() + " cm");
        }
    }

    @FXML
    public void hitungLuasLingkaranOnAction(ActionEvent event)
    {
        if (jariField.getText().isEmpty()) {
            resultTextField.setText("Jari-jari must be entered");
        } else {
            lingk.setJari(Double.parseDouble(jariField.getText()));
            resultTextField.setText("Luas Lingkaran : " + lingk.hitungLuas() + " cm\u00B2");
        }
    }

    @FXML
    public void hitungKelilingSegitigaOnAction(ActionEvent event)
    {
        if(sisiAField.getText().isEmpty() || sisiBField.getText().isEmpty() || sisiCField.getText().isEmpty()) {
            resultTextField.setText("SisiA, SisiB, and SisiC must be entered");
        } else {
            sg2.setsisiA(Double.parseDouble(sisiAField.getText()));
            sg2.setsisiB(Double.parseDouble(sisiBField.getText()));
            sg2.setsisiC(Double.parseDouble(sisiCField.getText()));
            resultTextField.setText("Keliling Segitiga : " + sg2.hitungKeliling() + " cm");
        }
    }

    @FXML
    public void hitungLuasSegitigaOnAction(ActionEvent event)
    {
        if(alasField.getText().isEmpty()||tinggiField.getText().isEmpty()) {
            resultTextField.setText("Alas and Tinggi must be entered");
        } else {
            sg1.setAlas(Double.parseDouble(alasField.getText()));
            sg1.setTinggi(Double.parseDouble(tinggiField.getText()));
            resultTextField.setText("Luas Segitiga : " + sg1.hitungLuas() + " cm\u00B2");
        }
    }

    @FXML
    public void exitButtonOnAction(MouseEvent event) {
        Stage primarystage = (Stage) exit.getScene().getWindow();
        primarystage.close();
    }

    @FXML
    public void homeButtonOnAction(MouseEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }

}