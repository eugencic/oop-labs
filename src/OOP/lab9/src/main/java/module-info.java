module oop.lab9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens oop.lab9 to javafx.fxml;
    exports oop.lab9;
}