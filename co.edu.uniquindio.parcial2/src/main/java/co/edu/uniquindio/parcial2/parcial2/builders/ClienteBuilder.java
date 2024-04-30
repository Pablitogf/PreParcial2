package co.edu.uniquindio.parcial2.parcial2.builders;

import co.edu.uniquindio.parcial2.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.parcial2.model.Prestamo;
import java.util.List;

public class ClienteBuilder extends PersonaBuilder<ClienteBuilder> {


    @Override
    public Cliente build() {
        return new Cliente(nombre, apellido, cedula, edad);
    }

}
