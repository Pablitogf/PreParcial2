package co.edu.uniquindio.parcial2.parcial2.viewController;

import co.edu.uniquindio.parcial2.parcial2.controller.EmpleadoController;
import co.edu.uniquindio.parcial2.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.parcial2.model.Empleado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EmpleadoViweController {

    EmpleadoController empleadoController;
    Empleado empleadoSeleccionado;
    ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        empleadoController = new EmpleadoController();
        initTable();
        initSearch();
    }

    public void initTable(){
        initDataBinding();
        obtenerEmpleado();
        tbCliente.getItems().clear();
        tbCliente.setItems(listaEmpleados);
//        listenerSelection();
    }

    private void initSearch(){
        FilteredList<Empleado> filteredData = new FilteredList<Empleado>(listaEmpleados, b->true);
        txtSearchC.textProperty().addListener((ObservableList,oldValue,newValue)->{
            filteredData.setPredicate(empleadoSeleccionado ->{
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String loweCaseFilter = newValue.toLowerCase();
                if(empleadoSeleccionado.getCedula().toLowerCase().contains(loweCaseFilter)) {
                    return true;
                }else{
                    return false;
                }
            });
        });
        SortedList<Empleado> sortedData = new SortedList<Empleado>(filteredData);

        sortedData.comparatorProperty().bind(tbCliente.comparatorProperty());
        tbCliente.setItems(sortedData);
    }

    private void obtenerEmpleado(){
        listaEmpleados.clear();
        listaEmpleados.addAll(empleadoController.obtenerEmpleado());
    }

    private void initDataBinding() {
        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        colCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        colEdad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEdad()));
    }

    @FXML
    private Button btnRango;

    @FXML
    private TableColumn<Cliente, String> colApellido;

    @FXML
    private TableColumn<Cliente, String> colCedula;

    @FXML
    private TableColumn<Cliente, String> colEdad;

    @FXML
    private TableColumn<Cliente, String> colNombre;

    @FXML
    private TableView<Cliente> tbCliente;

    @FXML
    private TextField txtRango;

    @FXML
    private TextField txtSearchC;

    @FXML
    void onObtenerObjetos(ActionEvent event) {
        listaEmpleados.clear();
        listaEmpleados.addAll(empleadoController.obtenerPrestamosClientes(Integer.parseInt(txtRango.getText())));
    }
}
