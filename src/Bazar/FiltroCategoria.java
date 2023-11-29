package Bazar;

public class FiltroCategoria implements Filtro {
          private String categoria;

          public FiltroCategoria(String categoria) {
                    this.categoria = categoria;
          }

          @Override
          public boolean cumple(ElementosBazar e) {
                    return e.getListaDeCategorias().contains(categoria);
          }

}
