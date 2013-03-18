package br.edu.unisep.appaula;

import br.com.decarli.utilitarios.io.Console;
import br.com.decarli.utilitarios.util.Bhaskara;

public class App4 {
    public static void main(String[] args) {
        Bhaskara b = Bhaskara.calcularBhaskara(-2, -2, 5);
        
        Console.escreverln( "X1 = " + b.getX1() );
        Console.escreverln( "X2 = " + b.getX2() );
        
        
        Bhaskara bha = new Bhaskara();
        Console.escreverln("Antes...");
        Console.escreverln( "X1 = " + bha.getX1() );
        Console.escreverln( "X2 = " + bha.getX2() );
        
        
        Bhaskara.calcularBhaskara(-2, -2, 5, bha);
        
        Console.escreverln("Depois...");
        Console.escreverln( "X1 = " + bha.getX1() );
        Console.escreverln( "X2 = " + bha.getX2() );
    }
}
