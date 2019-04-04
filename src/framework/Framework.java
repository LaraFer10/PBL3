
package framework;

import javax.swing.JOptionPane;


public class Framework {

    
    public static void main(String[] args) {
        Notebook not = new Notebook();
        Desktop desk = new Desktop(); 
        Celular cel = new Celular();
        Tablet tab = new Tablet();
        
        Links lin = new Links();
        lin.setCor("Azul");
        lin.setTamanho(3008);
        Listas lis = new Listas();
        lis.setCor("Vermelho");
        lis.setTamanho(1036);
        Paragrafos par = new Paragrafos();
        par.setCor("Preto");
        par.setTamanho(13005);
        
        not.setLink(lin);
        not.setLista(lis);
        not.setParag(par);
        desk.setLink(lin);
        desk.setLista(lis);
        desk.setParag(par);
        cel.setLink(lin);
        cel.setLista(lis);
        cel.setParag(par);
        tab.setLink(lin);
        tab.setLista(lis);
        tab.setParag(par);
        
        String n;
        int cont =0;
        
        JOptionPane.showMessageDialog(null, "PROPORÇÃO DOS CONTEÚDOS\nLinks - Tamanho: "+lin.getTamanho()+"\nListas - Tamanho: "
        +lis.getTamanho()+"\nParagrafos - Tamanho: "+par.getTamanho());
        
        while (cont ==0){
            n = JOptionPane.showInputDialog("VERIFICAÇÃO DE PROPROÇÃO\n[1]Desktop\n[2]Notebook\n[3]Celular\n[4]Tablet");
            switch (n){
                case "1":
                    desk.PropConteudo();
                    JOptionPane.showMessageDialog(null, "DESKTOP\nLinks - Tamanho: "+desk.getLink().getTamanho()+"\nListas - Tamanho: "
                    +desk.getLista().getTamanho()+"\nParagrafos - Tamanho: "+desk.getParag().getTamanho());
                    break;
                case "2":
                    not.PropConteudo();
                    JOptionPane.showMessageDialog(null, "NOTEBOOK\nLinks - Tamanho: "+not.getLink().getTamanho()+"\nListas - Tamanho: "
                    +not.getLista().getTamanho()+"\nParagrafos - Tamanho: "+not.getParag().getTamanho());
                    break;
                case "3":
                    cel.PropConteudo();
                    JOptionPane.showMessageDialog(null, "CELULAR\nLinks - Tamanho: "+cel.getLink().getTamanho()+"\nListas - Tamanho: "
                    +not.getLista().getTamanho()+"\nParagrafos - Tamanho: "+not.getParag().getTamanho());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "TABLET\nLinks - Tamanho: "+tab.getLink().getTamanho()+"\nListas - Tamanho: "
                    +tab.getLista().getTamanho()+"\nParagrafos - Tamanho: "+tab.getParag().getTamanho());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um número válido!");
                    break;
            }
            cont = JOptionPane.showConfirmDialog(null, "Deseja voltar ao menu?");
        }
    }
    
}
