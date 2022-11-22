module com.poli.elementsattack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.poli.elementsattack to javafx.fxml;
    exports com.poli.elementsattack;
    exports com.poli.elementsattack.models;
    opens com.poli.elementsattack.models to javafx.fxml;
}