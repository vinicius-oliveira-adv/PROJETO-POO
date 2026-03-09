/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXERCISE;

import java.util.Scanner;

/**
 *
 * @author Vinixai
 */
public class QUESTAO1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n1, n2, n3, n4;
        int soma;
        
        System.out.println("Digite o primeiro número");
        n1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número");
        n2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro número");
        n3 = scanner.nextInt();
        
        System.out.println("Digite o quarto número");
        n4 = scanner.nextInt();
        
        soma = n1 + n2 + n3 + n4;
        
        System.out.println("O resultado da soma é  " + soma);
    
}
}