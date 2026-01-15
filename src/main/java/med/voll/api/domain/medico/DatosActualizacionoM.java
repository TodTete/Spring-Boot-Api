package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosActualizacionoM(
        @NotNull long id,
        String nombre,
        String telefono,
        DatosDireccion direccion) {
}
