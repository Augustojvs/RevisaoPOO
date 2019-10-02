
package Circulo;


public class Circulo {
    private int x;
    private int y;
    private double raio;
    
    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    public double calculaPerimetro(){
        return 2 * Math.PI * this.raio;
    }
    public void moveX(int x){
        this.x += x;
    }
    public void moveY(int y){
        this.y += y;
    }
    public void aumenta(int r){
        this.raio += r;
    }
    public void aumenta(double r){
        this.raio *= r;
    }
    public String exibe(){
        return "Centro: (" + this.x + "," + this.y + ")" + "\nRaio: " + this.raio + "\nArea: " + this.calculaArea() + "\nPerimetro: " + this.calculaPerimetro(); 
    }
    public Circulo(int x, int y, double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }
}
