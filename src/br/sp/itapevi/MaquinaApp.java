package br.sp.itapevi;
import br.sp.itapevi.model.MaquinaDeVendas;

public class MaquinaApp{

    public static void main(String[] args) {
        System.out.println("Iniciando Programa...");

        MaquinaDeVendas maquina = new MaquinaDeVendas();

        maquina.obterDadosDeVendas();

    }




}