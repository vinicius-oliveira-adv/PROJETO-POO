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
public class QUESTAO5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        float sal, percentual, sal_atualizado;
        
        System.out.println("Digite o salario atual: R$");
        sal = scanner.nextFloat();
        
        System.out.print("Digite o percentual de aumento: ");
        percentual = scanner.nextFloat();
        
        sal_atualizado = (sal * percentual/100) + sal;
        System.out.printf("O novo salario e: R$%.2f", sal_atualizado);
    }
    
}
