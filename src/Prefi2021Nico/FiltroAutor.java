package Prefi2021Nico;

public class FiltroAutor implements Filtro {
          private String autor;

          public FiltroAutor(String autor) {
                    this.autor = autor;
          }

          @Override
          public boolean cumple(Video v) {
                    return v.getUsuario().getNombre().equals(this.autor);
          }

}
