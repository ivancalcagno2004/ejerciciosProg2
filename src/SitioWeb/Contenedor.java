package SitioWeb;

import java.util.ArrayList;

public class Contenedor extends ElementoSitio {
          private String descripcion;
          private String img;
          private ArrayList<ElementoSitio> elementos;

          public Contenedor(String descripcion, String img) {
                    this.descripcion = descripcion;
                    this.img = img;
                    this.elementos = new ArrayList<ElementoSitio>(elementos);
          }

          @Override
          public ArrayList<ElementoSitio> buscar(Filtro f) {
                    ArrayList<ElementoSitio> temp = new ArrayList<ElementoSitio>();
                    for (ElementoSitio elemento : elementos) {
                              temp.addAll(elemento.buscar(f));
                    }
                    return temp;
          }

          @Override
          public int getCantidad() {
                    int cantidad = 0;
                    for (ElementoSitio elemento : elementos) {
                              cantidad += elemento.getCantidad();
                    }
                    return cantidad;
          }

          public void addElementoNoticia(ElementoSitio e) {
                    elementos.add(e);
          }

          @Override
          public ElementoSitio getCopia(Filtro f) {
                    ArrayList<ElementoSitio> res = new ArrayList<ElementoSitio>();
                    for (ElementoSitio elemento : elementos) {
                              ElementoSitio copia = elemento.getCopia(f);
                              if (copia != null) {
                                        res.add(elemento);
                              }
                    }
                    if (res.size() > 0) {
                              Contenedor copiaContenedor = new Contenedor(this.descripcion, this.img);
                              for (ElementoSitio elemento : res) {
                                        copiaContenedor.addElementoNoticia(elemento);
                              }
                              return copiaContenedor;
                    }
                    return null;
          }

          public String getDescripcion() {
                    return descripcion;
          }

          public void setDescripcion(String descripcion) {
                    this.descripcion = descripcion;
          }

          public String getImg() {
                    return img;
          }

          public void setImg(String img) {
                    this.img = img;
          }

          public ArrayList<ElementoSitio> getElementos() {
                    return new ArrayList<ElementoSitio>(elementos);
          }

}
