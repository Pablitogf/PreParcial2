module co.edu.uniquindio.parcial2.parcial2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.parcial2.parcial2 to javafx.fxml;
    exports co.edu.uniquindio.parcial2.parcial2;

    exports co.edu.uniquindio.parcial2.parcial2.Controller;
    opens co.edu.uniquindio.parcial2.parcial2.Controller;
}