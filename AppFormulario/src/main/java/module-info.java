module com.example.appformulario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires lombok;
    requires java.desktop;

    opens com.example.appformulario to javafx.fxml;
    exports com.example.appformulario;
    exports com.example.appformulario.controler;
    opens com.example.appformulario.controler to javafx.fxml;

    exports com.example.appformulario.model;
    opens com.example.appformulario.model to lombok;
}