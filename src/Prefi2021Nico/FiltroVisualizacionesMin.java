package Prefi2021Nico;

public class FiltroVisualizacionesMin implements Filtro {
          private int minVisualizaciones;

          public FiltroVisualizacionesMin(int minVisualizaciones) {
                    this.minVisualizaciones = minVisualizaciones;
          }

          @Override
          public boolean cumple(Video v) {
                    return v.getVisualizaciones() > minVisualizaciones;
          }

}
