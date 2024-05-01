package co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.model;

import co.edu.uniquindio.parcial2.parcial2.patronesRepaso.command.services.Command;

public class EntregaLocalCommand implements Command {
    private Receptor receptor;
    public EntregaLocalCommand(Receptor receptor) {
        this.receptor = receptor;
    }
    @Override
    public void execute() {
        receptor.realizarEntregaLocal();
    }
}
