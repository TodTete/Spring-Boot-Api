package med.voll.api.direccion;

import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {
  private  String calle;
  private  String numero;
  private  String Complemento;
  private  String barrio;
  private  String Codigo_postal;
  private  String ciudad;
  private  String estado;
}
