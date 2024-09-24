package Carro;

import java.util.Scanner;

public class Carro {
    private Double velocidadeAtual;
    private String marca;
    Scanner scanner = new Scanner(System.in);
    public void definirVelocidade(){
        System.out.println("Adicione a velocidade atual: ");
        velocidadeAtual = scanner.nextDouble();
    }
    public void acelerar (int valor) {
        if (valor >= 0) {
            this.velocidadeAtual += valor;
        } else {
            System.out.println("O valor é invalido!!");
        }
    }
    public void freiar (int valor) {
        if (valor >= 0) {
            velocidadeAtual -= valor;
        }
    }
    public String exibirVelocidade(){
        return ("A velocidade atual é:" + this.velocidadeAtual);
    }
}
