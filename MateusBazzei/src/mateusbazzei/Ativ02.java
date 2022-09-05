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
public class Ativ02 {
    public static void main(String[] args) {
        
         Scanner leia = new Scanner(System.in); 
         
         double vetor[] = new double[5];
         double vetor2[] = new double[5];
         
         for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor");
            vetor[i]=leia.nextDouble();
            if (vetor[i] < 0 ){
                vetor2[i] = 0;
            }else{
                vetor2[i] = vetor[i];
            } 
        } 
         for (int i = 0; i < vetor.length; i++) {
         System.out.print(vetor[i]+"\n");
         System.out.print(vetor2[i]+"\n");
         }
    }
}
