package es.manueldonoso.template;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Pane;

/**
 * JavaFX Main
 */
public class Main extends Application {
@Override
public void start(Stage primaryStage) {

    try {
        // Cargo la ventana inicial
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("primary.fxml"));

        // Ventana a cargar
        Pane ventana = (Pane) loader.load();

        // Creo la escena
        Scene scene = new Scene(ventana);

        // Modifico el stage
        primaryStage.setScene(scene);
        
        //Titulo de la ventana
        primaryStage.setTitle("Main");
        
        // Muestro la ventana
        primaryStage.show();

    } catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }

}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    launch(args);
}


}