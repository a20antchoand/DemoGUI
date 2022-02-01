module com.example.demogui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.demogui to javafx.fxml;
    exports com.example.demogui;
    exports com.example.demogui.controladores;
    opens com.example.demogui.controladores to javafx.fxml;
}