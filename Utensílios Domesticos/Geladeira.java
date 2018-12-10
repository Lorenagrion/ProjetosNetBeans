
package Parte4_Exercicio2;
import java.util.Scanner;

public class Geladeira {
    
    String marca, cor;
    int voltagem;
    short potencia;
    float altura, largura, profundidade;
    
    void setMarca(String m){
        marca = m;
    }
    String getMarca(){
        return marca;
    }
    void setCor(String c){
        cor = c;
    }
    String getCor(){
        return cor;
    }
    void setVoltagem(int v){
        voltagem = v;
    }
    long getVoltagem(){
        return voltagem;
    }
    void setPotencia(short p){
        potencia = p;
    }
    short getPotencia(){
        return potencia;
    }
    
    
    private void inserir(){
        Scanner sc = new Scanner(System.in); 

        System.out.println("\n>>>>> INSERINDO GELADEIRA <<<<<");
                
        System.out.println("\nGELADEIRA");
        System.out.print("Marca: ");
        marca = sc.nextLine();
        System.out.print("Cor: ");
        cor = sc.nextLine();
        System.out.print("Altura: " );
        altura = (Float.parseFloat(sc.nextLine()));
        System.out.print("Largura: " );
        largura = (Float.parseFloat(sc.nextLine()));
        System.out.print("Profundidade: " );
        profundidade = (Float.parseFloat(sc.nextLine()));
        System.out.print("Potencia: ");
        potencia = (Short.parseShort(sc.nextLine()));
        System.out.print("Opções de Voltagens: (1)110v (2)220 (3)BiVolt: ");
        voltagem = (Integer.parseInt(sc.nextLine()));
    }
    
    private void imprimir(){  
        System.out.println("\n>>>>> IMPRIMINDO GELADEIRA <<<<<");
        
        System.out.println("\nGELADEIRA");
        System.out.println("Marca:  "+ getMarca());
        System.out.println("Potencia Desejada: "+ getPotencia());
        System.out.println("Altura: "+ altura + 
                 "\nLargura: "+ largura +
                 "\nProfundidade: "+ profundidade);  
        switch(voltagem){
            case 1:
                System.out.println("Voltagem: "+getVoltagem()+"10v.");
                break;
            case 2:
                System.out.println("Voltagem: "+getVoltagem()+"20v.");
                break;
            case 3:
                System.out.println("Voltagem: BiVolt.");
            default:
                System.out.println("Voltagem Invalida. Insira novamente.");
                inserir();
                imprimir();
                break;
        }
              
    }
}

