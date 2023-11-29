package SitioWeb;

public class TextoMinimo implements Filtro {
          private int minTexto;

          public TextoMinimo(int minTexto) {
                    this.minTexto = minTexto;
          }

          @Override
          public boolean cumple(Noticia n) {
                    return n.getTexto().length() > minTexto;
          }

}
