
package Parte4_Exercicio2;


public class AplicacaoMain {
    public static void main(String[] args){
        Cadeira c = new Cadeira();
        Mesa m= new Mesa();
        Televisao t = new Televisao();
        Geladeira g = new Geladeira();
        Carro cr = new Carro();
                
        c.inserir();
        c.imprimir();
        m.inserir();
        m.imprimir();
        t.inserir();
        t.imprimir();
        g.inserir();
        g.imprimir();
        cr.inserir();
        cr.imprimir();
        
        
        
        
    }
}
