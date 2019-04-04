
package framework;

public abstract class Dispositivos {
    protected Listas lista;
    protected Links link;
    protected Paragrafos parag;

   
    public Listas getLista() {
        return lista;
    }

   
    public void setLista(Listas lista) {
        this.lista = lista;
    }

    
    public Links getLink() {
        return link;
    }

    
    public void setLink(Links link) {
        this.link = link;
    }

    
    public Paragrafos getParag() {
        return parag;
    }

    
    public void setParag(Paragrafos parag) {
        this.parag = parag;
    }
    
}
