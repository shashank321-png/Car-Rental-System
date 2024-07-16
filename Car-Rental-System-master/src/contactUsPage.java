import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class contactUsPage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Car Rental App");

        // Create a VBox for the Contact Us page
        VBox contactUsPage = new VBox();
        contactUsPage.setAlignment(Pos.CENTER);
        contactUsPage.setSpacing(20);

        // Title
        Label title = new Label("Contact Us");
        title.setFont(Font.font("Arial", 36));

        // Contact Information
        Label contactInfo = new Label("Talk to Our Experts...\n");
        contactInfo.setFont(Font.font("Arial", 24));
        // message Information
        Label message = new Label("You can share your details with us to receive updates");
        message.setFont(Font.font("Arial", 24));

        Label email = new Label("Email: core2webinfo@gmail.com");
        email.setFont(Font.font("Arial", 24));

        Label phone = new Label("Phone: +91 7385092120 / 9307922405");
        phone.setFont(Font.font("Arial", 24));
        // label1.setFill(BOLD)
        // Right-Side Image
        ImageView carImage = new ImageView(new Image("Shashi_sir.jpeg"));
        carImage.setFitWidth(300);
        carImage.setFitHeight(200);

        // Colorful Fonts
        title.setStyle("-fx-text-fill: black;");
        contactInfo.setStyle("-fx-text-fill: #555;");
        message.setStyle("-fx-text-fill:#0085Fb");
        email.setStyle("-fx-text-fill: #0077FF;");
        phone.setStyle("-fx-text-fill: #0077FF;");

        // Add components to the Contact Us page
        contactUsPage.getChildren().addAll(title, contactInfo, message, email, phone);

        // Create an HBox to combine the contact page and the image
        HBox contactAndImage = new HBox(20);
        contactAndImage.setAlignment(Pos.CENTER);
        Button button = new Button("Back");
        button.setOnAction(event -> {
            new App().start(primaryStage);
        });
        button.setStyle("-fx-font-size: 24 ; -fx-background-color: black ;-fx-text-fill: white ;");
        contactAndImage.setStyle("-fx-background-image: url('final.png');");
        contactAndImage.getChildren().addAll(contactUsPage, carImage, button);

        // Create the main scene
        Scene scene = new Scene(contactAndImage, 1000, 1000);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
