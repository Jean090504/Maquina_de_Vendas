package br.sp.itapevi.maquinavendas;
import br.sp.itapevi.maquinavendas.model.MaquinaDeVendas;

public class MaquinaApp{

    public static void main(String[] args) {
        System.out.println("Iniciando Programa...");

        MaquinaDeVendas maquina = new MaquinaDeVendas();

        maquina.obterDadosDeVendas();

    }




}