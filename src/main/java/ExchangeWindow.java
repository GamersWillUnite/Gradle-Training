import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ExchangeWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("currency_converter_ui.fxml"));
        primaryStage.setTitle("currency converter");
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.show();
    }
}
