package br.com.alura.calculandodatadeentrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class CalculoDataDeEntrega {
    static void main() {
        LocalDate data = LocalDate.of(2025, 3, 15);
        int prazo = 15;
        LocalDate adicionadoData = data.plusDays(prazo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = adicionadoData.format(formatter);

        System.out.println("Data de entrega: " + dataFormatada);
    }
}
