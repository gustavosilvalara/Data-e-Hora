package br.com.alura.fusohorario;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    static void main() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeJapan = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String zoneDateTimeJapanFormatado = zonedDateTimeJapan.format(formato);

        System.out.println("Horário atual em Tóquio: " + zoneDateTimeJapanFormatado);
    }
}
