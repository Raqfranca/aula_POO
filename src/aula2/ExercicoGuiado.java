package aula2;

import java.util.Scanner;

/*
Faça um programa Java que solicite do usuário seu nome e sobrenome separadamente, e a sua data de nascimento.
Para a data solicite que o usuário digite 3 valores que representam o dia, mês e ano.
Além disso, a partir das variáveis do nome e sobrenome obtenha em uma terceira com as iniciais do usuário.
Em seguida, exiba uma mensagem, com seu nome, as iniciais do seu nome e sobrenome e sua data de nascimento
no formato "dd / mm / aaaa".

*/
public class ExercicoGuiado {
    public static void main(String[] args){

        String nome;
        String sobrenome;
        String siglaNome = "";
        String siglaSobrenome = "";
        short dia;
        short mes;
        short ano;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro nome:");
        nome = scanner.next();

        System.out.println("Sobrenome:");
        sobrenome = scanner.next();

        System.out.println("Dia do nascimento:");
        dia = scanner.nextShort();

        System.out.println("Mês:");
        mes = scanner.nextShort();

        System.out.println("Ano:");
        ano = scanner.nextShort();


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

        System.out.println("Meu nome é " + nome + ", a sigla do seu nome é: " + siglaNome + siglaSobrenome + " e eu nasci na data:" + dia + "/" + mes + "/" + ano + ".");


    }
}
