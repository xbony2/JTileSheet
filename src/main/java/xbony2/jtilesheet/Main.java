package xbony2.jtilesheet;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**
 * So, goals for this project:
 * <ul>
 * 	<li>The code is written in Java, rather then a very-evolving language like Rust.</li>
 *  <li>It is GUI-based (JavaFX) rather then command-line based.</li>
 *  <li>Making tilesheets is possible without bothering Retep.</li>
 * </ul>
 * 
 * @author xbony2
 */
public class Main extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage pStage){
		Button btn = new Button();
    	btn.setText("Say 'Hello World'");
    	btn.setOnAction(e -> {
    		System.out.println("Hello World!");
    	});
        
    	StackPane root = new StackPane();
    	root.getChildren().add(btn);

    	Scene scene = new Scene(root, 300, 250);

    	pStage.setTitle("JTileSheet");
    	pStage.setScene(scene);
    	pStage.show();
	}
}
