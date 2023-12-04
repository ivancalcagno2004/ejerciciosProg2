package Prefi2023;

import java.util.ArrayList;

public class TareaEspecializada extends TareaCompleja {
          private Filtro filtro;

          public TareaEspecializada(String nombre, Filtro filtro) {
                    super(nombre);
                    this.filtro = filtro;
          }

          @Override
          public ArrayList<ElementoEmpresa> buscar(Filtro f) {
                    return new ArrayList<ElementoEmpresa>();
          }

          @Override
          public void addElemento(ElementoEmpresa e) {
                    if (this.filtro.cumple(e)) {
                              super.addElemento(e);
                    }
          }

          public Filtro getFiltro() {
                    return filtro;
          }

          public void setFiltro(Filtro filtro) {
                    this.filtro = filtro;
          }

          @Override
          public TareaCompleja crearObjeto() {
                    return new TareaEspecializada(this.getNombre(), this.filtro);
          }

}
