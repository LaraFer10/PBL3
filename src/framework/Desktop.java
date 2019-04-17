
package framework;

public class Desktop extends Dispositivos implements Proporcao{
    
    @Override
    public void PropConteudo(){
       double l, p, lis;
        for (int i = 0; i < this.getLink().size(); i++) {
            l = this.getLink().get(i).getTamanho()*1.12;
            this.getLink().get(i).setTamanho(l+this.getLink().get(i).getTamanho());
            p = this.getParag().get(i).getTamanho()*1.15;
            this.getParag().get(i).setTamanho(p+this.getParag().get(i).getTamanho());
            lis = this.getLista().get(i).getTamanho()*1.15;
            this.getLista().get(i).setTamanho(lis+this.getLista().get(i).getTamanho());
        }
        
    }
}
