package aula2;

import java.util.Locale;
import java.util.Scanner;

public class ResumoScanner {

    /*Crie um programa que solicite ao usuário seu nome, departamento, número de registro e o salário.
    O programa deve exibir esses Dados*/

    public static void main(String[] args) {

        //Locale é utilizado para definir se aceita . ou , no número.

        //Locale.setDefault(new Locale("en", "US"));
        Locale.setDefault(new Locale("pt", "BR"));

        String nome;
        String departamento;
        Integer numeroRegistro;
        Double salario;

        //Scanner é uma classe e é utilizado para recuperar os dados digitados pelo usuário.
        // Começamos definido o nome do Scanner (Scanner scanner).
        // O "new Scanner" é transformando ele em um objeto, nos () informamos os parametros,
        // nesse caso (System.in) o objeto vai receber dados.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = scanner.next(); // ou nextLine() recupera a String digitada no console
        System.out.println("Qual o seu departamento?");
        departamento = scanner.next(); // ou nextLine() recupera a String digitada no console
        System.out.println("Qual o número de registro?");
        numeroRegistro = scanner.nextInt(); //recupera a int digitada no console
        System.out.println("Qual o seu salário?");
        salario = scanner.nextDouble(); //recupera o double digitada no console

        System.out.println("O Calaborador (a) " + nome + " do departamento " + departamento + ", recebe mensalmente R$ " + salario + ".");

    }
}
