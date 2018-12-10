
package Classes;

import java.util.Scanner;

public class Onibus extends Veiculos implements Interface{
    protected String motorista;
    Veiculos o = new Veiculos();

    
    //CONSTRUTORES
    
    public Onibus() {    }
    public Onibus(String motorista, Veiculos o) {
        this.o = o;
        this.motorista = motorista;
    }
    public Onibus(String motorista) {
        this.motorista = motorista;
    }
    public Onibus(String motorista,Motor motor1, String marca){
       this.motor1 = motor1; 
       this.marca = marca;       
       this.motorista = motorista;
        }
    public Onibus(String motorista,int numeroPassageiros, String placa){
       this.numeroPassageiros = numeroPassageiros;
       this.motorista = motorista;
       this.placa = placa;
           }
    public Onibus(String motorista,double preco,String proprietario){
       this.motorista = motorista;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Onibus(String motorista,Motor motor1,int numeroPassageiros,String marca){
       this.motor1 = motor1; 
       this.marca = marca;
       this.motorista = motorista;
       this.numeroPassageiros = numeroPassageiros;       
    }
    public Onibus(String motorista,String marca){
       this.marca = marca;
       this.motorista = motorista;
                 }    
    public Onibus(String motorista,double preco,String proprietario,String placa){
       this.placa = placa;
       this.preco = preco;
       this.motorista = motorista;
       this.proprietario = proprietario;      
    }
    public Onibus(String motorista,double preco,String proprietario, String marca, String placa){
       this.marca = marca;
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;   
       this.motorista = motorista;
    }
    public Onibus(String motorista,int numeroPassageiros,double preco,String proprietario){
       this.numeroPassageiros = numeroPassageiros;
       this.preco = preco;
       this.motorista = motorista;
       this.proprietario = proprietario;      
    }
   
    //SETTER E GETTER

    public String getMotorista() {        return motorista;    }
    public void setMotorista(String motorista) {        this.motorista = motorista;    }
    public Veiculos getO() {        return o;    }
    public void setO(Veiculos o) {        this.o = o;    }
    
    //CADASTRO
    
    public void cadastrar(String motorista, Veiculos o){
        setO(o);
        setMotorista(motorista);
    }
    
    //ENTRADA DE DADOS
    
    public void entradaDados(){
    Scanner sc = new Scanner(System.in);
    System.out.println("***** ENTRADA DE INFORMAÇÕES DO ÔNIBUS *****");
    super.entradaDados();
    System.out.println("Motorista: ");
    motorista = sc.nextLine();
        }
    
    //IMPRIME DADOS
    
     public void imprimirDados(){
    System.out.println("\nIMPRIMINDO INFORMAÇÕES DO ÔNIBUS...\n");
    super.imprimeDados();
    System.out.println("\n ***** INFORMAÇÕES ESPECÍFICAS DO ÔNIBUS *****");
    System.out.println("Motorista: " + getMotorista());
    }
        
    //METODOS DO ÔNIBUS
 
     public double acelerar(){
       int i = getRpm();
       for(i = getRpm();i%50!=0; i++){       }
       System.out.println("Velocidade acelerada para: " + i);
        return 0;
       }
          
     public double desacelerar(){
      
       if (getRpm()<50){
           System.out.println("O veículo não pode ser desacelerado mantendo a velocidade em " + getRpm() + "RPM");       
              
       }    else      
       
       {
       int i = getRpm();
       for(i = getRpm();i%50!=0; i--){       }
       System.out.println("Velocidade reduzida para: " + i);
       }
       return 0;
       }            
   
    public String frear (){ return "MotoÔnibus freando";}
    public String virarDireita(){return "Ônibus virando a direita";}
    public String virarEsquerda(){return "Ônibus virando a esquerda";}

     
    
}
