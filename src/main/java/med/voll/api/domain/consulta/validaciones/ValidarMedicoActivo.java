package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.medico.MedicoRepository;

public class ValidarMedicoActivo {

    private MedicoRepository repository;

    public void validar(DatosReservaConsulta datos){
        if(datos.idMedico() == null){
            return;
        }

        var medicoEstaActivo = repository.findActivoById(datos.idMedico());
        if(!medicoEstaActivo) {
            throw new ValidacionException("Comsulta no puede ser reservada");
        }
    }
}
