package Prefi2021Nico;

import java.util.ArrayList;

public abstract class ElementoSitio {
          private String titulo;

          public ElementoSitio(String titulo) {
                    this.titulo = titulo;
          }

          public String getTitulo() {
                    return titulo;
          }

          public void setTitulo(String titulo) {
                    this.titulo = titulo;
          }

          public abstract ArrayList<Video> buscar(Filtro f);

          public abstract int getCantidad();

          public abstract int getDuracion();

          public abstract ArrayList<String> getPClaves();

}
