package Prefi2021Nico;

import java.util.ArrayList;

public class Video extends ElementoSitio implements Comparable<Video> {
          private Usuario usuario;
          private int duracion;
          private int visualizaciones;
          private int anioPublicacion;
          private int cantMeGusta;
          private int cantNoMeGusta;
          private ArrayList<String> pClaves;

          public Video(String titulo, Usuario usuario, int duracion, int visualizaciones, int anioPublicacion,
                              int cantMeGusta, int cantNoMeGusta) {
                    super(titulo);
                    this.usuario = usuario;
                    this.duracion = duracion;
                    this.visualizaciones = visualizaciones;
                    this.anioPublicacion = anioPublicacion;
                    this.cantMeGusta = cantMeGusta;
                    this.cantNoMeGusta = cantNoMeGusta;
                    this.pClaves = new ArrayList<String>();
          }

          @Override
          public ArrayList<Video> buscar(Filtro f) {
                    ArrayList<Video> temp = new ArrayList<Video>();
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
          public ArrayList<String> getPClaves() {
                    return new ArrayList<String>(pClaves);
          }

          @Override
          public int getDuracion() {
                    return duracion;
          }

          public void addPClave(String nuevo) {
                    if (!pClaves.contains(nuevo)) {
                              pClaves.add(nuevo);
                    }
          }

          public Usuario getUsuario() {
                    return usuario;
          }

          public void setUsuario(Usuario usuario) {
                    this.usuario = usuario;
          }

          public void setDuracion(int duracion) {
                    this.duracion = duracion;
          }

          public int getVisualizaciones() {
                    return visualizaciones;
          }

          public void setVisualizaciones(int visualizaciones) {
                    this.visualizaciones = visualizaciones;
          }

          public int getAnioPublicacion() {
                    return anioPublicacion;
          }

          public void setAnioPublicacion(int anioPublicacion) {
                    this.anioPublicacion = anioPublicacion;
          }

          public int getCantMeGusta() {
                    return cantMeGusta;
          }

          public void setCantMeGusta(int cantMeGusta) {
                    this.cantMeGusta = cantMeGusta;
          }

          public int getCantNoMeGusta() {
                    return cantNoMeGusta;
          }

          public void setCantNoMeGusta(int cantNoMeGusta) {
                    this.cantNoMeGusta = cantNoMeGusta;
          }

          @Override
          public int compareTo(Video o) {
                    int temp = this.usuario.getNombre().compareTo(o.getUsuario().getNombre());
                    if (temp == 0) {
                              return this.usuario.getEmail().compareTo(o.getUsuario().getEmail());
                    }
                    return temp;
          }

}