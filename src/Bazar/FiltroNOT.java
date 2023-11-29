package Bazar;

public class FiltroNOT implements Filtro {
          private Filtro f1;

          public FiltroNOT(Filtro f1) {
                    this.f1 = f1;
          }

          public boolean cumple(ElementosBazar e) {
                    return !f1.cumple(e);
          }
}
