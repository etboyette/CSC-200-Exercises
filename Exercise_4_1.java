import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.event.*;
import javax.swing.JOptionPane; 
import javafx.scene.control.TextField;

public class  Exercise_4_1 extends Application 
{
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage)
	{
		String correctUsername = "Evan";
		String correctPassword = "12345";
		primaryStage.setTitle("Authentication");
		TextField usernameTxtFld = new TextField();
		TextField passwordTxtFld = new TextField();


		Button loginBtn = new Button("Login");
		loginBtn.setOnAction(new EventHandler<ActionEvent>()
		{
			String input = "Evan";
			String inputpw = "12345";
			@Override
			public void handle(ActionEvent arg0) 
			{
			if(correctUsername.equals(input) && correctPassword.equals(inputpw)) 
			{
			JOptionPane.showMessageDialog(null, "Welcome " + input + "!");
			} else {
			JOptionPane.showMessageDialog(null, "Wrong username!");
			}
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(usernameTxtFld);
		root.getChildren().add(passwordTxtFld);
		root.getChildren().add(loginBtn);
		
		Scene scene = new Scene(root, 300,300);
		primaryStage.setScene(scene);

		primaryStage.show();
	}
}
