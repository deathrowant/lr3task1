module ru.antipov.lr3task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.antipov.lr3task3 to javafx.fxml;
    exports ru.antipov.lr3task3;
}