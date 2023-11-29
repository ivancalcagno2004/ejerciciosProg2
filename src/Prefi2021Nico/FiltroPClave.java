package Prefi2021Nico;

public class FiltroPClave implements Filtro {
          private String pClave;

          public FiltroPClave(String pClave) {
                    this.pClave = pClave;
          }

          @Override
          public boolean cumple(Video v) {
                    return v.getPClaves().contains(this.pClave);
          }

}
