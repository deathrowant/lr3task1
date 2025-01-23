package ru.antipov.lr3task1;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField numberMField;

    @FXML
    private TextField numberNField;

    @FXML
    private Button checkButton;

    @FXML
    private Label resultLabel;

    @FXML
    public void checkDivision() {
        try {
            int m = Integer.parseInt(numberMField.getText());
            int n = Integer.parseInt(numberNField.getText());

            if (n == 0) {
                resultLabel.setText("На ноль делить нельзя!");
            } else if (m % n == 0) {
                int quotient = m / n;
                resultLabel.setText("Частное: " + quotient);
            } else {
                resultLabel.setText("M на N нацело не делится");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Некорректный ввод чисел");
        }
    }
}