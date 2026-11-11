package br.com.alura.convertendohorario;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertendoHorario {
    static void main() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeSydney = zonedDateTime.
                withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        String zonedDateTimeformatado = zonedDateTime.format(formato);
        String zonedDateTimeSydneyFormatado = zonedDateTimeSydney.format(formato);

        System.out.println("Horário atual no sistema: " + zonedDateTimeformatado);
        System.out.println("Horário atual em Sydney: " + zonedDateTimeSydneyFormatado);
    }
}
