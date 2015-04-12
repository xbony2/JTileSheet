package xbony2.jtilesheet;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Main extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage pStage){
		Button btn = new Button();
    	btn.setText("Say 'Hello World'");
    	btn.setOnAction(new EventHandler<ActionEvent>() {
    		@Override
    		public void handle(ActionEvent event) {
    			System.out.println("Hello World!");
    		}
    	});
        
    	StackPane root = new StackPane();
    	root.getChildren().add(btn);

    	Scene scene = new Scene(root, 300, 250);

    	pStage.setTitle("Hello World!");
    	pStage.setScene(scene);
    	pStage.show();
	}
}
