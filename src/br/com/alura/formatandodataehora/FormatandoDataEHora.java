package br.com.alura.formatandodataehora;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDataEHora {
    static void main() {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");

        IO.println("Data formatada: " + data.format(formatterDate));
        IO.println("Hora formatada: " + hora.format(formatterTime));
    }
}
