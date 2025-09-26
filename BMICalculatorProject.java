import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class BMICalculatorProject extends Application {

	@Override
	public void start(Stage stage) {
		//Labels for input fields.
		Label weightLabel = new Label("Weight");
		Label heightLabel = new Label("Height");

		//Text fields for data entry.
		TextField weightField = new TextField();
		weightField.setPromptText("Weight in kg");
		TextField heightField = new TextField();
		heightField.setPromptText("Height in meters");

		//Label to show BMI result
		Label labelResult = new Label();

		//Button to calculate BMI.
		Button buttonCalculate = new Button("Calculate BMI");
		
		//Vertical layout
		VBox layout = new VBox(10, weightLabel, weightField, heightLabel, heightField, buttonCalculate, labelResult);
		layout.setPadding(new Insets(10));
		layout.setAlignment(Pos.CENTER);

		//Scene and stage
		Scene scene = new Scene(layout, 350 ,250);
		stage.setTitle("BMI calculator");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);	
	}
}
