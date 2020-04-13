package sample;
import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cabinet1 {

    // boutons existants
    public JFXButton suivant;
    public JFXButton quitter;
    public void suivant(javafx.event.ActionEvent actionEvent) {
        suivant.setOnMouseClicked((MouseEvent aevent) -> {
            try {
                Stage stage = (Stage) suivant.getScene().getWindow();
                stage.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("authentification.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 444, 272);
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



public void quitter (){}

}