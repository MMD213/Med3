module com.example.med {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.med to javafx.fxml;
    exports com.example.med;
}