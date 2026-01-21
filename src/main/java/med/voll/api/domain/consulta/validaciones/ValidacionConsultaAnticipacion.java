package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidacionConsultaAnticipacion implements ValidadorConsulta{

    public void validar(DatosReservaConsulta datos) {
        var fechaConsulta = datos.fecha();
        var ahora = LocalDateTime.now();
        var diferenciaMinutos = Duration.between(ahora, fechaConsulta).toMinutes();
        if(diferenciaMinutos < 30){
            throw new ValidacionException("Horario seleccionado invalido");
        }
    }
}
