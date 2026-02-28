package br.com.credito.service;

import br.com.credito.handler.*;

public class FluxoAprovacaoService {
    public Validador montarFluxo() {

        Validador renda = new ValidadorRenda();
        Validador score = new ValidadorScore();
        Validador restricao = new ValidadorRestricao();
        Validador aprovador = new AprovadorFinal();

        renda.setProximo(score);
        score.setProximo(restricao);
        restricao.setProximo(aprovador);

        return renda;
    }
}
