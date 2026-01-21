package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.stereotype.Component;

@Component
public class ValidarPaciente implements ValidadorConsulta{

    private PacienteRepository repository;

    public void validar(DatosReservaConsulta datos) {
        var pacienteActivo = repository.findActivoById(datos.idMedico());
        if(!pacienteActivo){
            throw new ValidacionException("Paciente no encontrado");
        }
    }
}
