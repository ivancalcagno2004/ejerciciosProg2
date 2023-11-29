package SitioWeb;

import java.util.ArrayList;

public abstract class ElementoSitio {
          public abstract int getCantidad();

          public abstract ElementoSitio getCopia(Filtro f);

          public abstract ArrayList<ElementoSitio> buscar(Filtro f);

}
