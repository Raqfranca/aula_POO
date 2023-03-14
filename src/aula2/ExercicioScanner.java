package aula2;

import java.util.Scanner;

/*Escreva um programa Java que solicite um nome e um sobrenome separadamente, e a partir dessas variáveis,
você deve obter uma terceira variável com as iniciais.

Imprima o nome, o sobrenome e as iniciais no console do IntelliJ.*/

public class ExercicioScanner {
    public static void main(String[] args){

        String nome;
        String sobrenome;
        String siglaNome = "";
        String siglaSobrenome = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = scanner.next();

        System.out.println("Qual o seu sobrenome?");
        sobrenome = scanner.next();


        for (char letra : nome.toCharArray()) {
            if (Character.isUpperCase(letra)) {
                siglaNome += letra;
            }
        }

        for (char letra : sobrenome.toCharArray()) {
            if (Character.isUpperCase(letra)) {
                siglaSobrenome += letra;
            }
        }

        System.out.println("A sigla do seu nome é: " + siglaNome + siglaSobrenome + ".");


    }
}
