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
public class Ativ08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a fruta desejada: banana, maça, laranja, kiwi, pessego");
        String fruta = leia.next();
        
        
        switch(fruta){
            case "banana":  
                System.out.println("O valor do kilo é 2.00R$");
                System.out.println("Quantos kilos gostaria?");
                int kilo = leia.nextInt();
                double compra = kilo * 2;
                System.out.println("O valor total da compra é: "+compra);
                break;
            case "maça":
                System.out.println("O valor do kilo é 3.00R$");
                System.out.println("Quantos kilos gostaria?");
                kilo = leia.nextInt();
                compra = kilo * 3;
                System.out.println("O valor total da compra é: "+compra);
                break;
            case "laranja":
                System.out.println("O valor do kilo é 4.00R$");
                System.out.println("Quantos kilos gostaria?");
                kilo = leia.nextInt();
                compra = kilo * 4;
                System.out.println("O valor total da compra é: "+compra);
                break;
            case "kiwi":
                System.out.println("O valor do kilo é 5.00R$");
                System.out.println("Quantos kilos gostaria?");
                kilo = leia.nextInt();
                compra = kilo * 5;
                System.out.println("O valor total da compra é: "+compra);
                break;
            case "pessego":
                System.out.println("O valor do kilo é 6.00R$");
                System.out.println("Quantos kilos gostaria?");
                kilo = leia.nextInt();
                compra = kilo * 6;
                System.out.println("O valor total da compra é: "+compra);
                break;
                
        }
    }
}
