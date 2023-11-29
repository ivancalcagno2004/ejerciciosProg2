package Prefi2022;

import java.util.ArrayList;

/* Falta hacer el calculador */
public abstract class ElementoSitio {
          private String titulo, editor;

          public ElementoSitio(String titulo, String editor) {
                    this.titulo = titulo;
                    this.editor = editor;
          }

          public abstract ArrayList<String> getPClaves();

          public abstract ArrayList<String> getContenido();

          public abstract String getCategoria();

          public abstract int buscar(Filtro f);

          public String getTitulo() {
                    return titulo;
          }

          public void setTitulo(String titulo) {
                    this.titulo = titulo;
          }

          public String getEditor() {
                    return editor;
          }

          public void setEditor(String editor) {
                    this.editor = editor;
          }

}
