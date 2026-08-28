module drospirenona.gestionhorarioss {
    requires javafx.controls;
    requires javafx.fxml;


    opens drospirenona.gestionhorarioss to javafx.fxml;
    exports drospirenona.gestionhorarioss;
}