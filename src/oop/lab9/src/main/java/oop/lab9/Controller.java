package oop.lab9;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.IOException;

public class Controller {
    @FXML
    public TextField first_operand;

    @FXML
    public TextField second_operand;

    @FXML
    public TextField result;

    @FXML
    public Button calculate;

    @FXML
    public Button clear;

    public void initialize() {
        result.setDisable(true);
    }

    public float calculate(float first, float second) {
        return first / second;
    }

    public void handleButton(javafx.scene.input.MouseEvent mouseEvent) throws IOException, UnluckyException {
        if (first_operand.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Complete the first field",
                    ButtonType.OK);
            alert.setTitle("IOException");
            alert.showAndWait();
            throw new IOException("Missing input value!");
        }

        if (!first_operand.getText().matches("[+-]?[0-9]*\\.?[0-9]+")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Complete the first field properly",
                    ButtonType.OK);
            alert.setTitle("IOException");
            alert.showAndWait();
            throw new IOException("Incompatible characters!");
        }

        if (second_operand.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Complete the second field",
                    ButtonType.OK);
            alert.setTitle("IOException");
            alert.showAndWait();
            throw new IOException("Missing input value!");
        }

        if (!second_operand.getText().matches("[-+]?[0-9]*\\.?[0-9]+")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Complete the second field properly",
                    ButtonType.OK);
            alert.setTitle("IOException");
            alert.showAndWait();
            throw new IOException("Incompatible characters!");
        }

        if (Float.parseFloat(second_operand.getText()) == 13.0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "The second operand is equal to 13",
                    ButtonType.OK);
            alert.setTitle("UnluckyException");
            alert.showAndWait();
            throw new UnluckyException("The second operand is equal to 13!");
        }

        Float computed_result = calculate(Float.parseFloat(first_operand.getText()), Float.parseFloat(second_operand.getText()));

        if (computed_result.isNaN() || computed_result.isInfinite()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Do not divide by zero",
                    ButtonType.OK);
            alert.setTitle("RuntimeException");
            alert.showAndWait();
            throw new RuntimeException("Division by zero!");
        }

        if (computed_result == 0.0f && !(Float.parseFloat(first_operand.getText()) == 0.0f)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Complete the fields with proper numbers",
                    ButtonType.OK);
            alert.setTitle("RuntimeException");
            alert.showAndWait();
            throw new RuntimeException("An error has occurred!");
        }

        result.setText(String.valueOf(computed_result));
    }

    public void handleClear(javafx.scene.input.MouseEvent mouseEvent) {
        first_operand.clear();
        second_operand.clear();
        result.clear();
    }
}