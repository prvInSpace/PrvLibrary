package space.prv.library.gui;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Window {

    private Stage stage;
    private Scene scene;

    public Window(Stage stage, int width, int height){
        this.stage = stage;
        StackPane root = new StackPane();
        scene = new Scene(root, width, height);
        stage.setScene(scene);
        stage.show();
    }

    public Window(Stage stage){
        this(stage, 800, 600);
    }

    public void setRoot(Parent root){
        Platform.runLater(() -> scene.setRoot(root));
    }
}
