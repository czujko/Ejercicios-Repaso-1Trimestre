module com.dynmate.ejercicio02extra {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dynmate.ejercicio02extra to javafx.fxml;
    exports com.dynmate.ejercicio02extra;
}