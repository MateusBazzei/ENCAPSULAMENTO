/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author mateus.bazzei
 */
public class Automovel extends Terrestre{
    private String numplaca;
    private int numportas;
    

    public void imprimeDadosCarro(){
            
            System.out.println("-------CARRO-------");
            System.out.println("Número de portas: "+ numportas);
            System.out.println("Placa: "+ numplaca);
            System.out.println("Número de rodas: "+numerorodas);
            System.out.println("Capacidade: "+capacidade);
        }
    
     public void imprimeDadosMoto(){
            
            System.out.println("-------Moto-------");         
            System.out.println("Placa: "+ numplaca);
            System.out.println("Número de rodas: "+numerorodas);
            System.out.println("Capacidade: "+capacidade);
        }
    
    
    public String getNumplaca() {
        return numplaca;
    }

    public int getNumportas() {
        return numportas;
    }
    


    public void setNumplaca(String numplaca) {
        this.numplaca = numplaca;
    }

    public void setNumportas(int numportas) {
        this.numportas = numportas;
    }

    
    
    
}
