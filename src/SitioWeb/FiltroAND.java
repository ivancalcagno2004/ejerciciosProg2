package SitioWeb;

public class FiltroAND implements Filtro {
          private Filtro f1, f2;

          public FiltroAND(SitioWeb.Filtro f1, SitioWeb.Filtro f2) {
                    this.f1 = f1;
                    this.f2 = f2;
          }

          @Override
          public boolean cumple(Noticia n) {
                    return f1.cumple(n) && f2.cumple(n);
          }

}
