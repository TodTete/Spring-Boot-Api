package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidacionConsultaAnticipacion {

    public void validar(DatosReservaConsulta datos) {
        var fechaConsulta = datos.fecha();
        var ahora = LocalDateTime.now();
        var diferenciaMinutos = Duration.between(ahora, fechaConsulta).toMinutes();
        if(diferenciaMinutos < 30){
            throw new ValidacionException("Horario seleccionado invalido");
        }
    }
}
