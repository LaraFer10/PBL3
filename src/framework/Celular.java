
package framework;


public class Celular extends Dispositivos implements Proporcao{
    
    @Override
    public void PropConteudo(){
       double l, p, lis;
        l = 1.30*this.link.getTamanho();
        this.link.tamanho-=l;
        p = 1.30*this.parag.getTamanho();
        this.parag.tamanho-=p;
        lis = 1.30*this.lista.getTamanho();
        this.lista.tamanho-=lis;
    }
}
