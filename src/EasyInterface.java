import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Scanner;
import java.util.Stack;

public class EasyInterface extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button();
        btn.setText("ENGAGE");
        btn.setOnAction(event -> System.out.println("PEW PEW PEW"));
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root,300,250);
        stage.setTitle("Lambda");
        stage.setScene(scene);
        stage.show();
    }
}
