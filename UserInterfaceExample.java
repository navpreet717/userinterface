package userInterfaceExample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UserInterfaceExample extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     launch (args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//choose UI components
		Button button=new Button();
		button.setText("SUBMIT");
		//PUT INSide container work like div
		StackPane root=new StackPane();
		root.getChildren().add(button);
		//scene
		primaryStage.setScene(new Scene(root,300,250));
		primaryStage.setTitle("my first app");
		//show the scene
		primaryStage.show();
		
	}

}
