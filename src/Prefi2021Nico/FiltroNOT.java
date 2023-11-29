package Prefi2021Nico;

public class FiltroNOT implements Filtro {
          private Filtro f;

          public FiltroNOT(Filtro f) {
                    this.f = f;
          }

          @Override
          public boolean cumple(Video v) {
                    return !f.cumple(v);
          }

}
