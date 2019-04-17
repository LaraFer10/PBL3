
package framework;

import java.util.ArrayList;

public abstract class Dispositivos {
    protected ArrayList<Listas> lista;
    protected ArrayList<Links> link;
    protected ArrayList<Paragrafos> parag;
    
     public Dispositivos(){
        this.lista = new ArrayList();
        this.link = new ArrayList();
        this.parag = new ArrayList();
    }

    public ArrayList<Listas> getLista() {
        return lista;
    }

    public void setLista(Listas lista) {
        this.lista.add(lista);
    }

    public ArrayList<Links> getLink() {
        return link;
    }

    public void setLink(Links link) {
        this.link.add(link);
    }

    public ArrayList<Paragrafos> getParag() {
        return parag;
    }

    public void setParag(Paragrafos parag) {
        this.parag.add(parag);
    }

   
   
    
}
