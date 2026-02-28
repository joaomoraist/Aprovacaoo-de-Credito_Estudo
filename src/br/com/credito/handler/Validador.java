package br.com.credito.handler;

import br.com.credito.model.Cliente;

public abstract class Validador {

    protected Validador proximo;

    public void setProximo(Validador proximo){
        this.proximo = proximo;
    }

    public abstract boolean validar(Cliente cliente);

    protected boolean proximo(Cliente cliente) {
        if (proximo == null) {
            return true;
        }
        return proximo.validar(cliente);
    }
}
