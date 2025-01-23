module ru.antipov.lr3task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.antipov.lr3task1 to javafx.fxml;
    exports ru.antipov.lr3task1;
}