package Bazar;

public class PagaUno extends Combo {

          public PagaUno(double descuento, double descuentoTope) {
                    super(descuento, descuentoTope);
          }

          @Override
          public double getPrecio() {
                    double precioMayor = 0.0;
                    for (ElementosBazar e : this.elementos) {
                              double temp = e.getPrecio();
                              if (temp > precioMayor || precioMayor == 0.0) {
                                        precioMayor = temp;
                              }
                    }
                    return precioMayor;
          }

}
