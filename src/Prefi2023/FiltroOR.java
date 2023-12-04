package Prefi2023;

public class FiltroOR implements Filtro {
          private Filtro f1, f2;

          public FiltroOR(Filtro f1, Filtro f2) {
                    this.f1 = f1;
                    this.f2 = f2;
          }

          @Override
          public boolean cumple(ElementoEmpresa e) {
                    return f1.cumple(e) || f2.cumple(e);
          }
}
