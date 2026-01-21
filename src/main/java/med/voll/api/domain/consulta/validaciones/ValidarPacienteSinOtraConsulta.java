package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.stereotype.Component;

@Component
public class ValidarPacienteSinOtraConsulta implements ValidadorConsulta{

    private ConsultaRepository repository;

    public void validar(DatosReservaConsulta datos){
        var primerHorario = datos.fecha().withHour(7);
        var ultimoHorario = datos.fecha().withHour(18);
        var pacienteTieneOtraConsulta = repository.existsByPacienteelIdAndDataBetween(datos.idPaciente(), primerHorario, ultimoHorario);
        if(pacienteTieneOtraConsulta){
            throw new ValidacionException("Paciente ya tiene consulta");
        }
    }
}
