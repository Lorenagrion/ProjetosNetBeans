
package Classes;
import java.util.Scanner;

public class Motor {
    protected String marca, tipoCombustivel;
    protected int rpm, rpmMaximo;
    
    //CONSTRUTORES
    public Motor (){};
    public Motor (String marca, String tipoCombustivel, int rpm, int rpmMaximo){
        this.marca=marca;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    //SETTER E GETTER
    public String getMarca() {        return marca;    }
    public void setMarca(String marca) {        this.marca = marca;    }
    public String getTipoCombustivel() {        return tipoCombustivel;    }
    public void setTipoCombustivel(String tipoCombustivel) {        this.tipoCombustivel = tipoCombustivel;    }
    public int getRpm() {        return rpm;    }
    public void setRpm(int rpm) {        this.rpm = rpm;    }
    public int getRpmMaximo() {        return rpmMaximo;    }
    public void setRpmMaximo(int rpmMaximo) {        this.rpmMaximo = rpmMaximo;    }
    
    //CADASTRAR
    public void cadastrar(String marca, String tipoCombustivel, int rpm, int rpmMaximo){
        setMarca(marca);
        setTipoCombustivel(tipoCombustivel);
        setRpm(rpm);
        setRpmMaximo(rpmMaximo);
            }
    
    //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Motor do Veículo - Entrada de dados:  ***** ");
        System.out.println("Marca: ");
        marca = sc.nextLine();
        System.out.println("Tipo Combustível: ");
        tipoCombustivel = sc.nextLine();
        System.out.println("RPM: ");
        rpm = Integer.parseInt(sc.nextLine());
        System.out.println("RPM Máximo: ");
        rpmMaximo = Integer.parseInt(sc.nextLine());
    }
    
    //IMPRIME DADOS
    public void imprimeDados(){
    System.out.println("\n ***** INFORMAÇÕES DO MOTOR *****");
        System.out.println("Marca: " + getMarca());
        System.out.println("Tipo Combustível: " + getTipoCombustivel());
        System.out.println("RPM: " + getRpm());
        System.out.println("RPM Máximo: " + getRpmMaximo());
    
            }
    

}
