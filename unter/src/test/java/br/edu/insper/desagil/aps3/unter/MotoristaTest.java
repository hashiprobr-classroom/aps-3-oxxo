package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {

    private Corrida corrida;
    private Motorista motorista;

    @BeforeEach
    void setUp() {
        Passageiro passageiro = new Passageiro("123", "maria");
        corrida= new Corrida(passageiro);
        motorista=new Motorista("456", "bruno");
    }

    @Test
    void constroi (){
        assertEquals("456", motorista.getCPF());
        assertEquals("bruno", motorista.getNome());
    }

    @Test
    void mudaNome (){
        motorista.setNome("joao");
        assertEquals("joao", motorista.getNome());
    }

    @Test
    void avalia (){
        motorista.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaPassageiro());

    }
    @Test
    void avaliaBaixo (){
        motorista.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaPassageiro());

    }

    @Test
    void avaliaAlto (){
        motorista.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaPassageiro());

    }
}
