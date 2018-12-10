
package Parte4_Exercicio2;
import java.util.Scanner;

public class Carro {

    String cor, modelo;
    int ano, codigo, codigo2;
    double peso;
    boolean arCondicionado, direcaoHidraulica;
    
    void setCor(String c){
        cor = c;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String m){
        modelo = m;
    }
    String getModelo(){
        return modelo;
    }
    void setAno(int a){
        ano = a;
    }
    int getAno(){
        return ano;
    }
    void setPeso(double p){
        peso = p;
    }
    double getPeso(){
        return peso;
    }
    void setArCondicionado(boolean ar){
        arCondicionado = ar;
    }
    boolean getArCondicionado(){
        return arCondicionado;
    }
    void setDirecaoHidraulica(boolean d){
        direcaoHidraulica = d;
    }
    boolean getDirecaoHidraulica(){
        return direcaoHidraulica;
    }
    private void inserir(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n>>>>>> INSERINDO CARRO <<<<<<");
 
        System.out.println("\nCARRO ");
        System.out.print("Cor: ");
        cor = (sc.nextLine());
        System.out.print("Modelo: ");
        modelo = (sc.nextLine());
        System.out.print("Ano: ");
        ano = Integer.parseInt(sc.nextLine());
        System.out.print("Peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.print("Ar Condicionado: (1)Sim ou (0)Não? ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Direcao Hidraulica? (1)Sim ou (0)Não? ");
        codigo2 = Integer.parseInt(sc.nextLine());
        
    }
    private void imprimir(){
   
        System.out.println("\n>>>>>> IMPRIMINDO CARRO <<<<<<");
 
        
        System.out.println("\nCARRO ");
        System.out.println("Cor: " + getCor());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Peso: " + getPeso());
        if(codigo == 1){
            System.out.println("Ar Condicionado: "+(arCondicionado = (true)));
        }
        else{
            System.out.println("Ar Condicionado: "+(arCondicionado = (false)));
        }
        if(codigo2 == 1){
            System.out.println("Direção Hidraulica: "+(direcaoHidraulica = (true)));
        }
        else{
            System.out.println("Direção Hidraulica: "+(direcaoHidraulica = (false)));
        }
        
    }
}
