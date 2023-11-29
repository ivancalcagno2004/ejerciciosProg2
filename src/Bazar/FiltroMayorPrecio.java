package Bazar;

public class FiltroMayorPrecio implements Filtro {
          private double minPrecio;

          public FiltroMayorPrecio(double minPrecio) {
                    this.minPrecio = minPrecio;
          }

          @Override
          public boolean cumple(ElementosBazar e) {
                    return e.getPrecio() > minPrecio;
          }

}
