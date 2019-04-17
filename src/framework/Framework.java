
package framework;

import javax.swing.JOptionPane;


public class Framework {

    
    public static void main(String[] args) {
        Notebook not = new Notebook();
        Desktop desk = new Desktop(); 
        Celular cel = new Celular();
        Tablet tab = new Tablet();
        
        Links lin = new Links();
        Listas lis = new Listas();
        Paragrafos par = new Paragrafos();
        
        int cont =0;
        String n;
        int qt =0;
        
        while (qt ==0){
            n = JOptionPane.showInputDialog("CADASTRO\n[1]Desktop\n[2]Notebook\n[3]Celular\n[4]Tablet");
            switch (n){
                
                case "1":
                    JOptionPane.showMessageDialog(null, "Cadastro de conteúdos html - DESKTOP");
                    while(cont==0){
                        lin.setCor(JOptionPane.showInputDialog("Digite cor do link"));
                        String x =JOptionPane.showInputDialog("Digite tamanh do link");
                        lin.setTamanho(Integer.parseInt(x));
                        desk.setLink(lin);
                        lis.setCor(JOptionPane.showInputDialog("Digite cor do lista"));
                        String z =JOptionPane.showInputDialog("Digite tamanh do lista");
                        lis.setTamanho(Integer.parseInt(z));
                        desk.setLista(lis);
                        par.setCor(JOptionPane.showInputDialog("Digite cor do paragrafo"));
                        String y =JOptionPane.showInputDialog("Digite tamanh do paragrafo");
                        par.setTamanho(Integer.parseInt(y));
                        desk.setParag(par);
                        cont = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais conteúdos?");
                    }
                    for (int i = 0; i < desk.getLink().size(); i++) {
                        desk.PropConteudo();
                        JOptionPane.showMessageDialog(null, "PROPORÇÃO DOS CONTEÚDOS DESKTOP\nLinks - Tamanho: "+desk.getLink().get(i).getTamanho()+"\nListas - Tamanho: "
                        +desk.getLista().get(i).getTamanho()+"\nParagrafos - Tamanho: "+desk.getParag().get(i).getTamanho());
                    }
                    break;
                case "2":
                     JOptionPane.showMessageDialog(null, "Cadastro de conteúdos html - NOTBOOK");
                    while(cont==0){
                        lin.setCor(JOptionPane.showInputDialog("Digite cor do link"));
                        String x =JOptionPane.showInputDialog("Digite tamanh do link");
                        lin.setTamanho(Integer.parseInt(x));
                        not.setLink(lin);
                        lis.setCor(JOptionPane.showInputDialog("Digite cor do lista"));
                        String z =JOptionPane.showInputDialog("Digite tamanh do lista");
                        lis.setTamanho(Integer.parseInt(z));
                        not.setLista(lis);
                        par.setCor(JOptionPane.showInputDialog("Digite cor do paragrafo"));
                        String y =JOptionPane.showInputDialog("Digite tamanh do paragrafo");
                        par.setTamanho(Integer.parseInt(y));
                        not.setParag(par);
                        cont = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais conteúdos?");
                    }
                    for (int i = 0; i < not.getLink().size(); i++) {
                        not.PropConteudo();
                        JOptionPane.showMessageDialog(null, "PROPORÇÃO DOS CONTEÚDOS NOTBOOK\nLinks - Tamanho: "+not.getLink().get(i).getTamanho()+"\nListas - Tamanho: "
                        +not.getLista().get(i).getTamanho()+"\nParagrafos - Tamanho: "+not.getParag().get(i).getTamanho());
                    }
                    break;
                case "3":
                     JOptionPane.showMessageDialog(null, "Cadastro de conteúdos html - CELULAR");
                    while(cont==0){
                        lin.setCor(JOptionPane.showInputDialog("Digite cor do link"));
                        String x =JOptionPane.showInputDialog("Digite tamanh do link");
                        lin.setTamanho(Integer.parseInt(x));
                        cel.setLink(lin);
                        lis.setCor(JOptionPane.showInputDialog("Digite cor do lista"));
                        String z =JOptionPane.showInputDialog("Digite tamanh do lista");
                        lis.setTamanho(Integer.parseInt(z));
                        cel.setLista(lis);
                        par.setCor(JOptionPane.showInputDialog("Digite cor do paragrafo"));
                        String y =JOptionPane.showInputDialog("Digite tamanh do paragrafo");
                        par.setTamanho(Integer.parseInt(y));
                        cel.setParag(par);
                        cont = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais conteúdos?");
                    }
                    for (int i = 0; i < cel.getLink().size(); i++) {
                        cel.PropConteudo();
                        JOptionPane.showMessageDialog(null, "PROPORÇÃO DOS CONTEÚDOS CELULAR\nLinks - Tamanho: "+cel.getLink().get(i).getTamanho()+"\nListas - Tamanho: "
                        +cel.getLista().get(i).getTamanho()+"\nParagrafos - Tamanho: "+cel.getParag().get(i).getTamanho());
                    } 
                    break;
                case "4":
                     JOptionPane.showMessageDialog(null, "Cadastro de conteúdos html - TABLET");
                    while(cont==0){
                        lin.setCor(JOptionPane.showInputDialog("Digite cor do link"));
                        String x =JOptionPane.showInputDialog("Digite tamanh do link");
                        lin.setTamanho(Integer.parseInt(x));
                        tab.setLink(lin);
                        lis.setCor(JOptionPane.showInputDialog("Digite cor do lista"));
                        String z =JOptionPane.showInputDialog("Digite tamanh do lista");
                        lis.setTamanho(Integer.parseInt(z));
                        tab.setLista(lis);
                        par.setCor(JOptionPane.showInputDialog("Digite cor do paragrafo"));
                        String y =JOptionPane.showInputDialog("Digite tamanh do paragrafo");
                        par.setTamanho(Integer.parseInt(y));
                        tab.setParag(par);
                        cont = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais conteúdos?");
                    }
                    for (int i = 0; i < desk.getLink().size(); i++) {
                        desk.PropConteudo();
                        JOptionPane.showMessageDialog(null, "PROPORÇÃO DOS CONTEÚDOS TABLET\nLinks - Tamanho: "+tab.getLink().get(i).getTamanho()+"\nListas - Tamanho: "
                        +tab.getLista().get(i).getTamanho()+"\nParagrafos - Tamanho: "+tab.getParag().get(i).getTamanho());
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um número válido!");
                    break;
            }
            qt = JOptionPane.showConfirmDialog(null, "Deseja voltar ao menu?");
        }
    }
    
}
