package br.com.credito.handler;

import br.com.credito.model.Cliente;

public class AprovadorFinal extends Validador{

    @Override
    public boolean validar(Cliente cliente) {
        System.out.println("Crédito aprovado para " + cliente.getNome());
        return true;
    }
}
