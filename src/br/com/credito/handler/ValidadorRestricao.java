package br.com.credito.handler;

import br.com.credito.model.Cliente;

public class ValidadorRestricao extends Validador {

    @Override
    public boolean validar(Cliente cliente) {
        if (cliente.isPossuiRestricao()){
            System.out.println("Crédito negado: Cliente com restrição!");
            return false;
        }
        return proximo(cliente);
    }
}
