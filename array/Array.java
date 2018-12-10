
package array;

public class Array {

    public static void main(String[] args) {
          double fracoes[] = new double[12];
          for (int i = 0; i < 12; i++){
              fracoes[i] = 1 / (i+1);
          }
          for (int i = 0;i<12;i++){
              System.out.println("fracoes[ "+i+"] = "+ fracoes[i]);
          }
          
          //vetor não primitivo
          String valores[]= new String[2];
          valores[0]="Lorena";
          valores[1]="Dany";
          for(int i=0;i<2;i++){
              System.out.println(valores[i]);
          }
          // vetor primitivo
          Integer val[] = new Integer[15];
          for(int i=0;i<15;i++){
              System.out.println("Posição " +i+":"+val[i].intValue());
          }
    }
    
}
