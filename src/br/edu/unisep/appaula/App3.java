/*
 Distância entre dois pontos do plano
 * 
 */
package br.edu.unisep.appaula;

import br.com.decarli.utilitarios.io.Console;
import br.com.decarli.utilitarios.validadores.StringUtils;
import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {
        
        Console.escrever("Digite as coordenada primeiro ponto [x,y]: ");
        String _p1 = Console.ler();
        String[] p1 = _p1.split(",");
        
        Console.escrever("Digite as coordenada segundo ponto [x,y]: ");
        String _p2 = Console.ler();
        String[] p2 = _p2.split(",");
        
        if( StringUtils.ehInteiro(p1[0]) && StringUtils.ehInteiro(p2[1])) {
            
        }
        
        
        
        int x1 = Integer.parseInt(p1[0]);
        int y1 = Integer.parseInt(p1[1]);
        Ponto pontoA = new Ponto(x1, y1);
        
        int x2 = Integer.parseInt(p2[0]);
        int y2 = Integer.parseInt(p2[1]);
        Ponto pontoB = new Ponto(x2, y2);
        
        double distanciaAB = pontoA.distancia(pontoB);
        
        Console.escreverln("Distancia AB = " + distanciaAB);
        
    }
}
