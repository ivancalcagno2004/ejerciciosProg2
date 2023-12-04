package Prefi2023;

import java.util.ArrayList;

public abstract class ElementoEmpresa implements Comparable<ElementoEmpresa> {
          private String nombre;

          public ElementoEmpresa(String nombre) {
                    this.nombre = nombre;
          }

          public abstract int getCantidadEmpleados();

          public abstract int getTiempo();

          public abstract ArrayList<ElementoEmpresa> buscar(Filtro f);

          public abstract ElementoEmpresa getCopia();

          @Override
          public int compareTo(ElementoEmpresa o) {
                    int res = this.getNombre().compareTo(o.getNombre());
                    if (res == 0) {
                              return this.getCantidadEmpleados() - o.getCantidadEmpleados();
                    }
                    return res;
          }

          public String getNombre() {
                    return nombre;
          }

          public void setNombre(String nombre) {
                    this.nombre = nombre;
          }

}
