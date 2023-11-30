package Prefi2022;

public class CalculadorListaOrdenada implements Calculador {
          private int pos;

          public CalculadorListaOrdenada(int pos) {
                    this.pos = pos;
          }

          @Override
          public String cumple(Grupo g) {
                    return g.getPClavesOrdenadas().get(pos);
          }
}
