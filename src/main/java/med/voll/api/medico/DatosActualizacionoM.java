package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.direccion.DatosDireccion;

public record DatosActualizacionoM(
        @NotNull long id,
        String nombre,
        String telefono,
        DatosDireccion direccion) {

}
