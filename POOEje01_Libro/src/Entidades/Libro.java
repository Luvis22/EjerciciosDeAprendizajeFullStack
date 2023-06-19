
package Entidades;


public class Libro {
    
    // atributos 
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int nump;
    
    //constructor por parametros

    public Libro(int ISBN, String titulo, String autor, int nump) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nump = nump;
    }
    //constructir vacio o por defecto
    
    public Libro() {
    }
    
    //setter & getter

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNump() {
        return nump;
    }

    public void setNump(int nump) {
        this.nump = nump;
    }

    //metodo toString
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nump=" + nump + '}';
    }
    
    
}
