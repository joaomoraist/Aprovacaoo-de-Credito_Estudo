package br.com.credito.handler;

import br.com.credito.model.Cliente;

public class ValidadorScore extends Validador{
    @Override
    public boolean validar(Cliente cliente) {
        if (cliente.getScore() < 600 ) {
            System.out.println("Crédito negado: Score baixo!");
            return false;
        }
        return proximo(cliente);
    }
}
