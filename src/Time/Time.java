
package Time;


public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public Time() {
    }

    public Time(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Time(int hora) {
        this.hora = hora;
    }

    public Time(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    public String setTime(){
        if (this.hora < 0 || this.hora >= 23) {
            System.out.println("hora invalida");
        }
        if (this.minuto < 0 || this.minuto >= 59) {
            System.out.println("minuto invalido");
        }
        if (this.segundo < 0 || this.minuto >= 59) {
            System.out.println("segundos invalidos");
        }
        
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
    public String imprime(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
    
}
