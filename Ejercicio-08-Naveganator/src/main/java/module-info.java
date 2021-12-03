module com.dynmate.naveganator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.dynmate.naveganator to javafx.fxml;
    exports com.dynmate.naveganator;
}