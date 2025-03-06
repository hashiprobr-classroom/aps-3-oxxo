package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private Central central;

    @BeforeEach
    void setUp() {
        central= new Central();

    }

    @Test
    void nenhumaAvaliacaoPassageiro (){
        assertEquals(0.0, central.mediaPassageiro("111"));
    }
    @Test
    void nenhumaAvaliacaoMotorista (){
        assertEquals(0.0, central.mediaMotorista("111"));
    }

    @Test
    void avaliacoesPassageiro (){
        Passageiro passageiro= new Passageiro("222", "carlos");

        Corrida corrida1= new Corrida(passageiro);
        central.adiciona(corrida1);

        Corrida corrida2= new Corrida(passageiro);
        corrida2.avaliaPassageiro(4);
        central.adiciona(corrida2);

        Corrida corrida3= new Corrida(passageiro);
        corrida3.avaliaPassageiro(5);
        central.adiciona(corrida3);

        Passageiro p= new Passageiro("1", "a");
        Corrida corrida4= new Corrida(p);
        corrida4.avaliaPassageiro(3);
        central.adiciona(corrida4);

        assertEquals(4.5, central.mediaPassageiro("222"));
    }
    @Test
    void avaliacoesMotorista (){
        Passageiro passageiro= new Passageiro("222", "carlos");
        Motorista motorista= new Motorista("333", "george");

        Corrida corrida1= new Corrida(passageiro);
        corrida1.setMotorista(motorista);
        central.adiciona(corrida1);

        Corrida corrida2= new Corrida(passageiro);
        corrida2.setMotorista(motorista);
        corrida2.avaliaMotorista(2);
        central.adiciona(corrida2);

        Corrida corrida3= new Corrida(passageiro);
        corrida3.setMotorista(motorista);
        corrida3.avaliaMotorista(3);
        central.adiciona(corrida3);

        Motorista m= new Motorista("1", "a");
        Corrida corrida4= new Corrida(passageiro);
        corrida4.setMotorista(m);
        corrida4.avaliaMotorista(1);
        central.adiciona(corrida4);

        Corrida corrida5= new Corrida(passageiro);
        corrida5.avaliaMotorista(1);


        assertEquals(2.5, central.mediaMotorista("333"));
    }

}
