
package ProjetoPendrive;

public class AplicacaoPenDrive {
      public static void main(String[] args){
          PenDrive p1 = new PenDrive();
          PenDrive p2 = new PenDrive("Kingstone", "\tXXX\t", 55);
          PenDrive p3 = new PenDrive("Zeten", "AAA", 44, 3.23, 4.44, 5.55, 543.4);
          PenDrive p4 = new PenDrive(55.30, 32, "Samsung", "3XEB");
          
          p1.entradaDados();
          p1.imprimirDados();  
          
          p1.cadastrar();
      }
      
}
