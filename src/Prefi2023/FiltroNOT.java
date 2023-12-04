package Prefi2023;

public class FiltroNOT implements Filtro {
          private Filtro f1;

          public FiltroNOT(Filtro f1) {
                    this.f1 = f1;
          }

          @Override
          public boolean cumple(ElementoEmpresa e) {
                    return !f1.cumple(e);
          }
}
