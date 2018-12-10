package ProjetoPendrive;

import java.util.Scanner;

public class PenDrive {
    String marca, modelo;
    int capacidade;
    double comprimento, largura, profundidade, peso, preco;
    
//CONSTRUTOR 1
    public PenDrive(){
        System.out.println("CONSTRUTOR 1");
        System.out.println("Objeto Iniciado.");
        System.out.println("\n");
    }
    //CONSTRUTOR 2
    public PenDrive(String marca, String modelo, int capacidade){
        System.out.println("CONSTRUTOR 2");
        System.out.println(marca + modelo + capacidade);
        System.out.println("\n");
    }
    //CONSTRUTOR 3
    public PenDrive(String marca, String modelo, int capacidade, double largura,
            double profundidade, double peso, double preco){
        System.out.println("CONSTRUTOR 3");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Capacidade:"+ capacidade);
        System.out.println("Largura: "+ largura);
        System.out.println("Profundidade: "+ profundidade);
        System.out.println("Peso: "+ peso);
        System.out.println("Preco: "+preco);
        System.out.println("\n");
    }
    //CONSTRUTOR 4
    public PenDrive(double preco, int capacidade, String marca, String modelo){
        System.out.println("CONSTRUTOR 4");
        System.out.println("Preco: "+ preco);
        System.out.println("Capacidade: "+ capacidade);
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("\n");
    }
            
    void setMarca(String m){
        marca = m;
    }
    String getMarca(){
        return marca;
    }
     void setModelo(String m){
        modelo = m;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidade(int c){
        capacidade = c;
    }
    int getCapacidade(){
        return capacidade;
    }    
    void setComprimento(double c){
        comprimento = c; }
    double getComprimento(){
        return comprimento; }
    void setLargura(double l){
        largura = l; }
    double getLargura(){
        return largura; }
     void setProfundidade(double p){
        profundidade = p; }
    double getProfundidade(){
        return profundidade; }
    void setPeso(double p){
        peso = p; }
    double getPeso(){
        return peso; }
    void setPreco(double p){
        preco = p; }
    double getPreco(){
        return preco; }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Marca: ");
        marca = (sc.nextLine());
        System.out.println("Digite o Modelo: ");
        modelo = (sc.nextLine());
        System.out.println("Digite a Capacidade: ");
        capacidade = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o Comprimento: ");
        comprimento = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a Largura: ");
        largura = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a Profundidade: ");
        profundidade = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o Peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o preco: ");
        preco = (Double.parseDouble(sc.nextLine())); } 
    public void imprimirDados(){
        System.out.println("Marca : " + (getMarca()));
        System.out.println("Modelo : " + (getModelo()));
        System.out.println("Capacidade: " + (getCapacidade()));
        System.out.println("Comprimento: " + (getComprimento()));
        System.out.println("Largura: " + (getLargura()));
        System.out.println("Profundidade: " + (getProfundidade()));
        System.out.println("Peso : " + (getPeso()));
        System.out.println("Preco : " + (getPreco())); }
    
    public void cadastrar(){
        setMarca(marca);
        setCapacidade(capacidade);
        setComprimento(comprimento);
        setLargura(largura);
        setProfundidade(profundidade);
        setPeso(peso);
        setPreco(preco);
    }
}
  
       
  




