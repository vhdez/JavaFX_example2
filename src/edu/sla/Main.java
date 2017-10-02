package edu.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public void clickMeButton_click() {
        System.out.println("You clicked the ClickME button.");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // create a button with text "Click Me"
        Button clickMeButton = new Button("Click Me");
        // tell button what method will get called when it is clicked
        clickMeButton.setOnAction(e->clickMeButton_click());
        // make a frame and add the button to it
        StackPane myUIFrame = new StackPane();
        myUIFrame.getChildren().add(clickMeButton);

        Scene scene = new Scene(myUIFrame, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Second UI App in Java");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
