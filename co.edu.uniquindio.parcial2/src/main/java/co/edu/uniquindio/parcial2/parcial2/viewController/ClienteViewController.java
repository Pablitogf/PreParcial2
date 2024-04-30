package co.edu.uniquindio.parcial2.parcial2.viewController;

import co.edu.uniquindio.parcial2.parcial2.controller.ClienteController;
import co.edu.uniquindio.parcial2.parcial2.model.Cliente;
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

public class ClienteViewController {
    ClienteController clienteController;
    Cliente clienteSeleccionado;
    ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        clienteController = new ClienteController();
        initTable();
        initSearch();
    }

    private void initTable() {
        initDataBinding();
        obtenerCliente();
        tbCliente.getItems().clear();
        tbCliente.setItems(listaClientes);
//        listenerSelection();
    }

    private void initSearch(){
        FilteredList<Cliente> filteredData = new FilteredList<Cliente>(listaClientes, b->true);
        txtSearchC.textProperty().addListener((ObservableList,oldValue,newValue)->{
            filteredData.setPredicate(clienteSeleccionado ->{
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String loweCaseFilter = newValue.toLowerCase();
                if(clienteSeleccionado.getCedula().toLowerCase().contains(loweCaseFilter)) {
                    return true;
                }else{
                    return false;
                }
            });
        });
        SortedList<Cliente> sortedData = new SortedList<Cliente>(filteredData);

        sortedData.comparatorProperty().bind(tbCliente.comparatorProperty());
        tbCliente.setItems(sortedData);
    }

    private void obtenerCliente() {
        listaClientes.clear();
        listaClientes.addAll(clienteController.obtenerCliente());
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
        listaClientes.clear();
        listaClientes.addAll(clienteController.obtenerPrestamosClientes(Integer.parseInt(txtRango.getText())));
    }

}
