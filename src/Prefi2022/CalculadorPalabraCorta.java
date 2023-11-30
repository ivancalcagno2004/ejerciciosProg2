package Prefi2022;

import java.util.ArrayList;

public class CalculadorPalabraCorta implements Calculador {

          @Override
          public String cumple(Grupo g) {
                    ArrayList<String> pClaves = g.getPClaves();
                    String masCorta = pClaves.get(0);
                    for (String pClave : pClaves) {
                              if (pClave.length() < masCorta.length()) {
                                        masCorta = pClave;
                              }
                    }
                    return masCorta;
          }

}
