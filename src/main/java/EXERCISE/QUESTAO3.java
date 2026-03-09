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
public class QUESTAO3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        float n1, n2, n3;
        float p1, p2, p3;
        float media_ponderada;
        
       
        System.out.println("Digite a primeira nota:");
        n1 = scanner.nextFloat();
        System.out.println("Digite o peso da primeira nota:");
        p1 = scanner.nextFloat();
        
        System.out.println("Digite a segunda nota:");
        n2 = scanner.nextFloat();
        System.out.println("Digite o peso da segunda nota:");
        p2 = scanner.nextFloat();
        
        System.out.println("Digite a terceira nota:");
        n3 = scanner.nextFloat();
        System.out.println("Digite o peso da terceira nota:");
        p3 = scanner.nextFloat();
        
       
        media_ponderada = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);
        
        System.out.println("A média ponderada é: " + media_ponderada);    
        
        
}
}
