
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Car Rental System");

        // Header
        // HBox header = createHeader();
        HBox buttonBar = createButtonBar(stage);
        HBox searchBox = createSearchBox();
        // ImageView backgroundImage = createBackgroundImage();

        BorderPane root = new BorderPane();
        root.setTop(buttonBar);
        root.setCenter(searchBox);
        // root.setBottom(backgroundImage);

        Scene scene = new Scene(root, 1000, 1000, Color.BLACK);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("car11.jpeg")));
        stage.setResizable(true);
        stage.setFullScreen(false);
        scene.setCursor(Cursor.CLOSED_HAND);
        stage.setScene(scene);
        stage.show();
    }

    private HBox createHeader() {
        HBox header = new HBox();
        header.setStyle("-fx-background-color: #3498db;");
        Text headerText = new Text("Car Rental System");
        headerText.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        headerText.setFill(Color.WHITE);
        header.getChildren().add(headerText);
        return header;
    }

    private HBox createButtonBar(Stage stage) {
        HBox buttonBar = new HBox(20);
        buttonBar.setStyle("-fx-background-color: #34495e;");
        Button homeButton = createStyledButton("Home", Color.WHITE);
        Button carListButton = createStyledButton("Car List", Color.WHITE);
        Button aboutUsButton = createStyledButton("About Us", Color.WHITE);
        Button contactUsButton = createStyledButton("Contact Us", Color.WHITE);

        homeButton.setOnAction(event -> {
            new App().start(stage);
        });
        carListButton.setOnAction(event -> {
            new CarList().start(stage);
        });
        aboutUsButton.setOnAction(event -> {
            new Aboutus().start(stage);
        });
        contactUsButton.setOnAction(event -> {
            new contactUsPage().start(stage);
        });

        buttonBar.getChildren().addAll(homeButton, carListButton, aboutUsButton, contactUsButton);
        return buttonBar;
    }

    private HBox createSearchBox() {
        HBox searchBox = new HBox(20);
        searchBox.setStyle("-fx-background-color: rgba(0, 0, 0, 0.6);");
        TextField textField = new TextField();
        textField.setPromptText("Search for a car...");
        textField.setStyle("-fx-font-size: 18;");
        searchBox.getChildren().add(textField);
        searchBox.setAlignment(Pos.CENTER);
        searchBox.setStyle("-fx-background-image: url('veee.png');");
        return searchBox;
    }

    private ImageView createBackgroundImage() {
        Image backgroundImage = new Image(getClass().getResourceAsStream("car11.jpeg"));
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(1600);
        backgroundImageView.setFitHeight(800);
        return backgroundImageView;
    }

    private Button createStyledButton(String text, Color textColor) {
        Button button = new Button(text);
        button.setStyle("-fx-background-color: #2980b9; -fx-text-fill: " + textColor.toString().toLowerCase()
                + "; -fx-font-size: 18;");
        button.setMinWidth(150);
        return button;
    }

    // private void openHomePage(Stage stage) {
    // // Implement the Home page
    // }

    // private void openCarListPage(Stage stage) {
    // // Implement the Car List page
    // }

    // private void openAboutUsPage(Stage stage) {
    // // Implement the About Us page
    // }

    // private void openContactUsPage(Stage stage) {
    // // Implement the Contact Us page
    // }
}
