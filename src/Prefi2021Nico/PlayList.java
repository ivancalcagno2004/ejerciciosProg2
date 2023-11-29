package Prefi2021Nico;

import java.util.ArrayList;
import java.util.Collections;

public class PlayList extends ElementoSitio {
          private ArrayList<ElementoSitio> conjuntoElementos;
          private int extraDuracion;

          public PlayList(String titulo, int extraDuracion) {
                    super(titulo);
                    this.extraDuracion = extraDuracion;
                    this.conjuntoElementos = new ArrayList<ElementoSitio>();
          }

          @Override
          public ArrayList<Video> buscar(Filtro f) {
                    ArrayList<Video> temp = new ArrayList<Video>();
                    for (ElementoSitio e : conjuntoElementos) {
                              temp.addAll(e.buscar(f));
                    }
                    Collections.sort(temp);
                    return temp;
          }

          @Override
          public int getCantidad() {
                    int suma = 0;
                    for (ElementoSitio e : conjuntoElementos) {
                              suma += e.getCantidad();
                    }
                    return suma;
          }

          @Override
          public int getDuracion() {
                    int duracion = 0;
                    for (ElementoSitio e : conjuntoElementos) {
                              duracion += e.getDuracion();
                    }
                    return duracion + extraDuracion;
          }

          @Override
          public ArrayList<String> getPClaves() {
                    ArrayList<String> temp = new ArrayList<String>();
                    for (ElementoSitio e : this.conjuntoElementos) {
                              ArrayList<String> elementoHijo = e.getPClaves();
                              for (String p : elementoHijo) {
                                        if (!temp.contains(p)) {
                                                  temp.add(p);
                                        }
                              }
                    }
                    return temp;
          }

}
