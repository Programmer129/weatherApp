import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import parser.Parser;
import utilities.ImageTaker;

import java.io.IOException;
import java.util.List;

public class AppMain extends Application {

    private Parser parser = new Parser();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane borderPane = new BorderPane();

        ComboBox<String> comboBox = comboBoxList();

        comboBox.setValue(comboBox.getItems().get(0));

        comboBox.valueProperty().addListener((observable, oldValue, newValue) -> {
            try {
                this.parser.setCity(newValue);
                borderPane.setCenter(addFlowPane());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        borderPane.setTop(addHBox(comboBox));
        borderPane.setCenter(addFlowPane());

        Scene scene = new Scene(borderPane, 700, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Weather App");
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    private GridPane addFlowPane() {
        GridPane gridPane = new GridPane();
        GridPane imagePane = new GridPane();
        GridPane dayPane = new GridPane();
        GridPane datesPane = new GridPane();
        GridPane tempPane = new GridPane();
        ImageTaker imageTaker = new ImageTaker();

        List<String> days = this.parser.getDays();
        List<String> dates = this.parser.getDate();
        List<String> getTemp = this.parser.getTemp();
        List<String> phases = this.parser.getPhase();

        for(int i = 0; i< phases.size();i++){

            ImageView view = new ImageView(imageTaker.getMap().get(phases.get(i)));
            if(i == 0) {
                view.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseEnteredEvent -> {
                    List<String> dailyPhases = this.parser.getDailyPhases();
                    List<String> dailyHours = this.parser.getDailyHours();

                    GridPane phasePane = new GridPane();
                    GridPane hourPane = new GridPane();
                    GridPane dailyPane = new GridPane();

                    for (int i1 = 0; i1 < dailyPhases.size(); i1++) {
                        ImageView imageView = new ImageView(imageTaker.getMap().get(dailyPhases.get(i1)));
                        Label label = new Label();
                        label.setText(dailyHours.get(i1));
                        phasePane.add(imageView, i1, 1);
                        phasePane.setHgap(65);
                        hourPane.add(label, i1, 1);
                        hourPane.setHgap(30);
                    }

                    dailyPane.add(phasePane, 0, 1);
                    dailyPane.add(hourPane, 0, 2);
                    dailyPane.setAlignment(Pos.CENTER);

                    Scene scene = new Scene(dailyPane, 600, 200);
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(scene);
                    stage.show();

                    view.addEventHandler(MouseEvent.MOUSE_EXITED, mouseExitEvent -> {
                        stage.close();
                    });
                });
            }
            view.setFitWidth(75);
            view.setFitHeight(75);

            Label dayLabel = new Label();
            dayLabel.setText(days.get(i));

            Label dateLabel = new Label();
            dateLabel.setText(dates.get(i));

            Label tempLabel = new Label();
            tempLabel.setText("    "+getTemp.get(i));

            imagePane.add(view, i, 1);
            imagePane.setHgap(18);
            dayPane.add(dayLabel, i, 1);
            dayPane.setHgap(31);
            datesPane.add(dateLabel, i, 1);
            datesPane.setHgap(35);
            tempPane.add(tempLabel,i, 1);
            tempPane.setHgap(40);
        }

        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(imagePane, 0, 2);
        gridPane.add(dayPane, 0, 0);
        gridPane.add(datesPane, 0, 1);
        gridPane.add(tempPane, 0, 3);

        return gridPane;
    }

    private ComboBox<String> comboBoxList(){
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(parser.getCities());

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
