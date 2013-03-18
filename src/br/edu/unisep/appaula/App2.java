/*
 Distância entre dois pontos do plano
 * 
 */
package br.edu.unisep.appaula;

import br.com.decarli.utilitarios.io.Console;

public class App2 {
    public static void main(String[] args) {
        Console.escrever("Digite a coordenada X do primeiro ponto: ");
        String _x1 = Console.ler();
        Console.escrever("Digite a coordenada Y de primeiro ponto: ");
        String _y1 = Console.ler();
        
        Console.escrever("Digite a coordenada X do segundo ponto: ");
        String _x2 = Console.ler();
        Console.escrever("Digite a coordenada Y de segundo ponto: ");
        String _y2 = Console.ler();
        
        int x1 = Integer.parseInt(_x1);
        int y1 = Integer.parseInt(_y1);
        Ponto pontoA = new Ponto(x1, y1);
        
        int x2 = Integer.parseInt(_x2);
        int y2 = Integer.parseInt(_y2);
        Ponto pontoB = new Ponto(x2, y2);
        
        double distanciaAB = pontoA.distancia(pontoB);
        
        Console.escreverln("Distancia AB = " + distanciaAB);
        
    }
}
