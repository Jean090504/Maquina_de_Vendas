import java.util.Scanner;

public class MaquinaDeVendas{

    private int bebidaEscolhida;

    public void EntradaDeBebida(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da Bebida: ");
        bebidaEscolhida = sc.nextInt();

        String[] menu = {"Chocolate", "Café", "Chá", "Água", "Suco"};

        switch (bebidaEscolhida) {
            case 1:
                System.out.println(menu[0]);
                break;

            case 2:
                System.out.println(menu[1]);
                break;

            case 3:
                System.out.println(menu[2]);
                break;

            case 4:
                System.out.println(menu[3]);
                break;

            case 5:
                System.out.println(menu[4]);
                break;

            default: System.out.print("Comando Inválido");
                break;
        }



    }



}