module ru.antipov.lr3task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.antipov.lr3task2 to javafx.fxml;
    exports ru.antipov.lr3task2;
}