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
public class QUESTAO6 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        float sal, gratificacao, imposto, sal_atualizado;
        
        System.out.print("Digite o seu salario base: R$");
        sal = scanner.nextFloat();
        
        gratificacao = sal * 5/100;
        imposto = (sal + gratificacao) * 7/100;
        
        sal_atualizado = sal + gratificacao - imposto;
        
        System.out.printf("O salario ajustado do funcionario e: R$%.2f", sal_atualizado);
    }
    
}
