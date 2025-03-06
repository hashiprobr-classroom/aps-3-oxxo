package br.edu.insper.desagil.aps3.unter;
public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida (Passageiro passageiro){
        this.passageiro=passageiro;
        this.motorista= null;
        this.notaPassageiro=0;
        this.notaMotorista=0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    private int arredonda (int nota){
        int r=0;
        if (nota <1){
            r=1;
        }
        else if (nota>5){
            r=5;
        }
        else{
            r=nota;
        }
        return r;
    }

    public int avaliaPassageiro(int nota){
        int r= arredonda(notaPassageiro);
        return r;

    }

    public int avaliaMotorista(int nota){
        int r= arredonda(notaMotorista);
        return r;

    }

}
