package Prefi2022;

import java.util.ArrayList;

public class Grupo extends ElementoSitio {
          private ArrayList<ElementoSitio> elementos;
          private int elementoParaCategoria;

          public Grupo(String titulo, String editor, int elementoParaCategoria) {
                    super(titulo, editor);
                    this.elementoParaCategoria = elementoParaCategoria;
          }

          @Override
          public ArrayList<String> getPClaves() {
                    ArrayList<String> res = new ArrayList<String>();
                    for (ElementoSitio e : this.elementos) {
                              ArrayList<String> pClaves = e.getPClaves();
                              for (String pClave : pClaves) {
                                        if (!res.contains(pClave)) {
                                                  res.add(pClave);
                                        }
                              }
                    }
                    return res;
          }

          @Override
          public String getCategoria() {
                    if (!this.elementos.isEmpty()) {
                              return this.elementos.get(this.elementoParaCategoria).getCategoria();
                    }
                    return null;
          }

          @Override
          public ArrayList<String> getContenido() {
                    ArrayList<String> res = new ArrayList<String>();
                    for (ElementoSitio e : this.elementos) {
                              res.addAll(e.getContenido());
                    }
                    return res;
          }

          @Override
          public int buscar(Filtro f) {
                    int contador = 0;
                    if (f.cumple(this)) {
                              return contador++;
                    } else {
                              for (ElementoSitio e : elementos) {
                                        contador += e.buscar(f);
                              }
                              return contador;
                    }
          }

          public int getElementoParaCategoria() {
                    return elementoParaCategoria;
          }

          public void setElementoParaCategoria(int elementoParaCategoria) {
                    this.elementoParaCategoria = elementoParaCategoria;
          }

}
