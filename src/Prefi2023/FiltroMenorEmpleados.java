package Prefi2023;

public class FiltroMenorEmpleados implements Filtro {
          private int maxEmpleados;

          public FiltroMenorEmpleados(int maxEmpleados) {
                    this.maxEmpleados = maxEmpleados;
          }

          @Override
          public boolean cumple(ElementoEmpresa e) {
                    return e.getCantidadEmpleados() < this.maxEmpleados;
          }
}
