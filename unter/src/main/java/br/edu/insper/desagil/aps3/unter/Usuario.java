package br.edu.insper.desagil.aps3.unter;

public abstract class Usuario {
    private String CPF;
    private String nome;

    public Usuario (String CPF, String nome){
        this.CPF=CPF;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }
    abstract void  avalia (Corrida corrida, int nota);
}

