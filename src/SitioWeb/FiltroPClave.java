package SitioWeb;

public class FiltroPClave implements Filtro {
          private String pClave;

          public FiltroPClave(String pClave) {
                    this.pClave = pClave;
          }

          @Override
          public boolean cumple(Noticia n) {
                    return n.getpClaves().contains(pClave);
          }

}
