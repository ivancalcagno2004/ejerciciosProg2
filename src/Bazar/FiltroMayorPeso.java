package Bazar;

public class FiltroMayorPeso implements Filtro {
          private double minPeso;

          public FiltroMayorPeso(double minPeso) {
                    this.minPeso = minPeso;
          }

          @Override
          public boolean cumple(ElementosBazar e) {
                    return e.getPeso() > minPeso;
          }
}
