package Prefi2023;

public class FiltroMenorTiempo implements Filtro {
          private int maxTiempo;

          public FiltroMenorTiempo(int maxTiempo) {
                    this.maxTiempo = maxTiempo;
          }

          @Override
          public boolean cumple(ElementoEmpresa e) {
                    return e.getTiempo() < this.maxTiempo;
          }

}
