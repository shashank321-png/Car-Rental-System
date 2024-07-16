
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CarList extends Application {
    // Stage s;
    // Scene se, scene1, stage3;

    public static void main(String[] args) {
        launch(args);

    }

    // Stage primaryStage;

    HBox HboxInVbox(String image, String prise, String specification, String area) {
        Image image1 = new Image(image);
        ImageView IV = new ImageView(image1);
        IV.setFitHeight(200);
        IV.setPreserveRatio(true);

        // IV.setOnMouseClicked(e ->stage3 );

        Label lable1 = new Label();
        lable1.setGraphic(IV);

        Label lable2 = new Label();
        lable2.setText(prise);
        lable2.setFont(Font.font("Roboto", FontWeight.BOLD, 36));

        Label lable3 = new Label();
        lable3.setText(specification);
        lable3.setFont(Font.font("Roboto", FontWeight.BOLD, 24));

        Label lable4 = new Label();
        lable4.setText(area);
        lable4.setFont(Font.font("Roboto", FontWeight.BLACK, 24));

        HBox hbox1 = new HBox(10);
        hbox1.setPadding(new Insets(10));
        // hbox1.setStyle("-fx-background-color:blue;");

        VBox i1vbox = new VBox();
        i1vbox.getChildren().addAll(lable2, lable3, lable4);
        i1vbox.setPadding(new Insets(10));
        hbox1.getChildren().addAll(lable1, i1vbox);
        return hbox1;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CAR LIST PAGE");
        BorderPane bordp = new BorderPane();

        HBox hbox1 = HboxInVbox("vista.jpeg", "RS: 1000/hr", "Tata indica vista 2014 Diesel", "Narhe");
        Button bt = new Button("Take your Ride");
        bt.setOnAction(Event -> {
            new payment().start(primaryStage);

        }

        );
        HBox hbox2 = HboxInVbox("honda_city.jpg", "RS: 2000/hr", "Honda City 2014 Diesel", "Narhe");
        Button bt1 = new Button("Take your Ride");
        bt1.setOnAction(Event -> {
            new payment().start(primaryStage);

        });
        HBox hbox3 = HboxInVbox("bmw.jpeg", "RS: 5500/hr", "BMW 2019 Diesel", "Katraj");
        Button bt3 = new Button("Take your Ride");

        bt3.setOnAction(Event -> {
            new payment().start(primaryStage);

        });

        Button button = new Button("Back");
        button.setOnAction(event -> {
            new App().start(primaryStage);
        });
        button.setStyle("-fx-font-size: 24 ; -fx-background-color: black ; -fx-text-fill: white ;");

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(hbox1, bt, hbox2, bt1, hbox3, bt3, button);
        vbox.setStyle("-fx-background-image: url('rent_a_car.jpg');");

        Scene scene1 = new Scene(vbox, 1000, 1000, Color.BLACK);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("car11.jpeg")));
        primaryStage.setScene(scene1);

        primaryStage.show();

    }

}
