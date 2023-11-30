package Prefi2022;

import java.util.ArrayList;
import java.util.Collections;

public class Grupo extends ElementoSitio {
          private ArrayList<ElementoSitio> elementos;
          private int elementoParaCategoria;

          public Grupo(String titulo, String editor, int elementoParaCategoria) {
                    this(titulo, editor);
                    this.elementoParaCategoria = elementoParaCategoria;
          }

          public Grupo(String titulo, String editor) {
                    super(titulo, editor);
                    this.elementoParaCategoria = 0;
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

          public ArrayList<String> getPClavesOrdenadas() {
                    ArrayList<String> res = this.getPClaves();
                    Collections.sort(res);
                    return res;
          }

          @Override
          public String getCategoria() {
                    if (!this.elementos.isEmpty()) {
                              if (this.elementos.get(this.elementoParaCategoria) != null) {
                                        return this.elementos.get(this.elementoParaCategoria).getCategoria();
                              } else {
                                        return null;
                              }
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

          public String calcularPClave(Calculador c) {
                    String res = null;
                    if (c.cumple(this) != null) {
                              res = c.cumple(this);
                    }
                    return res;
          }

          public int getElementoParaCategoria() {
                    return elementoParaCategoria;
          }

          public void setElementoParaCategoria(int elementoParaCategoria) {
                    this.elementoParaCategoria = elementoParaCategoria;
          }

}
