package Prefi2022;

import java.util.ArrayList;

public class CalculadorPalabraLarga implements Calculador {

          @Override
          public String cumple(Grupo g) {
                    ArrayList<String> pClaves = g.getPClaves();
                    String masLarga = pClaves.get(0);
                    for (String pClave : pClaves) {
                              if (pClave.length() > masLarga.length()) {
                                        masLarga = pClave;
                              }
                    }
                    return masLarga;
          }

}
