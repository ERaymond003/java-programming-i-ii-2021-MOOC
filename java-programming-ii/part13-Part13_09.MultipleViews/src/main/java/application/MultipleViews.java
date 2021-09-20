package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{
    
    @Override
    public void start(Stage window) {
        BorderPane firstViewLayout = new BorderPane();
        Label firstViewLabel = new Label("First view!");
        Button firstViewButton = new Button("To the second view!");       
        firstViewLayout.setTop(firstViewLabel);
        firstViewLayout.setCenter(firstViewButton);
        
        Scene first = new Scene(firstViewLayout);
        
        VBox secondViewLayout = new VBox();
        Button secondViewButton = new Button("To the third view!");
        Label secondViewLabel = new Label("Second view!");
        secondViewLayout.getChildren().addAll(secondViewButton, secondViewLabel);
        
        Scene second = new Scene(secondViewLayout);
        
        GridPane thirdViewLayout = new GridPane();
        Label thirdViewLabel = new Label("Third view!");
        Button thirdViewButton = new Button("To the first view!");
        thirdViewLayout.add(thirdViewLabel, 0, 0);
        thirdViewLayout.add(thirdViewButton, 1, 1);
        
        Scene third = new Scene(thirdViewLayout);
        
        firstViewButton.setOnAction((event) -> {
            window.setScene(second);
        });
        
        secondViewButton.setOnAction((event) -> {
            window.setScene(third);
        });
        
        thirdViewButton.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
