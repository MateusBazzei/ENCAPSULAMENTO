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
public class Ativ09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double vetor[] = new double[7];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor para o vetor:");
            vetor[i] = leia.nextDouble();
              
        }
            System.out.println("Digite um valor para ser procurado no vetor:");
            int procura = leia.nextInt();
            
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i]==procura){
                    System.out.println("O valor foi encontrado na posição "+i);
                }else{
                    System.out.println("Valor não encontrado");
                }
        }
    }
}
