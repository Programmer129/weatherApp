import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 700, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Weather App");
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}
