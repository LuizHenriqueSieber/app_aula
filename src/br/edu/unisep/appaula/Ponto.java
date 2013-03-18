package br.edu.unisep.appaula;

public class Ponto {
    private int x;
    private int y;
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return this.x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distancia(Ponto outro){
        return Math.sqrt( Math.pow(outro.x - this.x, 2) + Math.pow(outro.y-this.y, 2) );
    }
    
}
