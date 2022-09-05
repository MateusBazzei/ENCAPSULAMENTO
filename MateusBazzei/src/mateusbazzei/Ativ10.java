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
public class Ativ10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro");
        int valor = leia.nextInt();
        
        if (valor == 1){
           System.out.println("SEG");
        }else if (valor == 2){
            System.out.println("TER");
        }else if (valor == 3){
            System.out.println("QUA");
        }else if (valor == 4){
            System.out.println("QUI");
        }else if (valor == 5){
            System.out.println("SEX");
        }else if (valor == 6){
            System.out.println("SAB");
        }else{
            System.out.println("ERRO \n VALOR NÃO ENCONTRADO");
        }
    }
}
