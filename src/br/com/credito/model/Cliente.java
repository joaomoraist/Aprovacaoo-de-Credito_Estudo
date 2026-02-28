package br.com.credito.model;

public class Cliente {

    private String nome;
    private double renda;
    private int score;
    private boolean possuiRestricao;

    public Cliente(String nome, double renda, int score, boolean possuiRestricao){
        this.nome = nome;
        this.renda = renda;
        this.score = score;
        this.possuiRestricao = possuiRestricao;
    }

    public String getNome(){return nome;}
    public double getRenda () {return renda;}
    public int getScore (){return score;}
    public boolean isPossuiRestricao (){return possuiRestricao;}
}
