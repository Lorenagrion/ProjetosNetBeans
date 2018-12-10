
package Classes;

import java.util.Scanner;

public abstract class Carro extends Veiculos implements Interface{
    
    Veiculos c = new Veiculos ();
    protected int volumeMala;
 
    
//SETTER E GETTER
    public int getVolumeMala() {        return volumeMala;    }
    public void setVolumeMala(int volumeMala) {        this.volumeMala = volumeMala;       }
    public Veiculos getC() {        return c;    }
    public void setC(Veiculos c) {        this.c = c;    }
    
    
//CONSTRUTOR    
    public Carro() {    }
    public Carro( Veiculos c, int volumeMala) {    
        this.volumeMala = volumeMala;  
        this.c = c;}
    public Carro( int volumeMala) {    
        this.volumeMala = volumeMala;  }
    public Carro(double preco){
        this.preco = preco;    }
    public Carro(Motor motor1, String marca){
       this.motor1 = motor1; 
       this.marca = marca;        
        }
    public Carro(int numeroPassageiros, String placa){
       this.numeroPassageiros = numeroPassageiros;
       this.placa = placa;
           }
    public Carro(double preco,String proprietario){
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Carro(Motor motor1,int numeroPassageiros,String marca){
       this.motor1 = motor1; 
       this.marca = marca;
       this.numeroPassageiros = numeroPassageiros;       
    }
    public Carro(double preco,String proprietario,String placa){
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Carro(double preco,String proprietario, String marca, String placa){
       this.marca = marca;
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Carro(int numeroPassageiros,double preco,String proprietario){
       this.numeroPassageiros = numeroPassageiros;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Carro( Veiculos c) {    
        this.c = c;}
    
    
    
///CADASTRAR
    public void cadastrar(int volumeMala, Veiculos c){ 
        setVolumeMala(volumeMala);
        setC(c);}
    
    
    
//ENTRADA DADOS
    public void entradaDados (){
    Scanner sc = new Scanner(System.in);
        System.out.println("***** ENTRADA DE INFORMAÇÕES DO CARRO *****");
        super.entradaDados();
        System.out.println("Volume da mala: ");
        volumeMala = Integer.parseInt(sc.nextLine());
        
            }
    
    
    
//IMPRIME DADOS

public void imprimeDados(){  
    System.out.println("\nIMPRIMINDO INFORMAÇÕES DO CARRO...\n");
    super.imprimeDados();
    System.out.println("\n ***** INFORMAÇÕES ESPECÍFICAS DO CARRO *****");
    System.out.println("Volume da Mala: " + getVolumeMala());
    
    
}    


//MÉTODOS DO CARRO
   public double acelerar(){
       int i = getRpm();
       for(i = getRpm();i%100!=0; i++){       }
       System.out.println("Velocidade acelerada para: " + i);
return 0;
       }
          
   public double desacelerar(){
      
       if (getRpm()<100){
           System.out.println("O veículo não pode ser desacelerado mantendo a velocidade em " + getRpm() + "RPM");       
       }    else      
       
       {
       int i = getRpm();
       for(i = getRpm();i%100!=0; i--){       }
       System.out.println("Velocidade reduzida para: " + i);
       }
       return 0;
       }            
   
   public String frear (){ return "Carro freando";}
   public String virarDireita(){return "Carro virando a direita";}
   public String virarEsquerda(){return "Carro virando a esquerda";}


}