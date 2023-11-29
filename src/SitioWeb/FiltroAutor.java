package SitioWeb;

public class FiltroAutor implements Filtro {
          private String autor;

          public FiltroAutor(String autor) {
                    this.autor = autor.toLowerCase();
          }

          @Override
          public boolean cumple(Noticia n) {
                    return n.getAutor().toLowerCase().equals(autor);
          }

}
