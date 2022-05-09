module pl.lublin.wsei.java.cwiczenia.lab4a {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia.lab4a to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab4a;
}