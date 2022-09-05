/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mateusbazzei;
import java.util.Scanner;
/**
 *
 * @author mateus.bazzei
 */
public class Ativ04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a refeição escolhida:");
        String comida = leia.next();
        
         switch (comida) {
             case "Vegetariano":
                 System.out.println("180 cal");
                 break;
             case "Carne":
                 System.out.println("360 cal");
                 break;    
             case "Frango":
                 System.out.println("230 cal");
                 break;    
             case "Peixe":
                 System.out.println("200 cal");
                 break;         
             case "Morango":
                 System.out.println("30 cal");
                 break;
             case "Sorvete":
                 System.out.println("180 cal");
                 break;
             case "Mouse Chocolate":
                 System.out.println("210 cal");
                 break;
             case "Sagu":
                 System.out.println("75 cal");
                 break;
             case "Cerveja":
                 System.out.println("140 cal");
                 break;
             case "Suco":
                 System.out.println("100 cal");
                 break;
             case "Refrigerante":
                 System.out.println("600 cal");
                 break;    
             case "Refri Diet":
                 System.out.println("50 cal");
                 break;
        }
    }
}
