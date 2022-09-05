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
public class Ativ05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double acumulador=0;

        System.out.println("Digite o número de posiçôes para o vetor");
        double n = leia.nextDouble();
       
        int vetor[] = new int ['n'];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = leia.nextInt();
            acumulador = acumulador + vetor[i];
        }
        double media = acumulador/n;
        System.out.println("A média dos valores lidos é: "+media);
    }
}
