package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class authentification  implements Initializable{

    public JFXTextField txtnom;
    public JFXPasswordField txtmdp;
    @FXML
    private  Label labWarn;
    

    // bouton
    @FXML
    private JFXButton exit;
    @FXML
    private JFXButton entrer;


    /** des variables statics pour recuperer le compte **/

    public static String compteGerant;
    public static Long motDepasse;


    public void entrer(ActionEvent actionEvent){
        /** test **/
        labWarn.setText("");
        if (txtnom.getText().equals("")){labWarn.setText("Vous devez entrer  le nom de votre compte");}
        else if (txtmdp.getText().equals(""))  {labWarn.setText("Vous devez entrer  le mot de passe ");}
        else if (!txtnom.getText().equals("Aya Rahma"))  {labWarn.setText("Ce compte n'exite pas  ");}
        else if (!txtmdp.getText().equals("12345678")) {labWarn.setText("Ce mot de passe est érroné");}
        else {/** pour recuperer le compte de gerant **/

            compteGerant = txtnom.getText();
            motDepasse = Long.parseLong(txtmdp.getText());

            entrer.setOnMouseClicked((MouseEvent aevent) -> {
                try {
                    Stage stage = (Stage) entrer.getScene().getWindow();
                    stage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("pageprincipale.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                    Stage stage2 = new Stage();
                    stage2.setTitle("pageprincipale");
                    stage2.setScene(scene);
                    stage2.show();


                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            });


        }





    }

    // annullation
    public void exit(javafx.event.ActionEvent actionEvent) {
        exit.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) exit.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("cabinet1.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                Stage stage2 = new Stage();
                stage2.setTitle("authentification");
                stage2.setScene(scene);
                stage2.show();


            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        });


    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO

    }
}
