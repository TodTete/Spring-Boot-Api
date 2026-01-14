package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosActualizacionoM(long id, String nombre, String telefono, DatosDireccion direccion) {

}
