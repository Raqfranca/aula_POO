package aula2;

import java.util.Scanner;

/*
Exercício 1

Faça uma função que, dado um número, indica se é um número primo ou não.

Um número primo é aquele que só pode ser dividido por 1 e ele mesmo.
Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25.
Já o númeor 17 é primo porque só pode ser dividido por 1 e por 17.

Para usar esta função que iremos criar, podemos permitir a entrada de apenas um número do usuário para verificar
se o número é primo ou não.
Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona,
Boolean eDivisível (int n, int divisor).
 */
/*
Exercício 2

Escreva uma função que receba três números e retorne o maior valor entre os três números.
Em seguida, faça um programa que permita a entrada de 3 valores pelo usuário, use a função e exiba o resultado.

*/
public class MesaTrabalho {
    public static void main(String[] args) {
        verificandoPrimo( 11);
        qualMaior(10,35,30);

        Scanner scanner;
        scanner = new Scanner(System.in);

        int numUsuario1;
        int numUsuario2;
        int numUsuario3;

        System.out.println("Insira o primeiro valor");
        numUsuario1= scanner.nextInt();
        System.out.println("Insira o segundo valor");
        numUsuario2= scanner.nextInt();
        System.out.println("Insira o segundo valor");
        numUsuario3= scanner.nextInt();

        System.out.println("Os valores escolidos pelo usuário são: " + numUsuario1 +", " + numUsuario2 + " e " + numUsuario3 + ".");
    }

    private static void verificandoPrimo(int num1){
        for (int j = 2; j < num1; j++) {
            if (num1 % j == 0)
               System.out.println("Não primo");
        } System.out.println("Primo");
    }

    private static void qualMaior(int numero1, int numero2, int numero3) {
        if ((numero1 > numero2) && (numero1 > numero3)) {
            System.out.println(numero1 + " é o maior números dos 3");
        }
        if ((numero2 > numero1) && (numero2 > numero3)) {
            System.out.println(numero2 + " é o maior número dos 3");
        }else {
            System.out.println((numero3 + " é o maior número dos 3"));
        }
    }
}





