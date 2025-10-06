package br.sp.itapevi.maquinavendas.model;

import java.util.Scanner;

public class MaquinaDeVendas {

    private int vendaEscolhida;
    private double totalCompra = 0.0;
    private Scanner sc = new Scanner(System.in);

    public void obterDadosDeVendas() {

        boolean continuarComprando = true;

        while (continuarComprando) {
            System.out.println("----------------------------");
            System.out.println("------Máquina de Vendas-----");
            System.out.println("----------------------------");
            System.out.println();
            System.out.println("1. Salgado");
            System.out.println("2. Doce");
            System.out.println("3. Bebida");
            System.out.println("4. Finalizar Compra");
            System.out.println();

            System.out.print("Digite qual categoria gostaria de comprar: ");
            vendaEscolhida = sc.nextInt();

            switch (vendaEscolhida) {
                case 1 -> realizarVendaDeSalgados();
                case 2 -> realizarVendasDeDoces();
                case 3 -> realizarVendasDeBebidas();
                case 4 -> {
                    continuarComprando = false;
                    finalizarCompra();
                }
                default -> System.out.println("Comando Inválido!");
            }
        }
    }

    private void realizarVendaDeSalgados() {
        String[] menuSalgados = {"Kibe", "Pão de Queijo", "Beirute", "Coxinha"};
        double[] precoSalgados = {5.00, 4.50, 9.00, 6.00};

        System.out.println("----------------------------");
        System.out.println("----------Salgados----------");
        System.out.println("----------------------------");
        for (int i = 0; i < menuSalgados.length; i++) {
            System.out.println((i + 1) + " - " + menuSalgados[i] + " - R$ " + String.format("%.2f", precoSalgados[i]));
        }

        System.out.print("Digite o número do salgado que deseja comprar: ");
        int escolha = sc.nextInt();

        if (escolha >= 1 && escolha <= menuSalgados.length) {
            System.out.println("Você adicionou ao carrinho: " + menuSalgados[escolha - 1] +
                    " por R$ " + String.format("%.2f", precoSalgados[escolha - 1]));
            totalCompra += precoSalgados[escolha - 1];
        } else {
            System.out.println("Escolha inválida!");
        }
    }

    private void realizarVendasDeDoces() {
        String[] menuDoces = {"Mousse", "Torta de Limão", "Torta Holandesa", "Brigadeiro"};
        double[] precoDoces = {6.50, 7.00, 8.00, 3.00};

        System.out.println("----------------------------");
        System.out.println("-----------Doces------------");
        System.out.println("----------------------------");
        for (int i = 0; i < menuDoces.length; i++) {
            System.out.println((i + 1) + " - " + menuDoces[i] + " - R$ " + String.format("%.2f", precoDoces[i]));
        }

        System.out.print("Digite o número do doce que deseja comprar: ");
        int escolha = sc.nextInt();

        if (escolha >= 1 && escolha <= menuDoces.length) {
            System.out.println("Você adicionou ao carrinho: " + menuDoces[escolha - 1] +
                    " por R$ " + String.format("%.2f", precoDoces[escolha - 1]));
            totalCompra += precoDoces[escolha - 1];
        } else {
            System.out.println("Escolha inválida!");
        }
    }

    private void realizarVendasDeBebidas() {
        String[] menuBebidas = {"Chá", "Café", "Coca-Cola", "Sprite"};
        double[] precoBebidas = {3.00, 4.00, 6.00, 5.50};

        System.out.println("----------------------------");
        System.out.println("----------Bebidas-----------");
        System.out.println("----------------------------");
        for (int i = 0; i < menuBebidas.length; i++) {
            System.out.println((i + 1) + " - " + menuBebidas[i] + " - R$ " + String.format("%.2f", precoBebidas[i]));
        }

        System.out.print("Digite o número da bebida que deseja comprar: ");
        int escolha = sc.nextInt();

        if (escolha >= 1 && escolha <= menuBebidas.length) {
            System.out.println("Você adicionou ao carrinho: " + menuBebidas[escolha - 1] +
                    " por R$ " + String.format("%.2f", precoBebidas[escolha - 1]));
            totalCompra += precoBebidas[escolha - 1];
        } else {
            System.out.println("Escolha inválida!");
        }
    }

    private void finalizarCompra() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Total da compra: R$ " + String.format("%.2f", totalCompra));
        System.out.println("Obrigado pela compra!");
        System.out.println("Volte sempre!");
    }
}
