package aula2;

public class ExercicioTidoDados {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Olá");
        }

        //Exercício 1

        int numero1 = 10;
        int numero2 = 2;

        System.out.println("O resultado da divisão do númeoro " + numero1 + " por " + numero2 + " é igual a " + numero1/numero2);


        //Exercício 2

        //Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais. Mostre o resultado obtido.

        Integer valor1 = 15;
        Integer valor2 = 20;
        Integer comparar;

        if (valor1.equals(valor2)){
            System.out.println("Os valores são iguais");
        }else
        { comparar=valor1.compareTo(valor2);
            if (comparar>0)
                System.out.println("Valor 1 é maior que valor 2" );
            else System.out.println("Valor 2 é maior que valor 1");
        }

    }
}


