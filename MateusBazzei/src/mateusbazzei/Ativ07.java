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
public class Ativ07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra:");
        double compra = leia.nextDouble();
        
        if (compra >= 5000){
            double desconto = (compra*0.20);
            System.out.println("O desconto é de: "+desconto);
            System.out.println("20% de desconto na compra");
            System.out.println("O valor da compra com o desconto é de: "+(compra-desconto));
        }else{
            double desconto = (compra*0.15);
            System.out.println("O desconto é de: "+desconto);
            System.out.println("15% de desconto na compra");
            System.out.println("O valor da compra com o desconto é de: "+(compra-desconto));
        } 
    }
}
