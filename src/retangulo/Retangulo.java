package retangulo;

public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = 0;
        this.largura = 0;
    }

    public Retangulo() {

    }

    public double calculaArea() {
        return (this.largura * this.altura) / 2;
    }
    public double calculaPerimetro(){
        return this.largura + this.altura * 2;
    }
    public String imprime(){
        return "o valor da base e: " + this.largura + " \ne o valor da altura e: " + this.altura + " \na area e: " + this.calculaArea() + " \no perimetro e: " + this.calculaPerimetro();
    }
    

}
