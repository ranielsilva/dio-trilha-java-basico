package edu.raniel.controle_de_fluxo_estruturas_condicionais;

public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "P";

        switch (sigla){
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIA");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");

        }
    }
}
