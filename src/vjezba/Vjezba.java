package vjezba;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Vjezba extends Application{

    Label message = null;
    public static void main(String[] args) {

        
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
         
        message = new Label("nothing clicked...");
        
        Button normalButton = new Button("_Normal");
        normalButton.setId("normalButton");
        
        Button defaultButton = new Button("_Default");
        defaultButton.setDefaultButton(true);
        defaultButton.setId("defaultButton");
        
        Button cancelButton = new Button("_Cancel");
        cancelButton.setCancelButton(true);
        cancelButton.setId("cancelButton");
        
        normalButton.setOnAction(e -> btnClicked(e));
        defaultButton.setOnAction(e -> btnClicked(e));
        cancelButton.setOnAction(e -> btnClicked(e));
        
        GridPane grid = new GridPane();
        grid.add(message, 0, 0, 3, 1);
        grid.addRow(1, normalButton, defaultButton, cancelButton);
        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
                
                
    }
    public void btnClicked(ActionEvent e){
        Button button = (Button)e.getSource();
        if(null != button.getId()){
            switch(button.getId()){
                case "normalButton":
                    message.setText("normal...");
                    break;
                case "defaultButton":
                    message.setText("default...");
                    break;
                case "cancelButton":
                    message.setText("cancel...");
                    break;
            }
        }
    }

}
