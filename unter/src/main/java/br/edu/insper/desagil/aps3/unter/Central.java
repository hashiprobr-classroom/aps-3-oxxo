package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List <Corrida> corridas;

    public Central (){
        this.corridas= new ArrayList<>();
    }
    public void adiciona (Corrida corrida){
        corridas.add(corrida);
    }

    public double mediaPassageiro(String CPF){
        int s=0;
        int t=0;

        for (Corrida corrida:corridas){
            if (corrida.getPassageiro().getCPF().equals(CPF)){
                int nota= corrida.getNotaPassageiro();
                if (nota !=0){
                    s+=nota;
                    t++;
                }
            }
        }

        double r= s/t;

        return r;

    }


}
