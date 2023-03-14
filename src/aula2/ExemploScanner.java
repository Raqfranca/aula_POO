package aula2;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        int num1;
        int num2;
        float coeficiente;

        System.out.println("Insira um primeiro número");
        num1= scanner.nextInt();
        System.out.println("Insira um segundo número");
        num2= scanner.nextInt();

        System.out.println("Insira o coeficiente");
        scanner.nextFloat();


    }
}
