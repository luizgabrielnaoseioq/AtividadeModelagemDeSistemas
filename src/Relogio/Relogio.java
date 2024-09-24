package Relogio;

public class Relogio {
    private int horas;
    private int minutos;

    public Relogio() {
    }

    public void acertarRelogio(int horas, int minutos) {
        if (this.horas >= 0 && this.horas < 24 && this.minutos >= 0 && this.minutos < 60){
            this.horas = horas;
            this.minutos = minutos;
        } else {
            System.out.println("Horário inválido!!");
        }
    }
    public void avancarMinuto() {
        this.minutos++;
        if (this.minutos == 60){
            this.minutos = 0;
            this.horas++;
            if (this.horas == 24) {
                this.horas = 0;
            }
        }

    }
    public String exibirHora() {
        return String.format("%02d:%02d", this.horas, this.minutos);
    }
}
