/*
 Fazer um número ao cubo
 */
package com.mycompany.funcoes;

import java.util.Scanner;

/**
 * @author Sara
 */
public class valorAoCubo {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite o número a ser calculado (ao cubo): ");
    
    double numero = teclado.nextDouble();
    double resultado = cubo(numero);
    
        System.out.println("O resultado do número " + numero + " ao cubo é: " + resultado);
        
    }
    public static double cubo(double numero){
        return Math.pow(numero, 3);
    }
}
