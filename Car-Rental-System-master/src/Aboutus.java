import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Aboutus extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("About Us - Car Rental App");

        VBox root = new VBox(10);
        root.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 20px;");

        Label title = new Label("About Us");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        title.setTextFill(Color.web("#3366FF"));

        // Add an image
        ImageView imageView = new ImageView(new Image("aboutus.jpg")); // Replace 'car.png' with your image
        // path
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);

        // Add a description
        Label description = new Label(
                "We are a leading car rental service dedicated to providing the best vehicles and services to our customers.");
        description.setFont(Font.font("Arial", 16));
        description.setWrapText(true);
        description.setTextFill(Color.web("#444"));

        // Add a message
        Label message = new Label("Your satisfaction is our top priority.");
        Label label1 = new Label("Group Memberes : ");
        Label name1 = new Label("Mayuri Shigwan");
        Label name2 = new Label("Anand Mali");
        Label name3 = new Label("Bhushan Chaudhari");
        Label name4 = new Label("Trupti Jadhav");

        message.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        message.setTextFill(Color.web("#008000"));

        BorderPane borderPane = new BorderPane();

        // Add the image to the right side of the BorderPane
        borderPane.setRight(imageView);
        Button button = new Button("Back");
        button.setOnAction(event -> {
            new App().start(primaryStage);
        });
        button.setStyle("-fx-font-size: 24 ; -fx-background-color: black ; -fx-text-fill: white ;");
        // Add elements to the VBox
        root.getChildren().addAll(title, description, message, label1, name1, name2, name3, name4, imageView, button);
        root.setAlignment(javafx.geometry.Pos.CENTER);
        root.setStyle("-fx-background-image: url('Safeimagekit-resized-img.png')");
        // Create the scene
        Scene scene = new Scene(root, 1000, 1000);

        // Set the scene on the stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    // public static void main(String[] args) {
    // launch(args);
    // }
}
