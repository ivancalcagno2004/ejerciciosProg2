package Prefi2022;

public class CalculadorLista implements Calculador {
          private int pos;

          public CalculadorLista(int pos) {
                    this.pos = pos;
          }

          @Override
          public String cumple(Grupo g) {
                    return g.getPClaves().get(pos);
          }
}
