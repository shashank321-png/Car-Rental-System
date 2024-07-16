import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class payment extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Object backimage;

    @Override
    public void start(Stage stage) {

        Label lable5 = new Label();
        ImageView iv = new ImageView(new Image("QrImage.jpg"));
        lable5.setGraphic(iv);
        // lable5.set
        Button button = new Button("Back");
        button.setOnAction(event -> {
            new CarList().start(stage);
        });

        StackPane stackPane = new StackPane(lable5);
        VBox vbox1 = new VBox(20);
        stackPane.setAlignment(Pos.CENTER);
        // button.setAlignment(Pos.BASELINE_CENTER);
        button.setAlignment(Pos.BOTTOM_CENTER);
        // button.setScaleX(1);
        // button.setScaleY(2);
        // button.setLayoutX(100);
        // button.setLayoutY(100);
        vbox1.getChildren().addAll(stackPane, button);
        vbox1.setAlignment(Pos.CENTER);

        vbox1.setStyle("-fx-background-image: url('back.jpeg');");
        ;
        Scene se = new Scene(vbox1, 1000, 1000, true, null);

        stage.setScene(se);
        stage.show();
    }

}
