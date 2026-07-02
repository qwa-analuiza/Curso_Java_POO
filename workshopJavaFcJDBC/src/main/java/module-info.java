module com.educandoweb.workshopjavafcjdbc {

    requires javafx.controls;
    requires javafx.fxml;

    exports com.educandoweb.workshopjavafcjdbc;
    opens com.educandoweb.workshopjavafcjdbc to javafx.fxml;
}