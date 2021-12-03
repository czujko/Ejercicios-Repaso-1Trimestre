module com.dynmate.ejercicio02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dynmate.ejercicio02 to javafx.fxml;
    exports com.dynmate.ejercicio02;
}