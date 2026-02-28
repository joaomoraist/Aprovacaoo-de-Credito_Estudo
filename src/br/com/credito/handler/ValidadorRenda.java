package br.com.credito.handler;

import br.com.credito.model.Cliente;

public class ValidadorRenda extends Validador{
    @Override
    public boolean validar(Cliente cliente) {
        if (cliente.getRenda() < 2000){
            System.out.println("Crédito negado: Renda insuficiente!");
            return false;
        }
        return proximo(cliente);
    }
}
