package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.services.Command;

public class EntregaInternacionalCommand implements Command {
    private Receptor receptor;

    public EntregaInternacionalCommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaInternacional();
    }
}
