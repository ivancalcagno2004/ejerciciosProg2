package Prefi2021Nico;

public class Usuario {
          private String nombre;
          private int anioRegistro;
          private String email;

          public Usuario(String nombre, int anioRegistro, String email) {
                    this.nombre = nombre;
                    this.anioRegistro = anioRegistro;
                    this.email = email;
          }

          public String getNombre() {
                    return nombre;
          }

          public void setNombre(String nombre) {
                    this.nombre = nombre;
          }

          public int getAnioRegistro() {
                    return anioRegistro;
          }

          public void setAnioRegistro(int anioRegistro) {
                    this.anioRegistro = anioRegistro;
          }

          public String getEmail() {
                    return email;
          }

          public void setEmail(String email) {
                    this.email = email;
          }

}
