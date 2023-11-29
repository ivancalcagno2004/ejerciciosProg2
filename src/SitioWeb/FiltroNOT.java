package SitioWeb;

public class FiltroNOT implements Filtro {
          private Filtro f;

          public FiltroNOT(Filtro f) {
                    this.f = f;
          }

          @Override
          public boolean cumple(Noticia n) {
                    return !f.cumple(n);
          }

}
