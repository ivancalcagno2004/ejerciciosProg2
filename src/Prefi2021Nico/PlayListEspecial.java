package Prefi2021Nico;

import java.util.ArrayList;

public class PlayListEspecial extends PlayList {
          private Video video;

          public PlayListEspecial(String titulo, int extraDuracion, Video video) {
                    super(titulo, extraDuracion);
                    this.video = video;
          }

          public Video getVideo() {
                    return video;
          }

          public void setVideo(Video video) {
                    this.video = video;
          }

          @Override
          public ArrayList<Video> buscar(Filtro f) {
                    ArrayList<Video> res = new ArrayList<Video>();
                    res.add(0, this.video);
                    res.addAll(super.buscar(f));
                    return res;
          }
}
