package edu.raniel.controle_de_fluxo_estruturas_condicionais;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //B/ M /T;

        switch (plano){
            case "T":
                System.out.println("5G Youtube");
                //break;
            case "M":
                System.out.println("Whats e Intagram grátis");
                //break;
            case "B":
                System.out.println("100 minutis de ligação");
                //break;

            /* O USO DO BREAK SE TORNE MENOS EFICINTE
               QUANDO SE É NECESSÁRIO QUE AS OUTRAS MENSAGENS SEJA EXIBIDAS
               EM SEQUÊNCIA
                */
        }
    }
}
