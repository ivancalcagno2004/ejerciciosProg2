package Prefi2023;

import java.util.ArrayList;
import java.util.Collections;

public class TareaCompleja extends ElementoEmpresa {
          protected ArrayList<ElementoEmpresa> elementos;

          public TareaCompleja(String nombre) {
                    super(nombre);
                    this.elementos = new ArrayList<ElementoEmpresa>();
          }

          public void addElemento(ElementoEmpresa e) {
                    this.elementos.add(e);
          }

          @Override
          public ElementoEmpresa getCopia() {
                    ArrayList<ElementoEmpresa> copiaElementos = new ArrayList<ElementoEmpresa>();
                    for (ElementoEmpresa e : this.elementos) {
                              copiaElementos.add(e.getCopia());
                    }
                    TareaCompleja copia = this.crearObjeto();
                    for (ElementoEmpresa e : copiaElementos) {
                              copia.addElemento(e);
                    }
                    return copia;
          }

          public TareaCompleja crearObjeto() {
                    return new TareaCompleja(this.getNombre());
          }

          @Override
          public ArrayList<ElementoEmpresa> buscar(Filtro f) {
                    ArrayList<ElementoEmpresa> res = new ArrayList<ElementoEmpresa>();
                    if (f.cumple(this)) {
                              res.add(this);
                    } else {
                              for (ElementoEmpresa e : this.elementos) {
                                        res.addAll(e.buscar(f));
                              }
                    }
                    Collections.sort(res);
                    return res;
          }

          @Override
          public int getCantidadEmpleados() {
                    int mayorNumero = 0;
                    for (ElementoEmpresa e : this.elementos) {
                              if (e.getCantidadEmpleados() > mayorNumero) {
                                        mayorNumero = e.getCantidadEmpleados();
                              }
                    }
                    return mayorNumero;
          }

          @Override
          public int getTiempo() {
                    int res = 0;
                    for (ElementoEmpresa e : this.elementos) {
                              res += e.getTiempo();
                    }
                    return res;
          }

}
