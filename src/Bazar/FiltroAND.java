package Bazar;

public class FiltroAND implements Filtro {
          private Filtro f1;
          private Filtro f2;

          public FiltroAND(Filtro f1, Filtro f2) {
                    this.f1 = f1;
                    this.f2 = f2;
          }

          public boolean cumple(ElementosBazar e) {
                    return f1.cumple(e) && f2.cumple(e);
          }
}
