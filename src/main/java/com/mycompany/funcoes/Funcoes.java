/*
 calculadora
 */
package com.mycompany.funcoes;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("    Calculadora: \n"
                + "     Escolha a operação:\n"
                + "         	| 1 | para soma\n"
                + "     		| 2 | para subtração\n"
                + "  		| 3 | para divisão\n"
                + "        	| 4 | para multiplicação\n"
                + "     Digite a operação: ");

        int operacao = teclado.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Digite o esgundo número: ");
        double num2 = teclado.nextDouble();

        switch (operacao) {
            case 1:
                System.out.println("O Resultado da soma é: " + soma(num1, num2));
                break;
            case 2:
                System.out.println("O Resultado da divisão é: " + subtracao(num1, num2));
                break;
            case 3:
                System.out.println("O Resultado da multiplicação é: " + divisao(num1, num2));
                break;
            case 4:
                System.out.println("O Resultado da multiplicação é: " + multiplicacao(num1, num2));
                break;
            default:
                System.out.println("Número inválido!");
        }
        teclado.close();

        /*case + -> System.out.println("Resultado da soma é: " + soma(num1, num2));
        case - -> System.out.println("Resultado da subtração é: " + subtracao(num1, num2));
        case / -> System.out.println("Resultado da divisão é: " + divisao(num1, num2));
        case * -> System.out.println("Resultado da multiplicação é: " + multiplicacao(num1, num2));
        default*/
    }
    //teclado.close();

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
}
