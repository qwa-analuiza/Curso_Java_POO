module com.educandoweb.workshopjavafcjdbc {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.educandoweb.workshopjavafcjdbc.gui to javafx.fxml;

    exports com.educandoweb.workshopjavafcjdbc;
}