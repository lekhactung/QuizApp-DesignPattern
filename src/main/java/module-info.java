module com.mycompany.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.quizzapp to javafx.fxml;
    exports com.mycompany.quizzapp;
}
