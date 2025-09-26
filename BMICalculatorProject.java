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
		buttonCalculate.setOnAction(e -> {
			try {	
				double weight = Double.parseDouble(weightField.getText().replace(',', '.'));
				double height = Double.parseDouble(heightField.getText().replace(',', '.'));

				double bmi = weight / (height * height);
				labelResult.setText(String.format("Your BMI is: %.2f", bmi));
			} catch (NumberFormatException ex) {
				labelResult.setText("Please enter valid numbers for weight and height");
			}
		});

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
