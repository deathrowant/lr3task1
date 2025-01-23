package ru.antipov.lr3task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField numberTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void processButtonOnAction(ActionEvent event) {
        try {
            float number = Float.parseFloat(numberTextField.getText());
            float result = number - 8;
            resultLabel.setText("Результат: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Некорректный ввод числа");
        }
    }
}