package Prefi2022;

import java.util.ArrayList;

public class Noticia extends ElementoSitio {
          private ArrayList<String> pClaves;
          private String contenido, categoria;

          public Noticia(String titulo, String editor, String contenido, String categoria) {
                    super(titulo, editor);
                    this.contenido = contenido;
                    this.categoria = categoria;
                    this.pClaves = new ArrayList<String>();
          }

          @Override
          public ArrayList<String> getPClaves() {
                    return new ArrayList<String>(this.pClaves);
          }

          @Override
          public String getCategoria() {
                    return categoria;
          }

          public void addPClave(String nueva) {
                    if (!this.pClaves.contains(nueva)) {
                              this.pClaves.add(nueva);
                    }
          }

          @Override
          public ArrayList<String> getContenido() {
                    ArrayList<String> res = new ArrayList<String>();
                    res.add(this.contenido);
                    return res;
          }

          @Override
          public int buscar(Filtro f) {
                    if (f.cumple(this)) {
                              return 1;
                    }
                    return 0;
          }

          public void setContenido(String contenido) {
                    this.contenido = contenido;
          }

          public void setCategoria(String categoria) {
                    this.categoria = categoria;
          }

}
