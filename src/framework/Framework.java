
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
        
        Links lin1 = new Links();
        lin1.setCor("Azul");
        lin1.setTamanho(3008);
        Listas lis1 = new Listas();
        lis1.setCor("Vermelho");
        lis1.setTamanho(1036);
        Paragrafos par1 = new Paragrafos();
        par1.setCor("Preto");
        par1.setTamanho(13005);
        
        Links lin2 = new Links();
        lin2.setCor("Azul");
        lin2.setTamanho(3008);
        Listas lis2 = new Listas();
        lis2.setCor("Vermelho");
        lis2.setTamanho(1036);
        Paragrafos par2 = new Paragrafos();
        par2.setCor("Preto");
        par2.setTamanho(13005);
        
        Links lin3 = new Links();
        lin3.setCor("Azul");
        lin3.setTamanho(3008);
        Listas lis3 = new Listas();
        lis3.setCor("Vermelho");
        lis3.setTamanho(1036);
        Paragrafos par3 = new Paragrafos();
        par3.setCor("Preto");
        par3.setTamanho(13005);
        
        not.setLink(lin);
        not.setLista(lis);
        not.setParag(par);
        desk.setLink(lin1);
        desk.setLista(lis1);
        desk.setParag(par1);
        cel.setLink(lin2);
        cel.setLista(lis2);
        cel.setParag(par2);
        tab.setLink(lin3);
        tab.setLista(lis3);
        tab.setParag(par3);
        
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
