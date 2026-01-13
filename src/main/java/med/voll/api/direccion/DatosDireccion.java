package med.voll.api.direccion;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DatosDireccion(
       @NotBlank String calle,
        String numero,
        String Complemento,
        @NotBlank String barrio,
        @NotBlank @Pattern(regexp = "\\d{4}") String Codigo_postal,
        @NotBlank String ciudad,
        @NotBlank String estado) {
}
