module com.example.apworkshop11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.apworkshop11 to javafx.fxml;
    exports com.example.apworkshop11;
}