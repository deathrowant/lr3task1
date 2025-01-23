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
            int number = Integer.parseInt(numberTextField.getText());
            int result;

            if (number > 0) {
                result = number - 8;
            } else {
                result = number;
            }
            resultLabel.setText("Результат: " + result);

        } catch (NumberFormatException e) {
            resultLabel.setText("Некорректный ввод числа");
        }
    }
}