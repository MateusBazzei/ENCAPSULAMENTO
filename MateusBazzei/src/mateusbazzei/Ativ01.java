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
public class Ativ01 {
    public static void main(String[] args) {
        
         Scanner leia = new Scanner(System.in); 
        
        System.out.println("Digite o código:");
        String cor = leia.next();
        
        switch (cor) {
            case "Azor4":           
                System.out.println("Rosa");
                break;
            case "PTR##":
                System.out.println("Azul");
                break;
            case "ASPO0":
                System.out.println("Violeta");
                break;
            case "23":
                System.out.println("Preto");
                break;
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("Tom de azul");
                break;
            case "Ar43":
                System.out.println("Vermelho");
                break;
            case "A":
            case "B":
            case "C":
            case "E":
            case "F":    
                System.out.println("Cinza");         
                break;
            case "HP659T":
                System.out.println("Amarelo");
                break;
        }    
    }
}
