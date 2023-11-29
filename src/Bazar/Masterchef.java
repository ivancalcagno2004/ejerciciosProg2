package Bazar;

public class Masterchef extends Combo {
          private Filtro filtro;

          public Masterchef(double descuento, double descuentoTope, Filtro filtro) {
                    super(descuento, descuentoTope);
                    this.filtro = filtro;
          }

          @Override
          public void addElemento(ElementosBazar e) {
                    if (filtro.cumple(e)) {
                              super.addElemento(e);
                    }
          }

          public void setFiltro(Filtro filtro) {
                    this.filtro = filtro;
          }

}
