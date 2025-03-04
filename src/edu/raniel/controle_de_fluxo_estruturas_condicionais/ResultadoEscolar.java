package edu.raniel.controle_de_fluxo_estruturas_condicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        /*
        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");

         else
            System.out.println("Reprovado");


         */

        //CONDIÇÃO TERNÁRIA

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperaçao" : "Reprovado";
        System.out.println(resultado);
    }
}
