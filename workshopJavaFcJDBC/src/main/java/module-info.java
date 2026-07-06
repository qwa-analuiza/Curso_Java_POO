module com.educandoweb.workshopjavafcjdbc {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.educandoweb.workshopjavafcjdbc.gui to javafx.fxml;
    opens com.educandoweb.workshopjavafcjdbc.model.entities to javafx.base;

    exports com.educandoweb.workshopjavafcjdbc;
}