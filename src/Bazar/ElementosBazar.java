package Bazar;

import java.util.ArrayList;

public abstract class ElementosBazar {
          public abstract double getPrecio();

          public abstract double getPeso();

          public abstract ArrayList<String> getListaDeCategorias();

          public abstract int getCantidad();

          public abstract Elemento getMenorPeso();

          public abstract ArrayList<ElementosBazar> buscar(Filtro f);

          public abstract ElementosBazar copia(Filtro f);
}
