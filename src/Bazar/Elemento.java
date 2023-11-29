package Bazar;

import java.util.ArrayList;

public class Elemento extends ElementosBazar {
          private ArrayList<String> categorias;
          private double peso;
          private double precio;

          public Elemento(double peso, double precio) {
                    this.categorias = new ArrayList<String>();
                    this.peso = peso;
                    this.precio = precio;
          }

          @Override
          public ArrayList<ElementosBazar> buscar(Filtro f) {
                    ArrayList<ElementosBazar> temp = new ArrayList<ElementosBazar>();
                    if (f.cumple(this)) {
                              temp.add(this);
                    }
                    return temp;
          }

          public void addCategoria(String categoria) {
                    this.categorias.add(categoria);
          }

          @Override
          public ElementosBazar copia(Filtro f) {
                    if (f.cumple(this)) {
                              Elemento copia = new Elemento(this.peso, this.precio);
                              for (String categoria : this.categorias) {
                                        copia.addCategoria(categoria);
                              }
                              return copia;
                    }
                    return null;
          }

          @Override
          public int getCantidad() {
                    return 1;
          }

          @Override
          public ArrayList<String> getListaDeCategorias() {
                    return new ArrayList<String>(categorias);
          }

          @Override
          public Elemento getMenorPeso() {
                    return this;
          }

          @Override
          public double getPeso() {
                    return this.peso;
          }

          @Override
          public double getPrecio() {
                    return this.precio;
          }

          public void setPeso(double peso) {
                    this.peso = peso;
          }

          public void setPrecio(double precio) {
                    this.precio = precio;
          }

}
