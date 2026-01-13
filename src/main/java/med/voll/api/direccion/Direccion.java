package med.voll.api.direccion;

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
}
