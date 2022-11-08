package br.com.dio.calculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor (a):");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor (a):");

        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Soma a + b: " + somar);
        System.out.println("Subtrair a - b: " + subtrair);
        System.out.println("Multiplicar a x b: " + multiplicar);
        System.out.println("Dividir a / b: " + dividir);
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }



}
