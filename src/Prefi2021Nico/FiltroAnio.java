package Prefi2021Nico;

public class FiltroAnio implements Filtro {
          private int anioVideo;

          public FiltroAnio(int anioVideo) {
                    this.anioVideo = anioVideo;
          }

          @Override
          public boolean cumple(Video v) {
                    return v.getAnioPublicacion() == anioVideo;
          }

}
