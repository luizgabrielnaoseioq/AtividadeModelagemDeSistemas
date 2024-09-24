package Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carrinho = new Carro();
        carrinho.definirVelocidade();
        carrinho.acelerar(10);
        carrinho.freiar(5);
        carrinho.exibirVelocidade();
    }
}
