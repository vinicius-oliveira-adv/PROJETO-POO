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
public class QUESTAO4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        float sal;
        float sal_atualizado;
             
        System.out.println("Digite o seu salario");
        sal = scanner.nextFloat();
        
        sal_atualizado = sal + (sal * 0.25f);
        
        System.out.println("seu salario atualizado e " +sal_atualizado);
        
        
        
}
}
