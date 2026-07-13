module com.educandoweb.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.educandoweb.javafx to javafx.fxml;
    exports com.educandoweb.javafx;
    exports com.educandoweb.javafx.gui;
    opens com.educandoweb.javafx.gui to javafx.fxml;
}