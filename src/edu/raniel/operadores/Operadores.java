package edu.raniel.operadores;

public class Operadores {
    public static void main(String[] args) {
        int soma = 5 + 5;
        int subtracao = 5 - 2;
        double divisao = 2 / 15;
        int multiplicacao = 5 * 5;
        double modulo = 18 % 9;

        //OPERADOR TERNÁRIO
        int a,b;
        a = 5;
        b = 4;

        String resultado = a==b ? "Verdadeira" : "Falso";
        System.out.println(resultado);

        // OPERADORES RELACIONAIS
        int numero1,numero2;
        numero1 = 5;
        numero2 = 6;
        boolean simNao = numero1 == numero2;

        System.out.println("número 1 é igual a número 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("número 1 é diferente a número 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("número 1 é maior que número 2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("número 1 é menor que número 2? " + simNao);

        //OPERADORES RELACIONAIS COM STRINGS
        String nome1 = "Raniel";
        String nome2 = new String("Raniel");

        //.equals ultilizado para comparações de conteúdos de dois objetos
        System.out.println(nome1.equals(nome2));

        //OPERADORES LÓGICOS
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }


    }

}
