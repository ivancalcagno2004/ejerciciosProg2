package Bazar;

import java.util.ArrayList;

public class Combo extends ElementosBazar {
          private double descuento;
          private double descuentoTope;
          protected ArrayList<ElementosBazar> elementos;

          public Combo(double descuento, double descuentoTope) {
                    this.descuento = descuento;
                    this.descuentoTope = descuentoTope;
                    this.elementos = new ArrayList<ElementosBazar>();
          }

          @Override
          public ElementosBazar copia(Filtro f) {
                    ArrayList<ElementosBazar> hijosQueCumplen = new ArrayList<ElementosBazar>();
                    for (ElementosBazar e : this.elementos) {
                              ElementosBazar copiaHijo = e.copia(f);
                              if (copiaHijo != null) {
                                        hijosQueCumplen.add(copiaHijo);
                              }
                    }
                    if (hijosQueCumplen.size() > 0) {
                              Combo copiaCombo = new Combo(this.descuento, this.descuentoTope);
                              for (ElementosBazar e : hijosQueCumplen) {
                                        copiaCombo.addElemento(e);
                              }
                              return copiaCombo;
                    }
                    return null;
          }

          public void addElemento(ElementosBazar e) {
                    this.elementos.add(e);
          }

          @Override
          public ArrayList<ElementosBazar> buscar(Filtro f) {
                    ArrayList<ElementosBazar> temp = new ArrayList<ElementosBazar>();
                    if (f.cumple(this)) {
                              temp.add(this);
                    } else {
                              for (ElementosBazar e : this.elementos) {
                                        temp.addAll(e.buscar(f));
                              }
                    }
                    return temp;
          }

          @Override
          public int getCantidad() {
                    int cantidad = 0;
                    for (ElementosBazar e : this.elementos) {
                              cantidad += e.getCantidad();
                    }
                    return cantidad;
          }

          @Override
          public ArrayList<String> getListaDeCategorias() {
                    ArrayList<String> temp = new ArrayList<String>();
                    for (ElementosBazar e : this.elementos) {
                              ArrayList<String> categorias = e.getListaDeCategorias();
                              for (String categoria : categorias) {
                                        if (!temp.contains(categoria)) {
                                                  temp.add(categoria);
                                        }
                              }

                    }
                    return temp;
          }

          @Override
          public Elemento getMenorPeso() {
                    double menorPeso = Double.MAX_VALUE;
                    Elemento menorElemento = null;
                    for (ElementosBazar e : this.elementos) {
                              Elemento elemento = e.getMenorPeso();
                              double temp = e.getPeso();
                              if (temp < menorPeso || menorElemento == null) {
                                        menorPeso = temp;
                                        menorElemento = elemento;
                              }
                    }
                    return menorElemento;
          }

          @Override
          public double getPeso() {
                    double peso = 0;
                    for (ElementosBazar e : this.elementos) {
                              peso += e.getPeso();
                    }
                    return peso;
          }

          // crea un metodo que agregue un elemento al combo

          @Override
          public double getPrecio() {
                    double precioTotal = 0.0;

                    for (ElementosBazar elemento : this.elementos) {
                              precioTotal += elemento.getPrecio();
                    }

                    double descuento = this.descuento * this.getCantidad();
                    if (descuento > descuentoTope) {
                              descuento = descuentoTope;
                    }
                    return precioTotal - descuento * precioTotal;
          }

          public double getDescuento() {
                    return descuento;
          }

          public void setDescuento(double descuento) {
                    this.descuento = descuento;
          }

          public double getDescuentoTope() {
                    return descuentoTope;
          }

          public void setDescuentoTope(double descuentoTope) {
                    this.descuentoTope = descuentoTope;
          }

          public ArrayList<ElementosBazar> getElementos() {
                    return new ArrayList<ElementosBazar>(this.elementos);
          }

}
