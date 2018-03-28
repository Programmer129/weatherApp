import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import parser.Parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        BorderPane borderPane = new BorderPane();

        ComboBox<String> comboBox = comboBoxList();

        comboBox.setValue(comboBox.getItems().get(0));

        borderPane.setTop(addHBox(comboBox));
        borderPane.setCenter(addFlowPane());

        Scene scene = new Scene(borderPane, 700, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Weather App");
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    private FlowPane addFlowPane() {
        FlowPane flowPane = new FlowPane();
        List<ImageView> imageView = new ArrayList<>();
        File [] files = new File("/home/levani/IdeaProjects/weatherappdemo/images/").listFiles();

        for (File file : files) {
            imageView.add(new ImageView(new Image(file.toURI().toString())));
        }

        flowPane.getChildren().addAll(imageView);

        return flowPane;
    }

    private ComboBox<String> comboBoxList(){
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(new Parser().getCities());

        return comboBox;
    }

    private HBox addHBox(ComboBox<String> comboBox) {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setStyle("-fx-background-color: #336699;");
        hbox.getChildren().add(comboBox);

        return hbox;
    }
}
