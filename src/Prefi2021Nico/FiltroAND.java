package Prefi2021Nico;

public class FiltroAND implements Filtro {
          private Filtro f1, f2;

          public FiltroAND(Filtro f1, Filtro f2) {
                    this.f1 = f1;
                    this.f2 = f2;
          }

          @Override
          public boolean cumple(Video v) {
                    return f1.cumple(v) && f2.cumple(v);
          }

}
