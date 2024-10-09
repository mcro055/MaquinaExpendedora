module com.example.maquina_expendedora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maquina_expendedora to javafx.fxml;
    exports com.example.maquina_expendedora;
}