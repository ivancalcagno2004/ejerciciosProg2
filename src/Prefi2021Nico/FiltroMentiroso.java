package Prefi2021Nico;

public class FiltroMentiroso extends FiltroPClave {

          public FiltroMentiroso(String pClave) {
                    super(pClave);
          }

          @Override
          public boolean cumple(Video v) {
                    return true;
          }
}
