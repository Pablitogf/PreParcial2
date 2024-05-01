package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.services.Command;

public class EntregaNacionalCommand implements Command {
    private Receptor receptor;

    public EntregaNacionalCommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaNacional();
    }
}