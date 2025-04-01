module br.com.simulador.simuladordetransito {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens br.com.simulador.simuladordetransito to javafx.fxml;
    exports br.com.simulador.simuladordetransito;
    exports br.com.simulador.simuladordetransito.controller;
    opens br.com.simulador.simuladordetransito.controller to javafx.fxml;
}