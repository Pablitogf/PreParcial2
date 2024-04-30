module co.edu.uniquindio.parcial2.parcial2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.parcial2.parcial2 to javafx.fxml;
    exports co.edu.uniquindio.parcial2.parcial2;

    opens co.edu.uniquindio.parcial2.parcial2.controller;
    exports co.edu.uniquindio.parcial2.parcial2.controller;

    opens co.edu.uniquindio.parcial2.parcial2.viewController;
    exports co.edu.uniquindio.parcial2.parcial2.viewController;
}