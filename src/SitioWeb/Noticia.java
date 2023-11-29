package SitioWeb;

import java.util.ArrayList;

public class Noticia extends ElementoSitio {
          private String titulo;
          private ArrayList<String> pClaves;
          private String intro;
          private String texto;
          private String autor;
          private String link;

          public Noticia(String titulo, String intro, String texto, String autor, String link) {
                    this.titulo = titulo;
                    this.intro = intro;
                    this.texto = texto;
                    this.autor = autor;
                    this.link = link;
                    this.pClaves = new ArrayList<String>();
          }

          @Override
          public ArrayList<ElementoSitio> buscar(Filtro f) {
                    ArrayList<ElementoSitio> temp = new ArrayList<ElementoSitio>();
                    if (f.cumple(this)) {
                              temp.add(this);
                    }
                    return temp;
          }

          @Override
          public int getCantidad() {
                    return 1;
          }

          @Override
          public ElementoSitio getCopia(Filtro f) {
                    if (f.cumple(this)) {
                              Noticia copia = new Noticia(this.titulo, this.intro, this.texto, this.autor,
                                                  this.link);
                              for (String pClave : pClaves) {
                                        copia.addPClave(pClave);
                              }
                              return copia;
                    }

                    return null;
          }

          public void addPClave(String pClave) {
                    pClaves.add(pClave);
          }

          public String getTitulo() {
                    return titulo;
          }

          public void setTitulo(String titulo) {
                    this.titulo = titulo;
          }

          public ArrayList<String> getpClaves() {
                    return new ArrayList<String>(pClaves);
          }

          public String getIntro() {
                    return intro;
          }

          public void setIntro(String intro) {
                    this.intro = intro;
          }

          public String getTexto() {
                    return texto;
          }

          public void setTexto(String texto) {
                    this.texto = texto;
          }

          public String getAutor() {
                    return autor;
          }

          public void setAutor(String autor) {
                    this.autor = autor;
          }

          public String getLink() {
                    return link;
          }

          public void setLink(String link) {
                    this.link = link;
          }

}
