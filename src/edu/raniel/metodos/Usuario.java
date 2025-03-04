package edu.raniel.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();


        System.out.println("Canal atual " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal aumentado em +1: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal diminuido em -1: " + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Novo canal " + smartTv.canal);

        System.out.println();

        System.out.println("Tv ligada  ? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Status depois da chamada do método Ligar -> Tv ligada  ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Status depois da chamada do método Desligar -> Tv ligada  ? " + smartTv.ligada);

        System.out.println();

        System.out.println("Volume Inicial " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual (após as chamadas dos métodos) " + smartTv.volume);

    }


}
