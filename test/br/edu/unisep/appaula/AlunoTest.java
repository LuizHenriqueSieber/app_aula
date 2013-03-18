package br.edu.unisep.appaula;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class AlunoTest {
    Aluno al;
    
    @Before
    public void init(){
        al = new Aluno(1, "");
        al.setG1(1);
        al.setG2(10);
    }
    
    @Test
    public void calculaMedia(){
        assertEquals( 7, al.calculaMedia(), 0);
    }
    
    @Test
    public void nomeNullo(){
        assertEquals( "", al.getNome());
        assertEquals( 1, al.getRa());
    }
}
