
package Parte4_Exercicio2;
import java.util.Scanner;

public class Televisao {
    Scanner sc = new Scanner(System.in); 
    String marca;
    int codigo;
    byte polegadas;
    double altura, largura, profundidade;
    boolean garantiaExtendida;

    void setMarca(String m){
    marca = m;
    }
    String getMArca(){
        return marca;
    }
    void serPolegadas(byte p){
        polegadas = p;
    }
    byte getPolegadas(){
        return polegadas;
    }
    void setAltura(double a){
        altura = a;
    }
    double getAltura(){
        return altura;
    }
    void setLargura(double l){
        largura = l;
    }
    double getLargura(){
        return largura;
    }
    void setProfundidade(double p){
        profundidade = p;
    }
    double getProfundidade(){
        return profundidade;
    }
    void setGarantiaExtendida(boolean g){
        garantiaExtendida = g;
    }
    boolean getGarantiaExtendida(){
        return garantiaExtendida;
    }
    private void inserir(){

        System.out.println("\n>>>> INSERINDO TELEVISAO <<<<");

        System.out.println("\nTELEVISAO");
        
        System.out.print("Marca: ");
        marca = (sc.nextLine());
        System.out.print("Polegadas: ");
        polegadas = (Byte.parseByte(sc.nextLine()));
        System.out.print("Altura: ");
        altura = (Double.parseDouble(sc.nextLine()));
        System.out.print("Largura: ");
        largura = (Double.parseDouble(sc.nextLine()));
        System.out.print("Profundidade: ");
        profundidade = (Double.parseDouble(sc.nextLine()));
        System.out.print("Adicionar Garantia Extendida (1)Sim ou (0)Não? ");
        codigo = (Integer.parseInt(sc.nextLine()));
        if(codigo == 0){
            System.out.print(garantiaExtendida = (false));
        }
        else{
            System.out.print(garantiaExtendida = (true));
        }       
    }
    private void imprimir(){

        System.out.println("\n>>>> IMPRIMINDO TELEVISAO <<<<");
        
        System.out.println("\nTELEVISAO ");
        System.out.println("Marca: "+ marca);
        System.out.println("Polegadas: "+ getPolegadas());
        System.out.println("Altura: "+ getAltura() +"\nLargura: "+getLargura() 
                + "\nProdundidade: "+ getProfundidade());
        System.out.println("Garantia Extendida: "+ getGarantiaExtendida());
    }
}
    