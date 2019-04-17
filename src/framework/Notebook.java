
package framework;


public class Notebook extends Dispositivos implements Proporcao{
    
    @Override
    public void PropConteudo(){
        double l, p, lis;
        for (int i = 0; i < this.getLink().size(); i++) {
            l = this.getLink().get(i).getTamanho()*2.0;
            this.getLink().get(i).setTamanho(l);
            p = this.getParag().get(i).getTamanho()*2.0;
            this.getParag().get(i).setTamanho(p);
            lis = this.getLista().get(i).getTamanho()*2.0;
            this.getLista().get(i).setTamanho(lis);
        }
       
    }
}
