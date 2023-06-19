module com.example.onemoretest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.onemoretest to javafx.fxml;
    exports com.example.onemoretest;
}