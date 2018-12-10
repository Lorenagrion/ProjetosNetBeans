
package Parte4_Exercicio2;
import java.util.Scanner;

public class Mesa {
    
    String material, cor;
    float altura, largura, comprimento;
    boolean montagem;
    long quantidade;
    int codigo;
    
    void setMaterial(String m){
        material = m;
    }
    String getMaterial(){
        return material;
    }
    void setCor(String c){
        cor = c;
    }
    String getCor(){
        return cor;
    }
    void setAltura(float a){
        altura = a;
    }
    float getAltura(){
        return altura;
    }
    void setLargura(float l){
        altura = l;
    }
    float getLargura(){
        return largura;
    }
    void setComprimento(float c){
        comprimento = c;
    }
    float getComprimento(){
        return comprimento;
    }
    void setMontagem(boolean m){
        montagem = m;
    }
    boolean getMontagem(){
        return montagem;
    }
    void setQuantidade(long q){
        quantidade = q;
    }
    long getQuantidade(){
        return quantidade;
    }
    private void inserir(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("\n>>>>>> INSERINDO MESA <<<<<<");
   
        System.out.println("\nMESA ");
        System.out.print("Material: ");
        material = (sc.nextLine());
        System.out.print("Cor: ");
        cor = (sc.nextLine());
        System.out.print("Altura: ");
        altura = (Float.parseFloat(sc.nextLine()));
        System.out.print("Largura: ");
        largura = (Float.parseFloat(sc.nextLine()));
        System.out.print("Comprimento: ");
        comprimento = (Float.parseFloat(sc.nextLine()));
        System.out.print("Quantidade: ");
        quantidade = (Long.parseLong(sc.nextLine()));
        System.out.print("Montagem (1)Sim ou (0)Não? ");
        codigo = (Integer.parseInt(sc.nextLine()));        
    }
    private void imprimir(){

        System.out.println("\n>>>>>> IMPRIMINDO MESA <<<<<<<");

        System.out.println(" \nMESA ");
        System.out.print("Material: "+ getMaterial());
        System.out.println("Cor:  "+ getCor());
        System.out.println("Altura:  "+ getAltura() + "\nLargura: "+ largura +
                "\nComprimento: "+ getComprimento());
        System.out.println("Montagem1"
                + ": "+ getMontagem());
        System.out.println("Quantidade: "+ getQuantidade());
    }
}
