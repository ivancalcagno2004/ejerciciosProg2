package Prefi2021Nico;

public class FiltroMeGusta implements Filtro {
          private int minCantMeGusta;

          public FiltroMeGusta(int minCantMeGusta) {
                    this.minCantMeGusta = minCantMeGusta;
          }

          @Override
          public boolean cumple(Video v) {
                    return v.getCantMeGusta() > this.minCantMeGusta;
          }

}
