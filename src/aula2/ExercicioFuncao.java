package aula2;

/*Faça uma função que receba dois valores como parâmetro e que o retorno seja do tipo booleano.
A função deve verificar se o primeiro número é divisível pelo segundo.
*/

public class ExercicioFuncao {
    public static void main(String[] args) {
        verificandoDivisivel( 10 , 2);
    }

    static void verificandoDivisivel(int num1, int num2){
        int resultado = num1 % num2;

        if (resultado == 0) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}

