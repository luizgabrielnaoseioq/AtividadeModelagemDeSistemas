package Relogio;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.acertarRelogio(23, 59);
        System.out.println("Hora atual: " + relogio.exibirHora());

        relogio.avancarMinuto();
        System.out.println("Hora após avançar um minuto: " + relogio.exibirHora());
    }

}
