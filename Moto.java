
package Classes;

import java.util.Scanner;


public class Moto extends Veiculos implements Interface {
    protected int volumeBagageiro;
    Veiculos m = new Veiculos();
    
    //CONTRUTORES
    
    public Moto(){}
    public Moto(Veiculos m, int volumeBagageiro){
        this.m = m;
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto (int volumeBagageiro){
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto(Veiculos m){
        this.m = m;
    }
    public Moto(int numeroPassageiros, String placa){
       this.numeroPassageiros = numeroPassageiros;
       this.placa = placa;
           }
    public Moto(double preco,String proprietario){
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Moto(Motor motor1,int numeroPassageiros,String marca){
       this.motor1 = motor1; 
       this.marca = marca;
       this.numeroPassageiros = numeroPassageiros;       
    }
    public Moto(double preco,String proprietario,String placa){
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Moto(double preco,String proprietario, String marca, String placa){
       this.marca = marca;
       this.placa = placa;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Moto(int numeroPassageiros,double preco,String proprietario){
       this.numeroPassageiros = numeroPassageiros;
       this.preco = preco;
       this.proprietario = proprietario;      
    }
    public Moto(Veiculos m,int numeroPassageiros,double preco){
        this.m = m;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }
    
    //SETTER E GETTER

    public int getVolumeBagageiro() {        return volumeBagageiro;    }
    public void setVolumeBagageiro(int volumeBagageiro) {        this.volumeBagageiro = volumeBagageiro;    }
    public Veiculos getM() {        return m;    }
    public void setM(Veiculos m) {        this.m = m;    }
    
    //CADASTRAR
    
    public void Cadastrar(Veiculos m, int volumeBagageiro){
        setM(m);
        setVolumeBagageiro(volumeBagageiro);        
    }
    
    //ENTRADA DE DADOS
    
    public void entradaDados(){
    Scanner sc = new Scanner(System.in);
    System.out.println("***** ENTRADA DE INFORMAÇÕES DA MOTO *****");
    super.entradaDados();
    System.out.println("Volume do Bagageiro: ");
    volumeBagageiro = Integer.parseInt(sc.nextLine());
        }
    
    //IMPRIMIR DADOS
    
    public void imprimirDados(){
    System.out.println("\nIMPRIMINDO INFORMAÇÕES DA MOTO...\n");
    super.imprimeDados();
     System.out.println("\n ***** INFORMAÇÕES ESPECÍFICAS DA MOTO *****");
    System.out.println("Volume bagageiro: " + getVolumeBagageiro());
    }
        
    
    //MÉTODOS DA MOTO
    
    
   public double acelerar(){
       int i = getRpm();
       for(i = getRpm();i%200!=0; i++){       }
       System.out.println("Velocidade acelerada para: " + i);
return 0;
       }
          
   public double desacelerar(){
      
       if (getRpm()<200){
           System.out.println("O veículo não pode ser desacelerado mantendo a velocidade em " + getRpm() + "RPM");       
              
       }    else      
       
       {
       int i = getRpm();
       for(i = getRpm();i%200!=0; i--){       }
       System.out.println("Velocidade reduzida para: " + i);
       }
       return 0;
       }            
   
   public String frear (){ return "Moto freando";}
   public String virarDireita(){return "Moto virando a direita";}
   public String virarEsquerda(){return "Moto virando a esquerda";}



    
}
