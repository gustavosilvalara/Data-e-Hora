package br.com.alura.VerificandoData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificandoDataEvento {
    static void main() {
        LocalDate dataDoEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataAtual = LocalDate.of(2025, 3, 15);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String datadoEventoFromatada = dataDoEvento.format(formato);
        String datadoAtualFromatada = dataAtual.format(formato);

        System.out.println("Data do evento: " + datadoEventoFromatada);
        System.out.println("Data atual: " + datadoAtualFromatada);

        if (dataDoEvento.isBefore(dataAtual)){
            System.out.println("O evento já ocorreu.");
        }else {
            System.out.println("O evento ainda não ocorreu.");
        }
    }
}
