package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { 

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));

        // specify how to load controller (creating a model)
        loader.setControllerFactory(t -> new Controller(new NotepadModel()));


        stage.setScene(new Scene(loader.load()));
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
