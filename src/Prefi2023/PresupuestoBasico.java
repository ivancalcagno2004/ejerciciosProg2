package Prefi2023;

import java.util.ArrayList;

public class PresupuestoBasico extends ElementoEmpresa {
          private int cantidadEmpleados, tiempo, costo;

          public PresupuestoBasico(String nombre, int cantidadEmpleados, int tiempo, int costo) {
                    super(nombre);
                    this.cantidadEmpleados = cantidadEmpleados;
                    this.tiempo = tiempo;
                    this.costo = costo;
          }

          @Override
          public ArrayList<ElementoEmpresa> buscar(Filtro f) {
                    ArrayList<ElementoEmpresa> res = new ArrayList<ElementoEmpresa>();
                    if (f.cumple(this)) {
                              res.add(this);
                    }
                    return res;
          }

          @Override
          public ElementoEmpresa getCopia() {
                    return new PresupuestoBasico(this.getNombre(), this.getCantidadEmpleados(), this.getTiempo(),
                                        this.getCosto());
          }

          public int getCantidadEmpleados() {
                    return cantidadEmpleados;
          }

          public void setCantidadEmpleados(int cantidadEmpleados) {
                    this.cantidadEmpleados = cantidadEmpleados;
          }

          public int getTiempo() {
                    return tiempo;
          }

          public void setTiempo(int tiempo) {
                    this.tiempo = tiempo;
          }

          public int getCosto() {
                    return costo;
          }

          public void setCosto(int costo) {
                    this.costo = costo;
          }

}
