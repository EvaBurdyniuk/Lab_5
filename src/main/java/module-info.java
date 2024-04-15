module org.example.laboratornaeva {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.laboratornaeva to javafx.fxml;
    exports org.example.laboratornaeva;
}