package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homePageController implements Initializable {

    @FXML
    private Button bangunDatarButton;
    @FXML
    private Button bangunRuangButton;
    @FXML
    private ImageView exit;

    @Override
    public void initialize(URL url, ResourceBundle rb) { }

    @FXML
    public void bangunDatarButtonOnAction(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("bangunDatar.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }

    @FXML
    public void bangunRuangButtonOnAction(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("wip.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }

    @FXML
    public void exitButtonOnAction(MouseEvent event) {
        Stage primarystage = (Stage) exit.getScene().getWindow();
        primarystage.close();
    }

}
