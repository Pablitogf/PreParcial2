package co.edu.uniquindio.parcial2.parcial2.viewController;

import co.edu.uniquindio.parcial2.parcial2.model.Objeto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ObjetoViewController {

    ObjetoViewController objetoViewController;
    Objeto objetoSeleccinado;
    ObservableList<Objeto> listaObjetos = FXCollections.observableArrayList();

    @FXML
    private Button btnAccion1;

    @FXML
    private Button btnAccion2;

    @FXML
    private Button btnAccion3;

    @FXML
    private Button btnAccion4;

    @FXML
    private TextField txtAccion1;

    @FXML
    private TextField txtAccion2;

    @FXML
    private TextField txtAccion3;

    @FXML
    private TextField txtAccion4;


    @FXML
    void onAccion1(ActionEvent event) {
        ObjetosMasPrestados();
    }

    @FXML
    void onAccion2(ActionEvent event) {

    }

    @FXML
    void onAccion3(ActionEvent event) {

    }

    @FXML
    void onAccion4(ActionEvent event) {

    }

}
