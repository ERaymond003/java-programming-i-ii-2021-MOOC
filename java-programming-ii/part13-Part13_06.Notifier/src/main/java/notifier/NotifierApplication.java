package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{
    
    @Override
    public void start(Stage window) {
        TextField textFieldComponent = new TextField();
        Button buttonComponent = new Button("Update");
        Label labelComponent = new Label();
        
        buttonComponent.setOnAction((event) -> {
            labelComponent.setText(textFieldComponent.getText());
        });
        
        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(textFieldComponent, buttonComponent, labelComponent);
        
        Scene viewport = new Scene(componentGroup);
        
        window.setScene(viewport);
        window.show();
        
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }

}
