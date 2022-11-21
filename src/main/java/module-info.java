module com.example.trafficlight_syed {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.trafficlight_syed to javafx.fxml;
    exports com.example.trafficlight_syed;
}