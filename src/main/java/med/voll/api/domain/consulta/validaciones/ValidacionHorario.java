package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;

import java.time.DayOfWeek;

public class ValidacionHorario {

    public void validar(DatosReservaConsulta datos){
        var fechaConsulta = datos.fecha();
        var domingo = fechaConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var horarioApertura = fechaConsulta.getHour() < 7;
        var horarioCierre = fechaConsulta.getHour() >= 18;
        if (domingo || horarioCierre || horarioApertura){
            throw new ValidacionException("Horario seleccionado fuera del rango");
        }
    }
}
