/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;


public class Heranca {
    
    
    public static void main(String[] args) {
        
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        
        
        carro.setNumplaca("DSA - 12345");
        carro.setNumportas(4);
        carro.setNumerorodas(4);
        carro.setCapacidade(2);
        
        
        carro.imprimeDadosCarro();
    }
    
    
    
    
}