module com.mycompany.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.quizzapp to javafx.fxml;
    exports com.mycompany.quizzapp;
}
