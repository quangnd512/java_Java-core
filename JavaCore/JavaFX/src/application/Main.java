package application;

import java.awt.event.ActionEvent;
import java.util.EventObject;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application implements EventHandler<javafx.event.ActionEvent>{
	Button button;
	
	@Override
	public void start(Stage primaryStage) {
		// Viet code
		primaryStage.setTitle("Hello World"); //Title
		button = new Button();  //Button
		button.setText("Say.!"); 
		button.setOnAction(this);
		StackPane layout = new StackPane(); //Tao layout chua cac noi dung
		layout.getChildren().add(button); //Cho button vao stack pane
		Scene scene = new Scene(layout, 300, 250); //width: 300, height: 250
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==button) {
			System.out.println("Hello World.!");
		}
	}
}
