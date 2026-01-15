package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Direccion {
  private  String calle;
  private  String numero;
  private  String Complemento;
  private  String barrio;
  private  String Codigo_postal;
  private  String ciudad;
  private  String estado;

    public Direccion(DatosDireccion direccion) {
      this.calle = direccion.calle();
      this.numero = direccion.numero();
      this.Complemento = direccion.Complemento();
      this.barrio = direccion.barrio();
      this.Codigo_postal = direccion.Codigo_postal();
      this.ciudad = direccion.ciudad();
      this.estado = direccion.estado();
    }

  public void actualizarDireccion(DatosDireccion datos) {
    if (datos == null) return;

    this.calle = valor(datos.calle(), this.calle);
    this.numero = valor(datos.numero(), this.numero);
    this.Complemento = valor(datos.Complemento(), this.Complemento);
    this.barrio = valor(datos.barrio(), this.barrio);
    this.Codigo_postal = valor(datos.Codigo_postal(), this.Codigo_postal);
    this.ciudad = valor(datos.ciudad(), this.ciudad);
    this.estado = valor(datos.estado(), this.estado);
  }

  private String valor(String nuevo, String actual) {
    return nuevo != null ? nuevo : actual;
  }

}
