package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pageprincipale {
    public JFXButton patient;
    public JFXButton rdv;





    // les boutons une fois on clique sur les boutons rendez vous trtrdv et patient vers fiche patient .

    public void patient(javafx.event.ActionEvent actionEvent) {
        patient.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) patient.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FichePat.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 571, 444);
                Stage stage2 = new Stage();
                stage2.setTitle("Fiche_patient");
                stage2.setScene(scene);
                stage2.show();


            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        });


    }





    public void rdv(javafx.event.ActionEvent actionEvent) {
        rdv.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) rdv.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("TrtRdv.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 676, 494);
                Stage stage2 = new Stage();
                stage2.setTitle("traitement de rendez-vous");
                stage2.setScene(scene);
                stage2.show();


            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
        });


    }




}
