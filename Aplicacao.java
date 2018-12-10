
package Aplicacao;
import Classes.Carro;
import Classes.Moto;
import Classes.Motor;       
import Classes.Onibus;
import Classes.Veiculos;



public class Aplicacao {
     public static void main(String[] args) {
       
        Carro car[] = new Carro[10];
        for(int i = 0; i < 10; i++){
              System.out.println("\n\n\n\n INFORMAÇÕES DO CARRO " + i+1);
              car[i] = new Carro() {};
              car[i].entradaDados();
              car[i].imprimeDados();
              car[i].virarDireita();
              car[i].virarEsquerda();
              car[i].acelerar();
              car[i].desacelerar();
              car[i].frear();  
                              
        }             
         
        Moto mot[] = new Moto[10];
        for(int i = 0; i < 10; i++){
              System.out.println("\n\n\n\n INFORMAÇÕES DA MOTO " + i+1);
              mot[i] = new Moto() {};
              mot[i].entradaDados();
              mot[i].imprimeDados();
              mot[i].virarDireita();
              mot[i].virarEsquerda();
              mot[i].acelerar();
              mot[i].desacelerar();
              mot[i].frear();  
                              
        }             
        
        
        Onibus oni[] = new Onibus[10];
        for(int i = 0; i < 10; i++){
              System.out.println("\n\n\n\n INFORMAÇÕES DO ÔNIBUS " + i+1);
              oni[i] = new Onibus() {};
              oni[i].entradaDados();
              oni[i].imprimeDados();
              oni[i].virarDireita();
              oni[i].virarEsquerda();
              oni[i].acelerar();
              oni[i].desacelerar();
              oni[i].frear();  
                              
        }            
        
        
        
}
}