package br.edu.insper.desagil.aps3.unter;

public class Motorista extends Usuario{
    public Motorista (String CPF, String nome){
        super(CPF, nome);
    }

    @Override
    void avalia (Corrida corrida, int nota){
        corrida.avaliaPassageiro(nota);

    }
}
