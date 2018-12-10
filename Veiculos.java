
package Classes;

import static Classes.Interface.idadeMinimaMotorista;
import static Classes.Interface.tempoMaxUso;
import java.util.Scanner;

public class Veiculos extends Motor {  
        
        protected int numeroPassageiros;
        protected double preco;
        protected String proprietario, marca, placa;
        Motor motor1 = new Motor();
    
    //CONSTRUTORES
        
    public Veiculos(){};
    public Veiculos(Motor motor1,int numeroPassageiros,double preco,String proprietario, String marca, String placa){
       this.motor1 = motor1; 
       this.marca = marca;
       this.numeroPassageiros = numeroPassageiros;
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Veiculos(Motor motor1, String marca){
       this.motor1 = motor1; 
       this.marca = marca;        
        }
    public Veiculos(int numeroPassageiros, String placa){
       this.numeroPassageiros = numeroPassageiros;
       this.placa = placa;
           }
    public Veiculos(double preco,String proprietario){
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Veiculos(Motor motor1,int numeroPassageiros,String marca){
       this.motor1 = motor1; 
       this.marca = marca;
       this.numeroPassageiros = numeroPassageiros;       
    }
    public Veiculos(double preco,String proprietario,String placa){
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Veiculos(double preco,String proprietario, String marca, String placa){
       this.marca = marca;
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Veiculos(int numeroPassageiros,double preco,String proprietario){
       this.numeroPassageiros = numeroPassageiros;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    
    //SETTER E GETTER

    public int getNumeroPassageiros() {        return numeroPassageiros;    }
    public void setNumeroPassageiros(int numeroPassageiros) {        this.numeroPassageiros = numeroPassageiros;    }
    public double getPreco() {        return preco;    }
    public void setPreco(double preco) {        this.preco = preco;    }
    public String getProprietario() {        return proprietario;    }
    public void setProprietario(String proprietario) {        this.proprietario = proprietario;    }
    public String getMarca() {        return marca;    }
    public void setMarca(String marca) {        this.marca = marca;    }
    public String getPlaca() {        return placa;    }
    public void setPlaca(String placa) {        this.placa = placa;    }
    public Motor getMotor1() {        return motor1;    }
    public void setMotor1(Motor motor1) {        this.motor1 = motor1;    }
    
    //CADASTRO
    
    public void cadastrar(Motor motor1, int numeroPassageiros,double preco,String proprietario, String marca, String placa){
        setMotor1(motor1);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);             
    }
    
    //ENTRADA DE DADOS
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("***** Informações do Veículo *****");
        System.out.println("Número de passageiros: ");
        numeroPassageiros = Integer.parseInt(sc.nextLine());
        System.out.println("Marca: ");
        marca = sc.nextLine();
        System.out.println("Placa: ");
        marca = sc.nextLine();
        System.out.println("Preço ");
        preco = Double.parseDouble(sc.nextLine());
        System.out.println("Proprietário: ");
        proprietario = sc.nextLine();        
        
    }

    //IMPRIME DADOS
    public void imprimeDados(){        
        super.imprimeDados();
        System.out.println("\n ***** INFORMAÇÕES GERAIS DO VEÍCULO *****");
        System.out.println("Numero de passageiros: " + getNumeroPassageiros());
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Preço: " + getPreco());
        System.out.println("Proprietário: " + getProprietario());
        System.out.println("Idade Mínima Motorista: " + idadeMinimaMotorista);
        System.out.println("Tempo máximo de uso: " + tempoMaxUso);
        
    }
}