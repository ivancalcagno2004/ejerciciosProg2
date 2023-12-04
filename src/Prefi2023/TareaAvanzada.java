package Prefi2023;

public class TareaAvanzada extends TareaCompleja {

          public TareaAvanzada(String nombre) {
                    super(nombre);
          }

          @Override
          public int getCantidadEmpleados() {
                    int res = 0;
                    for (ElementoEmpresa e : this.elementos) {
                              res += e.getCantidadEmpleados();
                    }
                    return res;
          }

          @Override
          public int getTiempo() {
                    int mayorTiempo = 0;
                    for (ElementoEmpresa e : this.elementos) {
                              if (e.getTiempo() > mayorTiempo) {
                                        mayorTiempo = e.getTiempo();
                              }
                    }
                    return mayorTiempo;
          }

          @Override
          public TareaCompleja crearObjeto() {
                    return new TareaAvanzada(this.getNombre());
          }
}
