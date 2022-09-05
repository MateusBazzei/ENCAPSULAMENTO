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
public class Ativ03 {
    public static void main(String[] args) {
        
         Scanner leia = new Scanner(System.in);
         
         System.out.println("Digite seu nome");
         String nome = leia.next();
         
         System.out.println("Digite seu salário atual");
         double salario = leia.nextDouble();
         
         System.out.println("Digite seu tempo de empresa em anos");
         int tempo = leia.nextInt();
         
         switch (tempo){
             
             case 1:
             case 2:   
             case 3:
             case 4:
                double reajuste = (salario + (salario * 0.10));
                System.out.println("Funcionário: "+nome);
                System.out.println("Salário atual: "+salario);
                System.out.println("Reajuste: "+reajuste);
                break; 
             case 5:   
             case 6:
             case 7:
             case 8:   
             case 9:
                reajuste = (salario + (salario * 0.15));
                System.out.println("Funcionário: "+nome);
                System.out.println("Salário atual: "+salario);
                System.out.println("Reajuste: "+reajuste);
                break; 
             case 10:
             case 11:   
             case 12:
             case 13:
             case 14: 
                reajuste = (salario + (salario * 0.20));
                System.out.println("Funcionário: "+nome);
                System.out.println("Salário atual: "+salario);
                System.out.println("Reajuste: "+reajuste);
                break;
             case 15:
             case 16:
             case 17:   
             case 18:
             case 19:
                reajuste = (salario + (salario * 0.25));
                System.out.println("Funcionário: "+nome);
                System.out.println("Salário atual: "+salario);
                System.out.println("Reajuste: "+reajuste);
                break;
             default:
                reajuste = (salario + (salario * 0.30));
                System.out.println("Funcionário: "+nome);
                System.out.println("Salário atual: "+salario);
                System.out.println("Reajuste: "+reajuste);
                break;
         }  
    }
}
