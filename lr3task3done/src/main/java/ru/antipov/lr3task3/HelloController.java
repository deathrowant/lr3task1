package ru.antipov.lr3task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField num1TextField;

    @FXML
    private TextField num2TextField;

    @FXML
    private TextField num3TextField;

    @FXML
    private TextField num4TextField;

    @FXML
    private Label resultLabel;

    @FXML
    void findUniqueButtonOnAction(ActionEvent event) {
        try {
            int num1 = Integer.parseInt(num1TextField.getText());
            int num2 = Integer.parseInt(num2TextField.getText());
            int num3 = Integer.parseInt(num3TextField.getText());
            int num4 = Integer.parseInt(num4TextField.getText());

            int uniqueIndex = findUnique(num1, num2, num3, num4);
            if (uniqueIndex != -1) {
                resultLabel.setText("Номер уникального числа: " + (uniqueIndex + 1));
            } else {
                resultLabel.setText("Нет уникального числа");
            }

        } catch (NumberFormatException e) {
            resultLabel.setText("Некорректный ввод чисел");
        }
    }

    private int findUnique(int num1, int num2, int num3, int num4) {
        if (num1 == num2 && num1 == num3) {
            return (num1 == num4)? -1 : 3 ; //num4
        }
        if (num1 == num2 && num1 == num4) {
            return (num1 == num3) ? -1 : 2 ; //num3
        }
        if (num1 == num3 && num1 == num4) {
            return (num1 == num2) ? -1 : 1 ; //num2
        }
        if (num2 == num3 && num2 == num4) {
            return (num2 == num1) ? -1 : 0 ; //num1
        }
        return -1;
    }
}