package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.stereotype.Component;

@Component
public class ValidarMedicoConOtraConsulta implements ValidadorConsulta{

    private ConsultaRepository repository;

    public void validar(DatosReservaConsulta datos){
        var medicoTieneOtraConsulta = repository.existsByMedicoIdAndFecha(datos.idMedico(), datos.fecha());
        if(medicoTieneOtraConsulta){
            throw new ValidacionException("Este medico ya tiene una consulta");
        }
    }
}
