
package framework;

public class Desktop extends Dispositivos implements Proporcao{
    
    @Override
    public void PropConteudo(){
       double l, p, lis;
        l = this.link.getTamanho()*1.120;
        this.link.tamanho+=l;
        p = this.parag.getTamanho()*1.150;
        this.parag.tamanho+=p;
        lis = this.lista.getTamanho()*1.150;
        this.lista.tamanho+=lis;
    }
}
