package Parte4_Exercicio2;
import java.util.Scanner;

public class Cadeira {
    
    String cor, material;
    double altura, largura, comprimento;
    long quantidade;
    

    void setCor(String c){
        cor = c;
    }
    String getCor(){
        return cor;
    }
    void setMaterial(String m){
        material = m;
    }
    String getMaterial(){
        return material;
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
    void setComprimento(double c){
        comprimento = c;
    }
    double getComprimento(){
        return comprimento;
    }    
    private void inserir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n>>>>> INSERINDO CADEIRA <<<<<");
        
        System.out.println("\nCADEIRA ");
        
        System.out.print("Cor: ");
        cor = (sc.nextLine());
        System.out.print("Material: ");
        material = (sc.nextLine());
        System.out.print("Altura: ");
        altura = (Double.parseDouble(sc.nextLine()));
        System.out.print("Largura: ");
        largura = (Double.parseDouble(sc.nextLine()));
        System.out.print("Comprimento: ");
        comprimento = (Double.parseDouble(sc.nextLine()));
        System.out.print("Quantidade: ");
        quantidade = (Long.parseLong(sc.nextLine()));
    }
    private void imprimir(){
 
        System.out.println("\n>>>>>> IMPRIMINDO CADEIRA <<<<<<");
        
        System.out.println("\nCADEIRA ");
        System.out.println("Cor: " + getCor());
        System.out.println("Material: " + getMaterial());
        System.out.println("Altura: " + getAltura());
        System.out.println("Largura: " + getLargura());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Quantidade: " + quantidade);
    }
}
   

    
