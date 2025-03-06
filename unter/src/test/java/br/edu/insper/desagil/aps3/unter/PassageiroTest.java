package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro passageiro;
    private Corrida corrida;

    @BeforeEach
    void setUp() {
        passageiro = new Passageiro("123", "maria");
        corrida= new Corrida(passageiro);
    }

    @Test
    void constroi (){
        assertEquals("123", passageiro.getCPF());
        assertEquals("maria", passageiro.getNome());
    }

    @Test
    void mudaNome (){
        passageiro.setNome("bia");
        assertEquals("bia", passageiro.getNome());
    }

    @Test
    void avalia (){
        passageiro.avalia(corrida, 3);
        assertEquals(3, corrida.getNotaMotorista());

    }
    @Test
    void avaliaBaixo (){
        passageiro.avalia(corrida, 0);
        assertEquals(1, corrida.getNotaMotorista());

    }

    @Test
    void avaliaAlto (){
        passageiro.avalia(corrida, 6);
        assertEquals(5, corrida.getNotaMotorista());

    }

}
