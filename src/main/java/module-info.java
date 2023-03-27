module com.example.frank_uge13_mandag {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.frank_uge13_mandag to javafx.fxml;
    exports com.example.frank_uge13_mandag;
}